package lesson25;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        /*
        Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
        int a = 42 / 0;
        */
        try{
            int a = 42 / 0;
        } catch (ArithmeticException ex){
            System.out.println(ex.toString() + "\n" + ex.getMessage());
        }
        System.out.println("Hmmmm, where my int a?\n");

        /*
        Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
        String s = null;
        String m = s.toLowerCase();
        */
        try{
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException ex){
            System.out.println(ex.toString() + "\n" + ex.getMessage());
        } finally {
            System.out.println();
        }

        /*
        Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
        int[] m = new int[2];
        m[8] = 5;
        */
        try{
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.toString() + "\n" + ex.getMessage());
            System.out.println(Arrays.toString(ex.getStackTrace()));
            System.out.println();
        }

        /*
        Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
        List<String> list = new ArrayList<String>();
        String s = list.get(18);
        */
        try{
            List<String> list = new ArrayList<String>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException ex){
            System.out.println(ex.toString() + "\n" + ex.getMessage());
            System.out.println();
        }

        /*
        Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
        Map<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null);
        */
        try{
            Map<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException ex){
            System.out.println(ex.toString());
            System.out.println();
        }

        /* Перехват checked исключений
        В методе processExceptions обработайте все checked исключения.
        IOException
        RemoteException
        NoSuchFieldException
        Нужно вывести на экран каждое возникшее checked исключение.
        Можно использовать только один блок try..
        */
        processExceptions(new RemoteException());
        processExceptions(new IOException());
        processExceptions(new NoSuchFieldException());
    }
    public static void processExceptions(Exception exception){
        try {
            throw exception;
        } catch (RemoteException ex){
            System.out.println(ex.toString() + "    FIRST");

        } catch (IOException ex){
            System.out.println(ex.getMessage() + "  SECOND");

        } catch (NoSuchFieldException ex){
            System.out.println(ex.getMessage() + ex.toString() + "  THIRD");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

