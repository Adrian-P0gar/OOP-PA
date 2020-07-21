import java.util.Date;

public class Employe  extends Person{

    private int salary;


    public Employe(String name, Date birthDate, String phoneNumber, int salary) {
        super(name, birthDate, phoneNumber);
        this.salary = salary;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
