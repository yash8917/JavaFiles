
class Employee{
    int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
}
class Programmer extends Employee{
    int bonous;

    public void setbonous(){
        this.bonous=bonous;
    }
    public int  getbonous(){
        return bonous;
    }
    public void display(){
        System.out.println("Salary is :"+getSalary());
        System.out.println("Bonous is:"+getbonous());
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        Programmer obj=new Programmer();
        obj.display();
    }
}
