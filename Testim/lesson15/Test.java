package lesson15;

import jdk.jfr.StackTrace;

import java.io.IOException;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        //task_1
        /*Создать список из чисел и заполнить его на 5 элементов с консоли
        Вывести все элементы списка в консоль*/

        /*List<Integer> array = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            array.add(((int) (Math.random() * 10)));
        }
        for (int a : array) {
            System.out.print(a + " ");
        }*/

        //task_2
        /*1. Создай список строк.
        2. Добавь в него 5 различных строчек с консоли.
        3. Выведи его размер на экран.
        4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.*/
        /*List<String> array = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            array.add(sc.nextLine());
        }
        System.out.println("Size array: " + array.size() + "\n" + String.join("\n",array));*/

        //task_3
        /*
        Создать список из целых чисел и заполнить его с консоли
        Ввод целых чисел с клавиатуры продолжается, пока не ввели пустую строку в консоли
        После того, как ввод завершён - вывести все элементы списка в консоль
        */
        /*Scanner sc = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        String ch;
        try {
            loop: do {
                ch = sc.nextLine();
                if (ch.isEmpty()) break loop;//Метка or if (ch.equals("")) break loop;
                array.add(Integer.parseInt(ch));
            } while (true);
        }catch (NumberFormatException ex){
            System.out.println("Insert not num");
        }
        System.out.println(array);*/

        //task_4
        /*
        Создать список чисел и заполнить его с консоли следующим образом:
        чётные числа добавляют в конец списка, нечётные — в начало.
        */
        /*List<Integer> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num;
        for(int i = 0; i < 4; i++){
            num = sc.nextInt();
            if (num % 2 == 0) array.add(num);
            else array.add(0, num);
        }
        System.out.println(array);*/

        //task_5
        /*
        Создать список чисел и заполнить его с консоли
        Удалить все числа больше 5
        */
        /*List<Integer> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            array.add(sc.nextInt());
        }
        for(int a = 0; a < array.size(); a++){
            if(array.get(a) >= 5) {//array.get(4) получаем значение находящееся в массиве под индексом 4
                array.remove(array.indexOf(array.get(a)));//  System.out.println(array.indexOf(2));//Ищет индекс вхождения числа 2 в ArrayList
                a--;       //        array.remove(array.indexOf(2));//Удаляет индекс найденного числа 2
            }
        }
        System.out.println(array);*/

        //task_6
        /*
        Создать список чисел и заполнить его с консоли
        Разбить список на два других:
        - в первый список сохранять чётные числа
        - во второй список сохранять нечётные числа
        Вывести содержимое всех списков в консоль. Каждый новый список выводить с новой строки, в ряд.
        */
        /*List<Integer> array = new ArrayList<>();
        List<Integer> arrChet = null;
        List<Integer> arrNeChet = null;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            array.add(sc.nextInt());
        }

        for(int a : array){
            if(a % 2 == 0){
                if(arrChet == null) arrChet = new ArrayList<>();
                arrChet.add(a);
            } else {
                if(arrNeChet == null) arrNeChet = new ArrayList<>();
                arrNeChet.add(a);
            }
        }
        System.out.println("Весь массив: " + array);
        System.out.println("Чётный массив: " + arrChet);
        System.out.println("Нечетный массив: " + arrNeChet);*/

        //task_7
        /*
        1. Создай список строк.
        2. Считай с клавиатуры 5 строк и добавь в список.
        3. Используя цикл, найди самую длинную строку в списке.
        4. Выведи найденную строку на экран.
        5. Если таких строк несколько, выведи каждую с новой строки.
        */
        /*List<String> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            array.add(sc.nextLine());
        }

        //Высчитываем макс длину слова
        int maxLengthStr = array.get(0).length();//Длинна строки
        for(String a : array){
            if(a.length() >= maxLengthStr) maxLengthStr = a.length();
        }
        //Выводим слова которые соответствуют макс длине
        for(String a : array){
            System.out.print(maxLengthStr == a.length()? a + " " : "");
        }*/

        //task_8
        /*
        1. Создай список строк.
        2. Считай с клавиатуры 5 строк и добавь в список.
        3. Используя цикл, найди самую короткую строку в списке.
        4. Выведи найденную строку на экран.
        5. Если таких строк несколько, выведи каждую с новой строки.
        */
        /*List<String> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            array.add(sc.nextLine());
        }

        //Высчитываем макс длину слова
        int minLengthStr = array.get(0).length();//Длинна строки
        for(String a : array){
            if(a.length() <= minLengthStr) minLengthStr = a.length();
        }
        //Выводим слова которые соответствуют макс длине
        for(String a : array){
            System.out.print((minLengthStr == a.length()? a + " " : ""));
        }*/


        //task_9
        /*
        1. Введи с клавиатуры 6 чисел, сохрани их в список и рассортируй по трём другим спискам:
        Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
        Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
        2. Создай метод printList - он должен выводить на экран все элементы списка с новой строки.
        3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
        */
        Scanner sc = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();

        List<Integer> arrayDiv3 = new ArrayList<>();
        List<Integer> arrayDiv2 = new ArrayList<>();

        for(int i = 0; i < 6; i++){
            array.add(sc.nextInt());
        }

        for(int a : array){
            if(a % 3 == 0) arrayDiv3.add(a);
            if(a % 2 == 0) arrayDiv2.add(a);
        }

        printList(arrayDiv3, "When div in 3 ");
        printList(arrayDiv2, "When div in 2 ");
        printList(array, "All array ");
    }
    //task_9
    public static void printList(List<Integer> array, String word){
        System.out.println(word + array);
    }
}
