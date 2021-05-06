public class StudentManager {
    public void join(Student student) {
        System.out.println(student.getStudentName()+" öğrenci kayıt başarılı");
    }
    public void leave(Student student) {
        System.out.println(student.getStudentName()+" öğrenci kaydı silindi");
    }
}
