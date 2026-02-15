class DuplicateNames {
    public static void main(String[] args) {
        String[] names = {"A", "B", "A", "C", "B"};
        
        System.out.println("Duplicate names found:");
        
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate: " + names[i]);
                    break; 
                }
            }
        }
    }
}