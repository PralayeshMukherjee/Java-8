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
public class defaultInterfaceImplementationAmbiguity {
}
