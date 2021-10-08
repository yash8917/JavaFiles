import java.awt.dnd.DropTarget;

interface Drawable{
    void draw();
}
class Ractangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Ractangle is Draw.");
    }
}
class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Circle is Draw.");
    }
}
public class DrawableInterface {
    public static void main(String[] args) {
        Drawable obj=new Circle();
        obj.draw();
        Drawable obj1=new Ractangle();
        obj1.draw();
    }
}
