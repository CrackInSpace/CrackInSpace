package Fibonacci;

import java.math.BigInteger;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibNaive(5));
        System.out.println(fibNaive(10));
        System.out.println(fibEffective(5));
        System.out.println(fibEffective(100));
    }

    //Медленный и простой способ, но не эффективный!!
    private static long fibNaive(int n){
        if (n <= 1) return n;
        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    //Быстрый и эффективный
    private static BigInteger fibEffective(int n){
        if (n == 0) return BigInteger.ZERO;
        else if (n == 1) return BigInteger.ONE;

        List<BigInteger> array = new ArrayList<>();
        array.add(BigInteger.ONE);//если последовательность такая -> 1 1 2 3 5 8....
        array.add(BigInteger.ONE);

        for(int i = 2; i < n; i++){
            array.add(i,(array.get(i - 1).add(array.get(i - 2))));
        }
        return array.get(array.size() - 1);
    }
}
class Fib {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
class Memoizacia {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }

    static Map<Integer, BigInteger> cache = new HashMap<>();

    //Медленный метод, но благодаря мемоизации он стал лучше и больше кушает памяти
    public static BigInteger fibonacci(int n){
        cache.put(0,BigInteger.ZERO);
        cache.put(1,BigInteger.ONE);
        BigInteger result;
        if (n == 1) return BigInteger.ZERO;
        if (n == 2) return BigInteger.ONE;
        if(null != (result = cache.get(n))) return result;
        result = fibonacci(n - 1).add(fibonacci(n - 2));
        cache.put(n, result);
        return result;
    }
}
