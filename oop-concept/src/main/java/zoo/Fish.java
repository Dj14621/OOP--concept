//Comments
/*
* My Comments
* */
//Packages
package zoo;

//Java imports

//Custom Imports

//Imports

//Class Declaration
public class Fish extends Animal{
    private int sizeInFeet;
    private boolean canEat;

    //Constructors

    public Fish() {
    }

    public Fish(int sizeInFeet, boolean canEat) {
        this.sizeInFeet = sizeInFeet;
        this.canEat = canEat;
    }

    public Fish(int age, String gender, String name, int sizeInFeet, boolean canEat) {
        super(age, gender, name);
        this.sizeInFeet = sizeInFeet;
        this.canEat = canEat;
    }

    //Getters and Setters

    //Methods

    //To String
    public String  toString() {
        return "Fish Name: " + "Fish Age: " + getAge();
    }


}
