import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayPatientDetails {
    public static void main(String[] args) {
        // JDBC URL for Oracle Database
        String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe"; // Update as per your database details
        String username = "your_username"; // Update with your username
        String password = "your_password"; // Update with your password

        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish a Connection
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // Create a Statement
            Statement statement = connection.createStatement();

            // Execute a Query
            String sql = "SELECT id, name, problem, bill FROM patients";
            ResultSet resultSet = statement.executeQuery(sql);

            // Process the Result
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String problem = resultSet.getString("problem");
                double bill = resultSet.getDouble("bill");

                System.out.println("ID: " + id + ", Name: " + name + ", Problem: " + problem + ", Bill: $" + bill);
            }

            // Close Resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
