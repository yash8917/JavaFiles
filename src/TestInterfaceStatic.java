interface Drawable1{
    void Draw();
    static int cube(int x){
        return (x*x*x);
    }
}
class Ractangle1 implements Drawable1{
    @Override
    public void Draw() {
        System.out.println("Draw the circle");
    }
}
public class TestInterfaceStatic {
    public static void main(String[] args) {
        Drawable1 obj=new Ractangle1();
        obj.Draw();



    }
}
