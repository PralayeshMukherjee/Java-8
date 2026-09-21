@FunctionalInterface
interface A{
    void show();
//    void raj();
// Functional Interface support only 1 method inside it without implementation
}
class B implements A{
    @Override // you can use override if you want to do else
    // if you don't want to use it then its ok because implementation means you
    // have to write the body of the method that you define in interface
    // use override annotation only for check
    public void show(){
        System.out.println("Hii");
    }
}
public class functionalInterface {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
