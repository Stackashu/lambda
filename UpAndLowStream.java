package lambda;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpAndLowStream {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red" ,"Green","Black","White");
        System.out.println("The colors ares :" + colors);


        List<String> Upcase = colors.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());

        System.out.println("the uppercase Strings :" + Upcase);

        
        List<String> LOwcase = colors.stream()
        .map(String::toLowerCase)
        .collect(Collectors.toList());

        System.out.println("the uppercase Strings :" + LOwcase);
    }
}
