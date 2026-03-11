import java.util.HashMap;

public class ListOfHallticketNumbersAndNames {
    private static HashMap<Long, String> students = new HashMap<>();
    static void addStudent(long hallTicketNumber, String name){
        students.put(hallTicketNumber, name);
    }
    static String  getStudentName(long hallTicketNumber){
        if (students.containsKey(hallTicketNumber)) {
            return "Wel-come: "+students.get(hallTicketNumber);
        }
        else{
            return "You are not registered! ";
        }
    }
    static boolean checkHallTicketNumber(long hallTicketNumber){
        return students.containsKey(hallTicketNumber);
    }
}
