public class Instructor extends User
{
    public String instructorName;
    String ├ŻnstructorName;

    public Instructor(int id, String username, int passaword, String instructorName) {
        super(id, username, passaword);
        ├ŻnstructorName = instructorName;
    }

    public String getInstructorName() {
        return ├ŻnstructorName;
    }

    public void setInstructorName(String instructorName) {
        ├ŻnstructorName = instructorName;
    }
}
