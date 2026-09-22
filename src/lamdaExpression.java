import java.util.function.IntBinaryOperator;

import static java.lang.Integer.sum;

//  @FunctionalInterface
interface C{
    void show();
}
//  class B implements A{
//        @Override
//      public void show(){
//            System.out.println("Hii");
//      }
//  }

public class lamdaExpression {
    public static void main(String[] args) {
        C obj = () -> {
            System.out.println("hii");
        };
        obj.show(); // without creating the implementation class of the interface
        // we can directly define the method body when we use using lamda expresion
    }
}
