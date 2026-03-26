public class Test6 {
    public static void main(String[] args) {
        String name1 = "ALEX";
        
        // 1. Get the first character: name1.substring(0, 1) -> "A"
        // 2. Get the rest: name1.substring(1) -> "LEX"
        // 3. Lowercase the rest: .toLowerCase() -> "lex"
        String firstNameCaps = name1.substring(0, 1) + name1.substring(1).toLowerCase();
        
        System.out.println(firstNameCaps);
    } 
}