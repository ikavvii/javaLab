public class Initials {
    public static void main(String[] args) {
        String fullName = "Mathu Perumal";
        int spaceIndex = fullName.indexOf(" ");
        // Get the character right after the space
        char initial = fullName.charAt(spaceIndex + 1);
        System.out.println(initial); 
    }
}