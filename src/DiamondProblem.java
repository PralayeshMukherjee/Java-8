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
class midParentC extends superParentA{
    @Override
    public  void display(){
        System.out.println("Mid Parent C executed!");
    }
}
class childD extends midParentB,midParentC{
    @Override
    public void display(){
        System.out.println("Child D executed!");
    }
}
public class DiamondProblem {
    public static void main(String[] args) {

    }
}
