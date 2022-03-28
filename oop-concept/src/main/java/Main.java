import zoo.Animal;
import zoo.Duck;
import zoo.Fish;

public class Main {
    public static void main(String[] args) {



        //Overloading Methods
//          Animal bear = new Animal();
//          bear.setName ("Bear");
//          bear.setAge(5);
//          System.out.println(bear.getAge());
//          System.out.println(bear.getAge( "Adam"));


        //  Inheritance
        Animal duck = new Duck(50, "Flapper", "Donald");
        //System.out.println(duck.swim());
        System.out.println(duck);

        //Fish 1
        Fish fish1 = new Fish();
        fish1.setAge(2);
        fish1.setName("Donald");
        System.out.println("fish 1: " + fish1.getName() + "Age: " + fish1.getAge());
        System.out.println(fish1);

        //Fish 2
        Fish fish2 = new Fish(25,true);
        fish2.setName("Micky");
        System.out.println(fish2);

        //Fish 3
        Fish fish3 =new Fish(3, "male", "Flapper", 25, true);
        fish3.setName("Nemo");
        System.out.println(fish3);


        System.out.println("\n\n");


    }
}
