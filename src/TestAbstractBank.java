abstract class Bank{
    abstract int getRateOfIntrest();

}
class SBI extends Bank{
    int getRateOfIntrest(){return 7;}
}
class PNB extends Bank{
    int getRateOfIntrest(){return 8;}
}
public class TestAbstractBank {
    public static void main(String[] args){
        Bank obj=new SBI();
        System.out.println("The Rate of Intrest of SBI Bank is: " +obj.getRateOfIntrest()+" %");
        Bank obj1=new PNB();
        System.out.println("The Rate of Intrest of PNB Bank is: "+obj1.getRateOfIntrest()+" %");
    }
}
