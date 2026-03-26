public class Test3 {
    public static void main(String[] args) {
        String message = "Meet me by the bridge"; // Changed : to ;
        
        // substring(0, 3) gets characters at index 0, 1, and 2
        String part = message.substring(0, 3); 
        
        // Lowercase the 'part', not the whole 'message'
        String lower = part.toLowerCase();
        
        // Added the missing '.out'
        System.out.println(lower); 
    } 
}