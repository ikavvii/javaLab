public class Main {
    public static void main(String[] args) {
        // Q1: Pattern Problem
        String duplicateInput = "hello world";
        String uniqueChars = DuplicateRemover.fun(duplicateInput);
        System.out.println("Unique characters in '" + duplicateInput + "': " + uniqueChars);
        System.out.println("Unique characters in 'programming': " + DuplicateRemover.fun("programming"));
        System.out.println();

        // Q2: Student Result Analyzer
        String input = "Ravi:78,Meena:89,Kumar:56";
        ResultProcessor processor = new ResultProcessor(input);
        System.out.println(processor);

        String banner = 
            "  _  __           _         ___  _____ __  ____   ____ __ _  _   \n" +
            " | |/ /          (_)       |__ \\| ____|  \\/  \\ \\ / /_ /_ | || |  \n" +
            " | ' / __ ___   ___ _ __      ) | |__ | \\  / |\\ V / | || | || |_ \n" +
            " |  < / _` \\ \\ / / | '_ \\    / /|___ \\| |\\/| | > <  | || |__   _|\n" +
            " | . \\ (_| |\\ V /| | | | |  / /_ ___) | |  | |/ . \\ | || |  | |  \n" + 
            " |_|\\_\\__,_| \\_/ |_|_| |_| |____|____/|_|  |_/_/ \\_\\|_||_|  |_|  \n";
        System.out.println(banner);
    }
}