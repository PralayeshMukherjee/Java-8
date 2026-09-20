import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamAPI {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(3,5,6,4,1,10);
        list.forEach(n->System.out.print(n+" "));
        Stream<Integer> stream = list.stream();
        stream.forEach(n-> System.out.print(n+" "));
        Stream<Integer> countN = list.stream();
        long count = countN.count();
        System.out.println(count);
        Stream<Integer> map = list.stream().map(n->n*2);
        map.forEach(n-> System.out.println(n+" "));

        list.stream()
                .filter(n->n%2==1)
                .sorted()
                .map(n->n*2)
                .forEach(n-> System.out.print(n+" "));
    }
}
