class LoginCheck {
    public static void main(String[] args) {
        String s1 = "user"; 
        
        String s2 = new String("user"); 
        
        if (s1 == s2) {
            System.out.println("s1 == s2 : true");
        } else {
            System.out.println("s1 == s2 : false"); 
        }

        if (s1.equals(s2)) {
            System.out.println("s1.equals(s2) : true");
        } else {
            System.out.println("s1.equals(s2) : false");
        }
    }
}