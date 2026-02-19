import java.util.Arrays;

public class SmartEventSystem {

    private int participantId;
    private String fullName;
    private String email;
    private String[] registeredEvents;
    private double feedbackRating;

    private static int totalRegistrations = 0;
    private static final String FEST_NAME = "THIRAN 2026";
    private static final String ORGANIZATION = "PSG College of Technology";

    public SmartEventSystem() {
        this.participantId = ++totalRegistrations; 
        this.fullName = "Unknown Participant";
        this.email = "Not Provided";
        this.registeredEvents = new String[0];
        this.feedbackRating = 0.0;
    }

    public SmartEventSystem(String fullName, String email, String[] events) {
        this.participantId = ++totalRegistrations;
        this.fullName = fullName;
        this.email = email;
        this.registeredEvents = Arrays.copyOf(events, events.length);
        this.feedbackRating = 0.0;
    }

    public SmartEventSystem(SmartEventSystem other) {
        this.participantId = ++totalRegistrations;
        this.fullName = other.fullName;
        this.email = other.email;
        this.registeredEvents = Arrays.copyOf(other.registeredEvents, other.registeredEvents.length);
        this.feedbackRating = other.feedbackRating;
    }

    public void formatParticipantName() {
        if (this.fullName != null && !this.fullName.isEmpty()) {
            this.fullName = this.fullName.trim().toUpperCase();
        }
    }

    public void updateEmail(String newEmail) {
        if (newEmail.contains("@") && newEmail.contains(".")) {
            this.email = newEmail.toLowerCase();
            System.out.println(">> Email updated successfully for ID " + this.participantId);
        } else {
            System.out.println(">> Invalid email format provided.");
        }
    }

    public void submitFeedback(double rating) {
        this.feedbackRating = rating;
    }

    public void displayParticipantDetails() {
        System.out.println("------------------------------------------------");
        System.out.println("Badge ID:       " + this.participantId);
        System.out.println("Name:           " + this.fullName);
        System.out.println("Email:          " + this.email);
        System.out.println("Events:         " + Arrays.toString(this.registeredEvents));
        System.out.println("Rating:         " + (this.feedbackRating > 0 ? this.feedbackRating + "/5.0" : "Pending"));
    }

    public static void displayFestInfo() {
        System.out.println("WELCOME TO " + FEST_NAME);
        System.out.println("Organized by: " + ORGANIZATION);
    }

    public static void displayRegistrationStats() {
        System.out.println("Total Participants Registered: " + totalRegistrations);
    }

    public static void main(String[] args) {
        SmartEventSystem.displayFestInfo();

        SmartEventSystem p1 = new SmartEventSystem();
        p1.displayParticipantDetails();
        
        p1.updateEmail("guest.user@example.com");
        
        String[] eventsForP2 = {"AI Workshop", "Hackathon", "Tech Talk"};
        SmartEventSystem p2 = new SmartEventSystem("Sarah", "sarah@psgtech.ac.in", eventsForP2);
        
        p2.formatParticipantName(); 
        p2.submitFeedback(4.5);
        p2.displayParticipantDetails();

        SmartEventSystem p3 = new SmartEventSystem(p2);
        p3.updateEmail("john@psgtech.ac.in"); 
        p3.displayParticipantDetails();

        SmartEventSystem.displayRegistrationStats();
    }
}