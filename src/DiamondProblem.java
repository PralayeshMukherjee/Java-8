class superParentA{
    public void display(){
        System.out.println("Super Parent executed!");
    }
}
class midParentB extends superParentA{
    @Override
    public void display(){
        System.out.println("Mid Parent B executed!");
    }
}
public class DiamondProblem {
    public static void main(String[] args) {

    }
}
