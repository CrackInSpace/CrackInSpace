package lesson18;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        //task_1
        /*
        Создать коллекцию HashMap<String, String>, занести туда 4 пары строк
        Вывести содержимое коллекции на экран, каждый элемент с новой строки.
        Пример вывода:
        ключ - значение
        ключ - значение
        ключ - значение
        ключ - значение
        */
        Map<String, String> map = new HashMap<>();
        map.put("Put key_1", "Put value");
        map.put("Put key_2", "Put value");
        map.put("Put key_3", "Put value");
        map.put("Put key_4", "Put value");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();

        //task_2
        /*
        Есть коллекция HashMap<String, String>, туда занесли 3 различные пары.
        При помощи метода printKeys:
        Вывести на экран список ключей, каждый элемент с новой строки.
        */
        printKeys(map);
        System.out.println();

        //task_3
        /*
        Есть коллекция HashMap<String, String>, туда занесли 3 различные пары.
        При помощи метода printValues:
        Вывести на экран список значений, каждый элемент с новой строки.
        */
        printValues(map);
        System.out.println();

        /*
        1. Ввести с клавиатуры число N.
        2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
        3. Найти минимальное число среди элементов списка - метод getMinimum.
        */
        List<Integer> array = new ArrayList<>();

        getIntegerList(array);
        System.out.println("Min num: " + getMinimum(array));

        for(int a : array){
              System.out.print(a + " ");
        }
        System.out.println();

        /*
        Задача: Ввести с клавиатуры 5 слов и выведи их в алфавитном порядке.
        */
        Set<String> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        int i = 5;
        while(i > 0){
            set.add(sc.next());
            i--;
        }
        System.out.print("In alphabet: ");
        for(String s : set){
            System.out.print(s + " ");
        }
    }

    //task_2
    public static void printKeys(Map<String, String> dictionary){
        for (String k : dictionary.keySet()) {
            System.out.println("Key: " + k);
        }
    }

    //task_3
    public static void printValues(Map value){
        for (Object v : value.values()) {
            System.out.println("Value: " + v);
        }
    }



    public static void getIntegerList(List<Integer> arr){
        Scanner sc = new Scanner(System.in);
        int a = 4;
        while(a > 0){
            arr.add(sc.nextInt());
            a--;
        }
    }

    public static int getMinimum(List<Integer> arr){
        int min = arr.get(0);
        for(int a = 0; a < arr.size(); a++){
            if(arr.get(a) < min) min = arr.get(a);
        }
        return min;
    }
}


