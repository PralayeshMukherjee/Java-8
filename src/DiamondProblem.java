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
//    here it gives me error because java doesn't allow us to extend multiple
//    classes so that java avoid the diamond problem
//    diamond problem is a problem where child class try to override the method from 2 classes which already have the same class
    @Override
    public void display(){
        System.out.println("Child D executed!");
    }
}
public class DiamondProblem {
    public static void main(String[] args) {

    }
}
