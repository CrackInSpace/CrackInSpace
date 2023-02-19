package lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class HomeWork {
    public static void main(String[] args) {
        //task_1
        /*
        1. Создай список строк.
        2. Добавь в него 5 строчек с клавиатуры.
        3. Удали последнюю строку и вставь её в начало. Повторить 5 раз.
        4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
        */
        /*List<String> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            array.add(sc.nextLine());
            *//*kali
            linux
            this
            is
            not bad*//*
        }

        for (int i = 0; i < 3; i++) {
            array.add(0, array.get(array.size() - 1));
            array.remove(array.size() - 1);
        }

        for (String s : array) {
            System.out.println(s);
            *//*this
            is
            not bad
            kali
            inux*//*
        }*/

        //task_2
        /*
        Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
        */
        /*List<String> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            array.add(sc.nextLine());
        }

        array.remove(3);

        for (int i =  array.size() - 1; i >= 0; i--){
            System.out.println(array.get(i));
        }*/

        //task_3
        /* Буква «р» и буква «л»
        1. Создай список слов, заполни его самостоятельно.
        2. Метод fix должен:
        2.1. удалять из списка строк все слова, содержащие букву «р»
        2.2. удваивать все слова содержащие букву «л».
        2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
        2.4. с другими словами ничего не делать.

        Пример:
        лира
        лоза
        роза

        Выходные данные:
        лира
        лоза
        лоза
        */
        List<String> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        /*array.add("lira");
        array.add("loza");
        array.add("roza");*/

        for (int i = 0; i < 3; i++){
            array.add(sc.nextLine());
        }

        fix(array);
        System.out.println(array);

        //task_4
        /*
        1. Введи с клавиатуры 5 слов в список строк.
        2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
        3. Используя цикл for выведи результат на экран, каждое значение с новой строки.

        Пример:
        краб
        лось
        рак

        Выходные данные:
        краб краб
        лось лось
        рак рак
        */
        /*List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int a = 0; a < 5; a++){
            words.add(scanner.nextLine());
        }

        doubleValues(words);
        System.out.println(String.join(" ", words));*/
    }
    //task_3
    public static void fix(List<String> array){
        for(int a = 0; a < array.size(); a++){
            if(array.get(a).contains("r") && array.get(a).contains("l")){
                System.out.println("in pass");
            }
            else if(array.get(a).contains("r")) {
                System.out.println("in remove");
                array.remove(array.indexOf(array.get(a)));
                a--;
            }
            else if(array.get(a).contains("l")){
                System.out.println("in x2");
                array.add(a, array.get(a));
                a++;
            }
        }
    }

    //task_4
    public static void doubleValues(List<String> words){
        for(int a = 0; a < words.size(); a++){
            words.add(a, words.get(a));
            a++;
        }
    }
}


