package lambda;

import java.util.function.BinaryOperator;

public class Sum{
    public static void main(String[] args) {
    BinaryOperator<Integer> sum = (int1,int2) -> int1+int2;
    {
        System.out.println(sum.apply(2,3));

    }
    }
}