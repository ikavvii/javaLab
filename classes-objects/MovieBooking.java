class MovieBooking {
    private String customerName;
    private String movieName;
    private StringBuilder seatDetails;
    static String[][] seatNumbers = new String[26][40];

    MovieBooking(String customerName, String movieName) {
        this.customerName = customerName;
        this.movieName = movieName;
        seatDetails = new StringBuilder();
    }

    void bookSeat(String seatNumber) {
        String[] parts = seatNumber.split("-");
        int row = parts[0].charAt(0) - 'A';
        int col = Integer.parseInt(parts[1]) - 1;

        if (seatNumbers[row][col] == null) {
            seatNumbers[row][col] = customerName;
            seatDetails.append(seatNumber).append(" ");
            System.out.println("Seat " + seatNumber + " booked successfully for " + customerName);
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
        }
    }

    void bookingSummary() {
        System.out.println("Booking Summary for " + customerName + ":");
        System.out.println("Movie: " + movieName);
        System.out.println("Seats Booked: " + (seatDetails.length() == 0 ? "None" : seatDetails.toString()));
    }

    public static void main(String[] args) {
        MovieBooking booking1 = new MovieBooking("Alice", "Inception");
        booking1.bookSeat("A-1");
        booking1.bookSeat("B-2");
        booking1.bookingSummary();

        MovieBooking booking2 = new MovieBooking("Kavin", "Inception");
        booking2.bookSeat("A-1");
        booking2.bookingSummary();
        
        MovieBooking booking3 = new MovieBooking("Bob", "Inception");
        booking3.bookSeat("A-2");
        booking3.bookingSummary();
    }
}