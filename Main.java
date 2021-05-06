
public class Main {

    public static void main(String[] args) {

        Instructor instructor1 = new Instructor(1, 9801, "DemirogEngin", "Engin Demiroğ");
        System.out.println(instructor1.id);
        System.out.println(instructor1.passaword);
        System.out.println(instructor1.username);
        System.out.println(instructor1.instructorName);



        User user1 = new User(2, 9848, "Kübranur Şahin");
        System.out.println(user1.id);
        System.out.println(user1.passaword);
        System.out.println(user1.username);

        Student student1 = new Student(3, 3456, "Enes", 9873, "Mustafa");
        System.out.println(student1.id);
        System.out.println(student1.passaword);
        System.out.println(student1.studentName);
        System.out.println(student1.studentId);
        System.out.println(student1.username);

        UserManager userManager = new UserManager();
        userManager.join(user1);
        userManager.leave(user1);
        
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.join(instructor1);
        instructorManager.leave(instructor1);

        StudentManager studentManager = new StudentManager();
        studentManager.join(student1);
        studentManager.leave(student1);


       


    }
}
