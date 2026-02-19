import java.util.Arrays;

public class TravelPlanner {

    private static int totalTripsPlanned = 0;
    private static double totalAgencyRevenue = 0.0;

    private int tripId;
    private String travelerName;
    private StringBuilder tripNotes;
    private String[] destinations; 
    private double[] expenses;   


    public TravelPlanner() {
        this.tripId = ++totalTripsPlanned;
        this.travelerName = "Unknown Traveler";
        this.tripNotes = new StringBuilder("No notes provided.");
        this.destinations = new String[0];
        this.expenses = new double[0];
    }

    public TravelPlanner(String travelerName, String tripNotes, String[] destinations, double[] expenses) {
        this.tripId = ++totalTripsPlanned;
        this.travelerName = travelerName;
        this.tripNotes = new StringBuilder(tripNotes);
        this.destinations = Arrays.copyOf(destinations, destinations.length);
        this.expenses = Arrays.copyOf(expenses, expenses.length);
        
        updateAgencyRevenue(calculateTotalExpenses());
    }

    public TravelPlanner(TravelPlanner other) {
        this.tripId = ++totalTripsPlanned;
        this.travelerName = other.travelerName + " (Copied Plan)";
        this.tripNotes = new StringBuilder(other.tripNotes.toString());
        
        this.destinations = Arrays.copyOf(other.destinations, other.destinations.length);
        this.expenses = Arrays.copyOf(other.expenses, other.expenses.length);
        
        updateAgencyRevenue(calculateTotalExpenses());
    }

    public void appendTripNote(String newNote) {
        if (newNote != null && !newNote.isEmpty()) {
            this.tripNotes.append("\nUpdate: ").append(newNote);
        }
    }

    public double calculateTotalExpenses() {
        double total = 0.0;
        for (double cost : this.expenses) {
            total += cost;
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------------------------------------------------\n");
        sb.append("Trip ID:         ").append(this.tripId).append("\n");
        sb.append("Traveler Name:   ").append(this.travelerName).append("\n");
        sb.append("Itinerary:       ").append(Arrays.toString(this.destinations)).append("\n");
        sb.append("Total Est. Cost: $").append(String.format("%.2f", calculateTotalExpenses())).append("\n");
        sb.append("Trip Notes:      ").append(this.tripNotes).append("\n");
        return sb.toString();
    }

    private static void updateAgencyRevenue(double tripTotal) {
        totalAgencyRevenue += (tripTotal * 0.10);
    }

    public static void displayAgencyStats() {
        System.out.println("Total Trips Planned: " + totalTripsPlanned);
        System.out.println("Total Est. Revenue:  $" + String.format("%.2f", totalAgencyRevenue));
    }

    public static void main(String[] args) {
        TravelPlanner trip1 = new TravelPlanner();
        trip1.appendTripNote("Needs destination input.");
        System.out.println(trip1);

        String[] destinations2 = {"Tokyo", "Kyoto", "Osaka"};
        double[] expenses2 = {1200.50, 450.00, 300.75}; // Flights, Hotels, Food
        
        TravelPlanner trip2 = new TravelPlanner(
            "alice smith ", 
            "Prefers window seats.", 
            destinations2, 
            expenses2
        );
        
        trip2.appendTripNote("Requested vegetarian meals on flights.");
        System.out.println(trip2);

        TravelPlanner trip3 = new TravelPlanner(trip2);
        trip3.appendTripNote("Will join from a different departure city.");
        System.out.println(trip3);

        TravelPlanner.displayAgencyStats();
    }
}