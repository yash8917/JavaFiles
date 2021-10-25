
class Employee{
    int salary;
    Employee(){
    salary=20000;}
}
class Programmer extends Employee{
    int bonous;
    Programmer(){
        bonous=8000;
    }
    public void display(){
        System.out.println("Salary is :"+salary);
        System.out.println("Bonous is:"+bonous);
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        Programmer obj=new Programmer();
        obj.display();
    }
}
