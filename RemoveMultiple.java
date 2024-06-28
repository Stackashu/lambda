package lambda;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveMultiple {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,3,4,5,66,77,66,87);
        System.out.println("MY number are :" + num);

        List<Integer> updatenum= num.stream()
                                .distinct()
                                .collect(Collectors.toList());

      System.out.println("MY updated number are :" + updatenum);
    }
}
