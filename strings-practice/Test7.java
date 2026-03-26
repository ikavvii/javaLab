public class Test7 {
    public static void main(String[] args) {
        String message = "I am very happy!";
        String target = "very ";

        // 1. Find where the target starts
        int startIndex = message.indexOf(target);
        
        // 2. Find where the target ends
        int endIndex = startIndex + target.length();

        // 3. Glue the part BEFORE the word to the part AFTER the word
        String newMessage = message.substring(0, startIndex) + message.substring(endIndex);

        System.out.println(newMessage);
    } 
}