interface Walking{
    default void move(){
        System.out.println("Walk!");
    }
}
interface Running{
    default void move(){
        System.out.println("Run!");
    }
}
public class defaultInterfaceImplementationAmbiguity implements Walking,Running{
    @Override
    public void move(){
        System.out.println("Stop");
    }
//    we can't directly implement the default method in interface
//    so we need to override the method
}
