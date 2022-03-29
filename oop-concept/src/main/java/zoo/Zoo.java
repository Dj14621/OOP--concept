package zoo;

import oop.Person;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private String address;
    private Person person;
    private Person visitor;
    private ArrayList<Animal>animals = new ArrayList<>();

    public Zoo(String name, String address) {
        this.name = name;
        this.address = address;

    }

    // getters and setters

    public Person getVisitor() {
        return visitor;
    }

    public void setVisitor(Person visitor) {
        this.visitor = visitor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
    @Override
    public String toString() {
        return name + " Has the following Animals: " + getAnimals();
    }
}
