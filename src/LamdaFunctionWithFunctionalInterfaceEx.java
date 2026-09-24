import java.io.*;
import java.util.*;

interface Math{
    int sum(int a,int b);
    int multiply(int a,int b);
    int subtract(int a,int b);
    int divide(int a,int b);
    int modulas(int a,int b);
}
class Calculator implements Math{
    @Override
    public int sum(int a,int b){
        return a+b;
    }
    @Override
    public int multiply(int a,int b){
        return a*b;
    }
    @Override
    public int subtract(int a,int b){
        return a-b;
    }
    @Override
    public int divide(int a,int b){
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
        list.add(calculator.subtract(Integer.parseInt(input[0]),Integer.parseInt(input[1])));
        list.add(calculator.multiply(Integer.parseInt(input[0]),Integer.parseInt(input[1])));
        list.add(calculator.divide(Integer.parseInt(input[0]),Integer.parseInt(input[1])));
        list.add(calculator.modulas(Integer.parseInt(input[0]),Integer.parseInt(input[1])));

        list.forEach(n-> System.out.println(n+" "));
    }
}
