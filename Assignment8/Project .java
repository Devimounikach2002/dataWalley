import java.util.ArrayList;
import java.util.List;

class Project {
    String studentName;
    int dueDate; // Let's assume this is an integer representing the day of the year (1-365)
    int completionDate; // Same representation as dueDate

    public Project(String studentName, int dueDate, int completionDate) {
        this.studentName = studentName;
        this.dueDate = dueDate;
        this.completionDate = completionDate;
    }

    // Method to get the status of the project
    public String getStatus() {
        if (completionDate < dueDate) {
            return "early";
        } else if (completionDate == dueDate) {
            return "on time";
        } else {
            return "late";
        }
    }

    // Method to get the time taken to complete the project
    public int getTimeTaken() {
        return Math.abs(completionDate - dueDate);
    }
}

public class ProjectAnalyzer {
    public static void main(String[] args) {
        // Example list of projects
        List<Project> projects = new ArrayList<>();
        projects.add(new Project("Alice", 100, 98)); // Early
        projects.add(new Project("Bob", 150, 150));  // On time
        projects.add(new Project("Charlie", 200, 205)); // Late
        projects.add(new Project("Dana", 250, 245)); // Early

        // Variables to keep track of statistics
        int early = 0, onTime = 0, late = 0, totalTimeTaken = 0;

        for (Project project : projects) {
            String status = project.getStatus();
            int timeTaken = project.getTimeTaken();

            switch (status) {
                case "early":
                    early++;
                    break;
                case "on time":
                    onTime++;
                    break;
                case "late":
                    late++;
                    break;
            }
            totalTimeTaken += timeTaken;
        }

        int totalProjects = projects.size();
        double averageTimeTaken = totalProjects > 0 ? (double) totalTimeTaken / totalProjects : 0;

        // Displaying the results
        System.out.println("Number of projects completed early: " + early);
        System.out.println("Number of projects completed on time: " + onTime);
        System.out.println("Number of projects completed late: " + late);
        System.out.printf("Average time taken for project completion: %.2f days\n", averageTimeTaken);
    }
}
