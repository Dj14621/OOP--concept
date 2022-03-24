package zoo;

public class Main {
    public static void main (String [] args){

       Animal bear =new Animal();
        bear.setName ("Bear");
        System.out.println(bear.getAge());
        System.out.println(bear.getAge( "Adam"));
    }
}
