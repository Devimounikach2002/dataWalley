class CustomValidationException extends Exception {
   
    public CustomValidationException(String message) {
        super(message);
    }
}

public class ExceptionDemo {

  
    public static void checkNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number is negative. CustomValidationException thrown.");
        } else {
            System.out.println("Number is positive or zero.");
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        try {
            checkNumber(number);
        } catch (CustomValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
