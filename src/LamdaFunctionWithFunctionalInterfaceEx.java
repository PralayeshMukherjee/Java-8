interface Math{
    int sum(int a,int b);
    double multiply(int a,int b);
    int subtract(int a,int b);
    long divide(int a,int b);
    int modulas(int a,int b);
}
class Calculator implements Math{
    @Override
    public int sum(int a,int b){
        return a+b;
    }
    @Override
    public double multiply(int a,int b){
        return a*b;
    }
    @Override
    public int subtract(int a,int b){
        return a-b;
    }
    @Override
    public long divide(int a,int b){
        return a/b;
    }
    @Override
    public int modulas(int a,int b){
        return a%b;
    }
}
public class LamdaFunctionWithFunctionalInterfaceEx {
}
