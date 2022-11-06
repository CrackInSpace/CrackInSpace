package lesson20.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //алфавит
        List<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            alphabet.add((char) ('а' + i));
        }
        alphabet.add(6, 'ё');

        
        String word = "";
        for (int a = 0; a < 5; a++){
            word += sc.nextLine().toLowerCase();
        }
        char[] chars = word.toCharArray();


        int count = 0;
        for (Character character : alphabet) {
            for (char aChar : chars) {
                if(character.equals(aChar)) count++;
            }
            System.out.println(character + " " + count);
            count = 0;
        }
    }
}
/*
Ввести с клавиатуры 5 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Используй метод класса String - toCharArray();

Пример ввода:
String text = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
String text2 = "абв";
String text3 = "ддд";
String text4 = "яяа";
String text5 = "вввв";
Пример вывода:
а 3
б 2
в 6
г 1
д 4
…
я 3
*/
