package lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Function<Integer,String> evenodd = x->{
            if(x%2==0){
              return x+"is as even  number \n";
            }else{
                return x+"is as odd  number \n";
            }
            
        };
for(Integer i: num){
        System.out.println(evenodd.apply(i));
    }
    }
}
