import java.util.Date;

public class Student extends Person{

    private int evolution;
    private boolean hasFinished = false;
    private Module module = Module.BASIC;

    public Student(String name, Date birthDate, String phoneNumber, int evolution) {
        super(name, birthDate, phoneNumber);
        this.evolution = evolution;

    }

    @Override
    public String toString() {
        return "Student{" +
                "evolution=" + evolution +
                ", hasFinished=" + hasFinished +
                ", module=" + module +
                '}';
    }

    public int getEvolution() {
        return evolution;
    }

    public void setEvolution(int evolution) {
        this.evolution = evolution;
    }

    public boolean isHasFinished() {
        return hasFinished;
    }

    public void setHasFinished(boolean hasFinished) {
        this.hasFinished = hasFinished;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }


    public void checkEvolution(){
          if(evolution == 100){
              System.out.println("The student have 100 point in module " + module);
                module = module.next();
                evolution = 0;
              }else {
              System.out.println("The student have " + evolution +" points");
          }


    }

}
