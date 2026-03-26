public class Test1 {
    public static void main(String[] args) {
        // Corrected quotes and added missing equals sign
        String firstName = "Sofia";
        String middleName = "Maria";
        String lastName = "Hernandez";

        // Fixed variable names and method casing
        String initials = firstName.substring(0, 1) +
                         middleName.substring(0, 1) +
                         lastName.substring(0, 1);

        // Added the missing closing parenthesis
        System.out.println(initials.toLowerCase());
    }
}