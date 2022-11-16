package Factorial;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        System.out.println(factorial(50));
        System.out.println(factorial(42));
    }

    /*public static int factorial(int n){
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }*/

    /*public static int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n - 1);
    }*/

    //Хорошее решение факториала. Можно юзать для собеса!
    /*public static BigInteger factorial(int n){
        if(n == 1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }*/

    //Грамотное решение факториала. Точно надо юзать для собеса!
    static Map<Integer, BigInteger> cache = new HashMap<>();
    public static BigInteger factorial(int n){
        BigInteger result;

        if(n == 1) return BigInteger.ONE;
        if((result = cache.get(n)) != null) return result;
        result = BigInteger.valueOf(n).multiply(factorial(n - 1));
        cache.put(n, result);
        return result;
    }
}
