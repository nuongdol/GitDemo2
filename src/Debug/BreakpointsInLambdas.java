package Debug;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BreakpointsInLambdas {
    public static void main(String[] args) {
        Object[] res = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20).filter(i->i%2==0).filter(i -> i>3).toArray();
        System.out.println(Arrays.toString(res));
        Integer[] numbers = {1,2,3,4,5,6,7,80,8};
        Arrays.stream(numbers).filter(e->e % 2 == 0).limit(5).toList();
        System.out.println(Arrays.toString(numbers));

    }
}
