import java.util.Scanner;

public class Menu {
    public static void printMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my Engineering College");
        System.out.println("===================== MENU =====================");
        System.out.println("options:");
        System.out.println("1. Log-in");
        System.out.println("2. sign-up");
        System.out.print("Enter option: ");
        
        int userOption = scanner.nextInt();
        if (userOption == 1) {
// log-in
            scanner.nextLine();
            System.out.print("Enter your Hall tecket number (10 degits):  ");
            long  hallTecketNumber = scanner.nextLong();
            LogIn.check(hallTecketNumber);

            
        }else if (userOption == 2) {
// signup
// create a sign up object
            SignUp signUp = new SignUp();
// set name 
            System.out.print("Your Name: ");
            String temp = scanner.next();
            signUp.setName(temp);
// set age
            System.out.print("age: ");
            int age = scanner.nextInt();
            signUp.setAge(age);
// set gender
            System.out.print("Gender: ");
            temp = scanner.next();
            signUp.setGender(temp);
// set phone number
            System.out.print("Phone number: ");
            long temp1 = scanner.nextLong();
            scanner.nextLine();
            signUp.setPhoneNumber(temp1);
// set email id
            System.out.print("Email id: ");
            temp = scanner.next();
            signUp.setEmail(temp);
// set address
            System.out.print("Address: ");
            temp = scanner.nextLine();
            temp = scanner.nextLine();
            signUp.setAddress(temp);
            signUp.scanner.close();

        }else{
            System.out.println("Enter a valid option!");
        }

// close scanner
        scanner.close();
    }
}
