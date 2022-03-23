package zoo;

public class Animal {
    //public static void main (String []args) {
// Fields
    private int age;
    private String gender;
    private String name;

    //Constructors

    public Animal() {
    }
    public Animal(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }
    //Getters and Setters

    public int getAge(String name) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Methods
    public boolean isMammal() {
        return true;
    }
    public String swim () {
        return "I am swiming";
    }
    public String run() {
        return "Iam runing man hear me rooar";
    }
    //To String


    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}





