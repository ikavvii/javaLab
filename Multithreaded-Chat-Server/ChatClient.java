import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    // private static final String SERVER_ADDRESS = "127.0.0.1";

    private static final int SERVER_PORT = 8080;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Server IP (Press Enter for localhost): ");
        String SERVER_ADDRESS = scanner.nextLine();
        if (SERVER_ADDRESS.trim().isEmpty()) {
            SERVER_ADDRESS = "127.0.0.1"; 
        }

        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT) ) {
            System.out.println("Connected to the chat server at " + SERVER_ADDRESS);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Thread receiveThread = new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = in.readLine()) != null) {
                        System.out.println("\n" + serverMessage);
                    }
                } catch (IOException e) {
                    System.out.println("Disconnected from server.");
                }
            });

            receiveThread.start();

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Enter your username: ");
            String username = scanner.nextLine();

            System.out.println("You can start typing messages now. Type 'exit' to quit.");

            while (true) {
                String message = scanner.nextLine();
                // \033[1A moves the cursor UP one line
                // \033[2K clears that entire line
                System.out.print("\033[1A\033[2K");
                if (message.equalsIgnoreCase("exit")) {
                    scanner.close();
                    break;
                }
                out.println(username + ": " + message);
            }
        } catch (IOException e) {
            System.err.println("Could not connect to server: " + e.getMessage());
        }
    }
}
