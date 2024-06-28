package lambda;
import java.util.Arrays;
import java.util.List;

public class CountFirstString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("ashish","ashu" ,"bibu","tiku","ask");
        System.out.println("the list of words is :" + words);

        long word =  words.stream()
                   .filter(s->s.startsWith(String.valueOf("a")))
                   .count();
    
                   System.out.println(" count of words statring with b :" + word);
}
}