abstract class Cellphone{
abstract void sim();
}

class Redmi extends Cellphone{
    @Override
    void sim() {
        System.out.println("Redmi has a dual sim.");
    }
}
class Vivo extends Cellphone{
    @Override
    void sim() {
        System.out.println("Vivo has Quad sim.");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Cellphone obj=new Redmi();
        obj.sim();
        Cellphone obj2=new Vivo();
        obj2.sim();
    }
}

