import java.util.HashMap;

public class ListOfHallticketNumbersAndNames {
    private static HashMap<Long, String> students = new HashMap<>();
    static void addStudent(long hallTicketNumber, String name){
        students.put(hallTicketNumber, name);
    }
    static boolean  getStudentName(long hallTicketNumber){
        if (students.containsKey(hallTicketNumber)) {
            return true;
        }
        else{
            System.out.println("You are not registered! ");
            return false;
        }
    }
    static boolean checkHallTicketNumber(long hallTicketNumber){
        return students.containsKey(hallTicketNumber);
    }
}
