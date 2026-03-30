import java.io.*;
import java.net.*;
import java.util.Set;
import java.util.concurrent.*;


public class ChatServer {
    private static final int PORT = 8080;

    private static Set<PrintWriter> clientWriters = ConcurrentHashMap.newKeySet();

    private static void broadcast(String message) {
        for (PrintWriter writer : clientWriters) {
            writer.println(message);
        }
    }

    private static class ClientHandler implements Runnable {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }


        @Override
        public void run() {
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                clientWriters.add(out);

                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("Received: " + message);
                    broadcast(message);
                }
            } catch (Exception e) {
                System.out.println("Client disconnected unexpectedly.");
            } finally {
                if (out != null) {
                    clientWriters.remove(out);
                } 
                try {
                    socket.close();
                } catch (IOException e) {
                    System.out.println("IOException");
                }
                System.out.println("A client has left the chat.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Chat Server is running on port " + PORT);

        ExecutorService pool = Executors.newFixedThreadPool(10);

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket clienSocket = serverSocket.accept();
                System.out.println("New client connected: " + clienSocket.getInetAddress().getHostAddress());
                
                pool.execute(new ClientHandler(clienSocket));
            }
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}