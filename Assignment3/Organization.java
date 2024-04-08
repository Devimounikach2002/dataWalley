class Organization implements Cloneable {
    private int organizationCode;
    private String organizationName;
    private String organizationAddress;

    // Constructor
    public Organization(int organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

    // Method to clone the object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Method to print object details
    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }
    
    // Getters and setters for the properties can be added here if needed
}

public class Main {
    public static void main(String[] args) {
        try {
            Organization org1 = new Organization(101, "OpenAI", "San Francisco");
            Organization org2 = (Organization) org1.clone(); // Cloning org1 to org2

            // Printing details of the original and cloned objects
            System.out.println("Original Organization Details:");
            org1.printDetails();
            
            System.out.println("\nCloned Organization Details:");
            org2.printDetails();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
