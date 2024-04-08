import java.util.ArrayList;
import java.util.List;

public class RestaurantRatingAnalyzer {
    static class RatingRange {
        int lowerBound, upperBound;
        List<Integer> ratings = new ArrayList<>();

        public RatingRange(int lowerBound, int upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public void addRating(int rating) {
            if (rating >= lowerBound && rating <= upperBound) {
                ratings.add(rating);
            }
        }

        public double calculateAverage() {
            if (ratings.isEmpty()) {
                return 0;
            }
            int sum = 0;
            for (int rating : ratings) {
                sum += rating;
            }
            return (double) sum / ratings.size();
        }
    }

    public static void main(String[] args) {
        // Example list of restaurant ratings
        int[] ratings = {2, 4, 5, 7, 9, 10, 3, 6, 8, 1, 7, 9};

        // Define rating ranges
        RatingRange range1to5 = new RatingRange(1, 5);
        RatingRange range6to10 = new RatingRange(6, 10);

        // Classify ratings into ranges
        for (int rating : ratings) {
            range1to5.addRating(rating);
            range6to10.addRating(rating);
        }

        // Calculate and display results for each range
        System.out.println("Number of restaurants rated 1-5: " + range1to5.ratings.size());
        System.out.println("Average rating for 1-5: " + range1to5.calculateAverage());

        System.out.println("Number of restaurants rated 6-10: " + range6to10.ratings.size());
        System.out.println("Average rating for 6-10: " + range6to10.calculateAverage());
    }
}
