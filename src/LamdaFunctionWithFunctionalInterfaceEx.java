import java.io.*;
import java.util.*;

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
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(",");
        List<Integer> list = new ArrayList<>();
        list.add(calculator.sum(Integer.parseInt(input[0]),Integer.parseInt(input[1])));
    }
}
