public class validateLogin {
    static boolean validateStudentLogin(long hallTecketNumber, String password){
        StudentNode temp = StudentLinkedList.head;

        while (temp != null) {
            if (temp.getedHallTecketNumber() == hallTecketNumber && 
                temp.getPassword().equals(password)) {
                System.out.println();
                System.out.println("================");
                System.out.println("Login Successful");
                System.out.println("Welcome " + temp.getName());
                System.out.println("================");
                System.out.println();
                return true;
            }
            temp = temp.next;
        }
        System.out.println("Invalid Hall Ticket or Password");
        return false;
    }
}
