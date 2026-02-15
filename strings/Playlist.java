import java.util.Scanner;

class Playlist {
    public static void main(String[] args) {
        String[] songs = {"A", "B", "C"};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter song to search: ");
        String search = sc.next();
        
        boolean found = false;
        
        for (int i = 0; i < songs.length; i++) {
            if (songs[i].equals(search)) {
                System.out.println("Found at position " + (i + 1));
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Song not found.");
        }
        sc.close();
    }
}