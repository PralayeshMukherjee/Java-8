interface Math{
    int sum(int a,int b);
    double multiply(int a,int b);
    int subtract(int a,int b);
    long divide(int a,int b);
    int modulas(int a,int b);
}
class Calculator implements Math{
    public int sum(int a,int b){
        return a+b;
    }
    public double multiply(int a,int b){
        return a*b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public long divide(int a,int b){
        return a/b;
    }
}
public class LamdaFunctionWithFunctionalInterfaceEx {
}
