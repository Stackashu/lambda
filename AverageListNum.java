package lambda;
import java.util.Arrays;
import java.util.List;

public class AverageListNum {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("list of numbers :"+ num);

        double avg = num.stream()
        .mapToDouble(Integer::doubleValue)
        .average()
        .orElse(0.0);

        System.out.println("Average of numbers :" + avg);
    }
}
