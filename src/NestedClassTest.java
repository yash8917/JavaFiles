class Outer1{
     static int n1;
    Outer1(){
       n1=12;
    }

    static class Inner{
        int n2;
        Inner(){
            n2=34;
        }
        void display(){
            System.out.println(n1);
            System.out.println(n2);
        }
    }
}
public class NestedClassTest {
    public static void main(String[] args) {
        Outer1.Inner obj=new Outer1.Inner();
//        Outer1.Inner o=obj.new .Inner();
        obj.display();
    }
}
