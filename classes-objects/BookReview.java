
class BookReview {
    private String reviewerName;
    private String bookTitle;
    private StringBuilder reviewComments;
    // an integer array to store four rating parameters such as content, language,
    // presentation, and overall rating
    private int[] ratingParameters = new int[4];

    BookReview(String name, String title) {
        reviewerName = name;
        bookTitle = title;
        reviewComments = new StringBuilder();

    }

    private void addReviewComment(String comment) {
        reviewComments.append(comment + "\n");
    }

    private void setRatingParameters(int content, int language, int presentation, int overall) {
        // Each takes the rating numbers from 1 to 5 in increasing scale order.
        if (content < 1 || content > 5 || language < 1 || language > 5 || presentation < 1 || presentation > 5
                || overall < 1 || overall > 5) {
            System.out.println("Invalid rating. Please provide ratings between 1 and 5.");
            return;
        }
        ratingParameters[0] = content;
        ratingParameters[1] = language;
        ratingParameters[2] = presentation;
        ratingParameters[3] = overall;
    }

    private void reviewSummary() {
        System.out.println("Reviewer: " + reviewerName);
        System.out.println("Book Title: " + bookTitle);
        System.out.print("Review Comments: \n" + reviewComments.toString());
        System.out.println("Ratings:");
        System.out.println("Content: " + ratingParameters[0]);
        System.out.println("Language: " + ratingParameters[1]);
        System.out.println("Presentation: " + ratingParameters[2]);
        System.out.println("Overall Rating: " + ratingParameters[3]);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        BookReview review = new BookReview("Kavin", "The Alchemist");
        review.addReviewComment("A captivating tale of love and self-discovery.");
        review.setRatingParameters(5, 4, 5, 5);
        review.reviewSummary();

        BookReview anotherReview = new BookReview("Emily", "To Kill a Mockingbird");
        anotherReview.addReviewComment("A timeless classic that explores themes of justice and morality.");
        anotherReview.setRatingParameters(5, 5, 4, 5);
        anotherReview.addReviewComment("The characters are well-developed and the story is compelling.");
        anotherReview.reviewSummary();

        BookReview thirdReview = new BookReview("Kavin", "1984");
        thirdReview.addReviewComment("A dystopian novel exploring themes of totalitarianism and oppression.");
        thirdReview.setRatingParameters(5, 5, 4, 5);
        thirdReview.reviewSummary();
    }

}
