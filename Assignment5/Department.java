import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class Department {
    private int id;
    private String name;
    
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class StoreDepartment {
    public static void main(String[] args) {
        // Department object to store
        Department department = new Department(1, "Human Resources");

        // JDBC URL and credentials
        String jdbcURL = "jdbc:mysql://localhost:3306/departments"; // Update for your database
        String username = "your_username";
        String password = "your_password";

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // SQL query to insert a new department
            String sql = "INSERT INTO department (id, name) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, department.getId());
            statement.setString(2, department.getName());

            // Execute the insert operation
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new department was inserted successfully!");
            }

            // Close resources
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
