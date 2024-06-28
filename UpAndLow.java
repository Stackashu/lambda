package lambda;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class UpAndLow {
    public static void main(String[] args) {
        List<String> bache =  Arrays.asList("Ashish","Verma","Ashok","Money");
        Function<String,String> convertUP = x -> x.toUpperCase();
        Function<String,String> convertLo = x -> x.toLowerCase();
        System.out.println("Uppercase");
       for(String i:bache){
        System.out.println(convertUP.apply(i));
       }
       
       System.out.println("\n \n");

       System.out.println("Lowercase");
       for(String i:bache){
        System.out.println(convertLo.apply(i));
       }
    }
}
