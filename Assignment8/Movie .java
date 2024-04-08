import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Movie {
    String title;
    String category; // E.g., PG, PG-13, R
    double rating; // Assume a rating score out of 10

    public Movie(String title, String category, double rating) {
        this.title = title;
        this.category = category;
        this.rating = rating;
    }

    // Getters
    public String getCategory() {
        return category;
    }

    public double getRating() {
        return rating;
    }
}

public class MovieRatingsAnalyzer {
    public static void main(String[] args) {
        // Example list of movies
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Movie A", "PG", 8.5));
        movies.add(new Movie("Movie B", "R", 9.0));
        movies.add(new Movie("Movie C", "PG-13", 7.5));
        movies.add(new Movie("Movie D", "PG", 8.0));
        movies.add(new Movie("Movie E", "R", 6.5));

        // Data structures to hold counts and sums of ratings for each category
        Map<String, Integer> counts = new HashMap<>();
        Map<String, Double> ratingSums = new HashMap<>();

        for (Movie movie : movies) {
            String category = movie.getCategory();
            double rating = movie.getRating();
            
            // Update counts and sums
            counts.put(category, counts.getOrDefault(category, 0) + 1);
            ratingSums.put(category, ratingSums.getOrDefault(category, 0.0) + rating);
        }

        // Display the results
        for (String category : counts.keySet()) {
            int count = counts.get(category);
            double averageRating = ratingSums.get(category) / count;
            System.out.println("Category: " + category + ", Number of Movies: " + count + ", Average Rating: " + averageRating);
        }
    }
}
