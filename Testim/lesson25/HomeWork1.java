package lesson25;

import java.util.*;

public class HomeWork1 {
    public static void main(String[] args) {
        List<Integer> a = readData();
        System.out.println("To be continue");
    }
    public static List<Integer> readData(){
        Scanner sc = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        try{
            while (sc.hasNext()){
                int a = sc.nextInt();
                array.add(a);
            }
        } catch (InputMismatchException ex){
            for (Integer integer : array) {
                System.out.println(integer);
            }
        }
        return array;
    }
}
/*
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader-а)
этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа,
то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/