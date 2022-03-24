import zoo.Animal;
import zoo.Duck;

public class Main {
    public static void main(String[] args) {
        //Overloading Methodes
//          Animal bear = new Animal();
//          bear.setName ("Bear");
//          bear.setAge(5);
//          System.out.println(bear.getAge());
//          System.out.println(bear.getAge( "Adam"));


        //  Inheritance
        Animal duck = new Duck(50, "Flapper", "Donald");
        System.out.println(duck.swim());
        System.out.println(duck);


        System.out.println("\n\n");
    }
}
