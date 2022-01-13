
interface  printable{
    void print();
}

public class JavaInterfaceExa implements printable {
    public void print() {
        System.out.println("HELLO");
    }

    public static void main(String[] args) {
        JavaInterfaceExa obj=new JavaInterfaceExa();
        obj.print();
    }
}

