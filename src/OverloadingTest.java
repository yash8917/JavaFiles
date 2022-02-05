public class OverloadingTest {
    
    public void m1(){
        System.out.println("Non parameterize method ");
    }
    public void m1(int a,int b){
        System.out.println("sum is:"+(a+b));
    }
    public static void main(String[] args) {
        OverloadingTest obj=new OverloadingTest();
        obj.m1();
        obj.m1(23,5);
    }
}
