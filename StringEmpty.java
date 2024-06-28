package lambda;
import java.util.function.Predicate;

public class StringEmpty {
    public static void main(String[] args) {
        Predicate<String> emp = s -> s.isEmpty();
        System.out.println(emp.test("Ashish Verma")) ;

        Predicate<String> emp1 = s -> s.isEmpty();
        System.out.println(emp.test("")) ;
    }
}

