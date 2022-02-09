//Create an outer class with a function display, again create another
//class inside the outer class named inner with a function called display
//        and call the two functions in the main class.
class Outer2{
    public void display(){
        System.out.println("This is a Outer class");
    }
    class Inner{
        public void display(){
            System.out.println("This is a inner class ");
        }
    }
}
public class InnerTest {
    public static void main(String[] args) {
        
        Outer2 obj=new Outer2();
        obj.display();
        Outer2.Inner obj2= obj.new Inner();
        obj2.display();
    }
}
