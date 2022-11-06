package lesson21;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Задача по алгоритмам.
Найти ряд Фиббоначи для числа 10
*/
public class HomeWork {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }

    static Map<Integer, BigInteger> cache = new HashMap<>();
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
