public class StudentNode {
    private String name;
    private int age;
    private String gender;
    private long phoneNumber;
    private String email;
    private String address;
    private long hallTecketNumber;
    private String password;

    StudentNode next;

    public StudentNode(String name,
                        int age,
                        String gender,
                        long phoneNumber,
                        String email,
                        String address,
                        long hallTicketNumber,
                        String password){
                            this.name = name;
                            this.age = age;
                            this.gender = gender;
                            this.phoneNumber = phoneNumber;
                            this.email = email;
                            this.address = address;
                            this.hallTecketNumber = hallTicketNumber;
                            this.password = password;
                            this.next = null;

                        } 
    public long getedHallTecketNumber(){
        return hallTecketNumber;
    }
    public String getPassword(){
        return password;
    }
    public String getName(){
        return name;
    }
}
