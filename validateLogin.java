public class validateLogin {
    boolean validateStudentLogin(StudentNode head, long hallTecketNumber, String password){
        StudentNode temp = head;

        while (temp != null) {
            if (temp.getedHallTecketNumber() == hallTecketNumber && 
                temp.getPassword().equals(password)) {
                System.out.println("Login Successful");
                System.out.println("Welcome " + temp.getName());
                return true;
            }
            temp = temp.next;
        }
        System.out.println("Invalid Hall Ticket or Password");
        return false;
    }
}
