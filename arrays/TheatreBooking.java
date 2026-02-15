import java.util.Scanner;

class TheatreBooking {
    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        int[][] seats; 

        System.out.print("Enter number of screens: ");
        int numScreens = scan.nextInt();
        seats = new int[numScreens][]; 

        for (int i = 0; i < numScreens; i++) {
            System.out.print("Enter seats for Screen " + (i + 1) + ": ");
            int numSeats = scan.nextInt();
            seats[i] = new int[numSeats];
        }

        printLayout(seats);
        System.out.println("Available Seats: " + countAvailable(seats));

        bookSeat(seats, 0, 1); 
        bookSeat(seats, 1, 4); 
        bookSeat(seats, 0, 1);
        bookSeat(seats, 0, 5); 

        printLayout(seats);
        System.out.println("Total Available Seats: " + countAvailable(seats));
        
        scan.close();
    }

    public static void bookSeat(int[][] seats, int screen, int seatIndex) {
        if (screen < 0 || screen >= seats.length || seatIndex < 0 || seatIndex >= seats[screen].length) {
            System.out.println("Error: Invalid seat selection (" + screen + "," + seatIndex + ").");
            return;
        }

        if (seats[screen][seatIndex] == 1) {
            System.out.println("Screen " + (screen + 1) + " Seat " + (seatIndex + 1) + " is already booked.");
        } else {
            seats[screen][seatIndex] = 1; 
            System.out.println("Success: Booked Screen " + (screen + 1) + " Seat " + (seatIndex + 1));
        }
    }

    public static int countAvailable(int[][] seats) {
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void printLayout(int[][] seats) {
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Screen " + (i + 1) + ": ");
            for (int val : seats[i]) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}