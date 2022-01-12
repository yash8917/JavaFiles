
interface i1{

}
interface i2 extends i1{
}
interface i3 extends i1{

}
class OverDemo{
    
    public void m1(i1 obj1){
        System.out.println("gla");
    }
    public void m1(i2 obj1){
        System.out.println("hello");
    }
    public void m1(i3 obj1){
        System.out.println(" welcome");
    }
}

class labOverloadindTest56 {
    public static void main(String[] args) {
        // create a anonymous obj
        //new OverDemo().m1(null);

        OverDemo obj5=null;
    }

}
