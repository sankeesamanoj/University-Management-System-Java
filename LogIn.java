import java.util.Scanner;

public class LogIn {
        static void check(long hallTicketNumber){
            Scanner scanner = new Scanner(System.in);
            String password;
            ListOfHallticketNumbersAndNames.getStudentName(hallTicketNumber);
            System.out.print("Enter your password: ");
            password = scanner.next();
            validateLogin.validateStudentLogin(hallTicketNumber,password);
            scanner.close();
        }
          
}
