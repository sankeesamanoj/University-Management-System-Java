import java.util.Scanner;
import java.util.Random;

public class SignUp {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    private String name;
    private int age;
    private String gender;
    private long phoneNumber;
    private String email;
    private String address;
    private long newHallTecketNumber;
    private StudentNode head;
    private String password;

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    void setGender(String gender){
        this.gender = gender;
    }

    void setPhoneNumber(long phoneNumber){

        long number = phoneNumber;
        int count = 0;

        while(number != 0){
            number = number / 10;
            count++;
        }

        if(count == 10){
            this.phoneNumber = phoneNumber;
        }
        else{
            System.out.print("Enter a valid phone number: ");
            phoneNumber = scanner.nextLong();
            setPhoneNumber(phoneNumber);
        }
    }

    void setEmail(String email){

        if(email.contains("@") && email.contains(".com")){
            this.email = email;
        }
        else{
            System.out.print("Enter a valid email address: ");
            email = scanner.next();
            setEmail(email);
        }
    }

    void setAddress(String address){
        this.address = address;
        genratedHallTecketNumber();
        displayDetails();
        System.out.println();
        System.out.println("=========================================");
        System.out.println("Signup Successful!");
        System.out.println("Hall Tecket Number: "+newHallTecketNumber);
        System.out.println("=========================================");
        System.out.println();
        studentLinkedList();
        Menu.printMenu();
    }
    void genratedHallTecketNumber(){
    do{
        newHallTecketNumber = random.nextLong(1,9999999999L);
    }while(ListOfHallticketNumbersAndNames.checkHallTicketNumber(newHallTecketNumber));
    

    System.out.print("Create a password: ");
    password = scanner.next();
    ListOfHallticketNumbersAndNames.addStudent(newHallTecketNumber,name);
    }
    void displayDetails(){
        System.out.println();
        System.out.println("===== USER DETAILS =====");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: "+age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println();
    }
    void studentLinkedList(){
        StudentNode newNode = new StudentNode(name, age, gender, phoneNumber, email, address, newHallTecketNumber, password);
        if (head == null) {
            head = newNode;
        }else{
            StudentNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        
    }
}