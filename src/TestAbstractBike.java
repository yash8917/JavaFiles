//Abstract class having constructor, data member and methods
abstract class Bike{
//    Create a constracter
    Bike(){System.out.println("Bike is created");}

//    Create a Abstract method
    abstract void run();

//    Create a normal method
    void changegear(){System.out.println("gear is changed");}
}
//Inheritance concept
class Honda extends Bike{
    @Override
    void run(){System.out.println("Bike is running..");}
}
//This is the main Class
public class TestAbstractBike {
    public static void main(String[] args) {Bike obj=new Honda();
        obj.run();
        obj.changegear();
    }}
