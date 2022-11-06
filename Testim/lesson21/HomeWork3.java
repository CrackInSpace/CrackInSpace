package lesson21;

import java.util.*;
/*
Ввести с клавиатуры в список 5 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
*/
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int a = 0; a < 5; a++){
            String word = sc.next();
            list.add(word);
        }

        Map<String, Integer> map = new HashMap<>();

        //Подсчёт
        int count;
        for (String s : list) {
            count = 0;
            for (String s1 : list) {
                if (s.equals(s1)) count++;
            }
            if(count > 1) map.put(s, count);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
