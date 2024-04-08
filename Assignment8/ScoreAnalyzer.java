import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ScoreAnalyzer {
    public static void main(String[] args) {
        // Example list of student test scores
        double[] scores = {82, 91, 76, 85, 92, 89, 70, 75, 84, 92, 78, 85, 88, 91, 76};
        
        // Calculate average score
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        double average = sum / scores.length;
        
        // Classify scores
        List<Double> aboveAverage = new ArrayList<>();
        List<Double> atAverage = new ArrayList<>();
        List<Double> belowAverage = new ArrayList<>();
        
        for (double score : scores) {
            if (score > average) {
                aboveAverage.add(score);
            } else if (score < average) {
                belowAverage.add(score);
            } else {
                atAverage.add(score);
            }
        }
        
        // Display counts
        System.out.println("Number of students above average: " + aboveAverage.size());
        System.out.println("Number of students at average: " + atAverage.size());
        System.out.println("Number of students below average: " + belowAverage.size());
        
        // Calculate and display medians
        System.out.println("Median score for above average group: " + calculateMedian(aboveAverage));
        System.out.println("Median score for at average group: " + calculateMedian(atAverage));
        System.out.println("Median score for below average group: " + calculateMedian(belowAverage));
    }

    private static double calculateMedian(List<Double> scores) {
        if (scores.isEmpty()) return Double.NaN;
        
        int size = scores.size();
        List<Double> sortedScores = new ArrayList<>(scores);
        sortedScores.sort(null);
        
        if (size % 2 == 0) {
            return (sortedScores.get(size / 2 - 1) + sortedScores.get(size / 2)) / 2.0;
        } else {
            return sortedScores.get(size / 2);
        }
    }
}
