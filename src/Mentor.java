import java.util.*;

public class Mentor extends Employe {

    private Set<String> languages= new HashSet<>();
    private Module module;

    public Mentor(String name, Date birthDate, String phoneNumber, int salary, Module module, Set<String> languages) {
        super(name, birthDate, phoneNumber, salary);
        this.module = module;
        this.languages = languages;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
