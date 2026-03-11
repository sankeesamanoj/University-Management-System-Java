import java.util.Scanner;

public class LogIn {
        static void check(long hallTicketNumber){
            Scanner scanner = new Scanner(System.in);
            String password;
            System.out.println(ListOfHallticketNumbersAndNames.getStudentName(hallTicketNumber));
            System.out.println("Enter your password: ");
            password = scanner.next();
            
        }
          
}
