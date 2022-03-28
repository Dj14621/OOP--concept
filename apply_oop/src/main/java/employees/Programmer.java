package employees;

public class Programmer {

    public class Programmers extends Employee {
    private String codingLanguage;
    }

    //Constructors

    public Programmer() {
    }

    //Getters and setters

    // Methods
    public boolean isFullTime() {
        return true;
    }
    //ToString

    @Override
    public String toString() {
        return "Programmer{}";
    }
}
