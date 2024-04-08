import java.util.ArrayList;
import java.util.List;

class BookReview {
    String title;
    int rating; // Assume a rating score out of 10

    public BookReview(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }
}

public class BookReviewAnalyzer {
    public static void main(String[] args) {
        // Example list of book reviews
        List<BookReview> reviews = new ArrayList<>();
        reviews.add(new BookReview("Book A", 8));
        reviews.add(new BookReview("Book B", 5));
        reviews.add(new BookReview("Book C", 3));
        reviews.add(new BookReview("Book D", 7));
        reviews.add(new BookReview("Book E", 9));

        // Variables to hold counts for each category
        int lowRangeCount = 0, highRangeCount = 0;
        int positiveCount = 0, neutralCount = 0, negativeCount = 0;

        for (BookReview review : reviews) {
            int rating = review.rating;

            // Categorize by rating range
            if (rating >= 1 && rating <= 5) {
                lowRangeCount++;
            } else if (rating >= 6 && rating <= 10) {
                highRangeCount++;
            }

            // Categorize by sentiment
            if (rating >= 7) {
                positiveCount++;
            } else if (rating >= 4) {
                neutralCount++;
            } else {
                negativeCount++;
            }
        }

        // Display the results
        System.out.println("Number of books with 1-5 star ratings: " + lowRangeCount);
        System.out.println("Number of books with 6-10 star ratings: " + highRangeCount);
        System.out.println("Number of books with positive reviews: " + positiveCount);
        System.out.println("Number of books with neutral reviews: " + neutralCount);
        System.out.println("Number of books with negative reviews: " + negativeCount);
    }
}
