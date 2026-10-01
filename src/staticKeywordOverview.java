class StaticA{
    static void display(){
        System.out.println("Parent Static Block executed!");
    }
}
class StaticB extends StaticA{
//    @Override
    static void display(){
        System.out.println("Child Static Block executed!");
    }
}
public class staticKeywordOverview {
    public static void main(String[] args) {

    }
}
