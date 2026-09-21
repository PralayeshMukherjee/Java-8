@FunctionalInterface
interface A{
    void show();
//    void raj();
// Functional Interface support only 1 method inside it without implementation
}
class B implements A{
    @Override
    public void show(){
        System.out.println("Hii");
    }
}
public class functionalInterface {
    public static void main(String[] args) {

    }
}
