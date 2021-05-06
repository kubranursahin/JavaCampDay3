public class Instructor extends User
{
    public String instructorName;
    String ýnstructorName;

    public Instructor(int id, String username, int passaword, String instructorName) {
        super(id, username, passaword);
        ýnstructorName = instructorName;
    }

    public String getInstructorName() {
        return ýnstructorName;
    }

    public void setInstructorName(String instructorName) {
        ýnstructorName = instructorName;
    }
}
