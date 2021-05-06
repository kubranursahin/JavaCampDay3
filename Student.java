public class Student extends User
{
    int studentId;
    String studentName;

    public Student(int id, int passaword, String username, int studentNumber, String studentName) {
        super(id, passaword, username);
        this.studentId = studentNumber;
        this.studentName = studentName;
    }

    public int getStudentNumber() {
        return studentId;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentId = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }



}
