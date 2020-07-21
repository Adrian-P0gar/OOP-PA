import java.util.Date;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        School codeCool = new School();
        Student student1 = new Student("Adi", new Date(1995,11,11), "123456789", 0 );

        codeCool.acceptStudents(student1);

        List<Student> students = codeCool.getStudenstByModule(Module.BASIC);


        System.out.println(students.toString());



    }


}
