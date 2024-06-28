package lambda;
import java.util.Arrays;
import java.util.List;

public class EvenOddSum {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,4,5,6,7);
        System.out.println("My Numbers are :" + num);

        int even = num.stream()
                   .filter(x->x%2==0)
                   .mapToInt(Integer::intValue)
                   .sum();

                   System.out.println("My even numbers are :" + even);

                   int odd = num.stream()
                   .filter(x->x%2 !=0)
                   .mapToInt(Integer::intValue)
                   .sum();

                   System.out.println("My odd numbers are :" + odd);
    }
}
