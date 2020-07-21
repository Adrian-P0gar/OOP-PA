
import java.util.ArrayList;
import java.util.List;

public class School {

    List<Student> studentList = new ArrayList<>();
    List<Employe> employeList = new ArrayList<>();

    public School() {
    }

    @Override
    public String toString() {
        return "School{" +
                "studentList=" + studentList +
                ", employeList=" + employeList +
                '}';
    }

    public void statusStudents(){}

    public void hireMentors(Mentor mentor){
        employeList.add(mentor);
    }

    public void acceptStudents(Student student){
        studentList.add(student);
    }

    public List<Student>  getStudenstByModule(Module module){
        List<Student> tempList = new ArrayList<>();
        for (Student student : studentList){
            if(student.getModule().equals(module)){
                tempList.add(student);
            }

        }
        return tempList;


    }

}
