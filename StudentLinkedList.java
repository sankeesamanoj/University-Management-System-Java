public class StudentLinkedList {

    static StudentNode head;

    // method to insert student
    static void addStudent(String name,
                    int age,
                    String gender,
                    long phoneNumber,
                    String email,
                    String address,
                    long hallTicketNumber,
                    String password) {

        StudentNode newNode = new StudentNode(
                name,
                age,
                gender,
                phoneNumber,
                email,
                address,
                hallTicketNumber,
                password
        );

        // if list is empty
        if (head == null) {
            head = newNode;
        } 
        else {
            StudentNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }
}