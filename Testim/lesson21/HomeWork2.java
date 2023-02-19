package lesson21;

import java.util.Arrays;
import java.util.Scanner;
/*
Задача по алгоритмам.
Реализовать алгоритм бинарного поиска
 (загугли, разберись что это и реализуй)
*/
public class HomeWork2 {
    public static void main(String[] args) {

        int[] list = new int[]{23, 43, 31, 12};
        int number = 12;
        Arrays.sort(list);
        System.out.printf("Binary Search %d in integer array %s %n", number,
                Arrays.toString(list));
        binarySearch(list, 12);

        System.out.printf("Binary Search %d in integer array %s %n", 43,
                Arrays.toString(list));
        binarySearch(list, 43);

        list = new int[]{123, 243, 331, 1298};
        number = 331;
        Arrays.sort(list);
        System.out.printf("Binary Search %d in integer array %s %n", number,
                Arrays.toString(list));
        binarySearch(list, 331);

        System.out.printf("Binary Search %d in integer array %s %n", 331,
                Arrays.toString(list));
        binarySearch(list, 1333);

        // Using Core Java API and Collection framework
        // Precondition to the Arrays.binarySearch
        Arrays.sort(list);

        // Search an element
        int index = Arrays.binarySearch(list, 3);

    }

    public static void binarySearch(int[] input, int number) {
        int first = 0;
        int last = input.length - 1;
        int middle = (first + last) / 2;

        while (first <= last) {
            if (input[middle] < number) {
                first = middle + 1;
            } else if (input[middle] == number) {
                System.out.printf(number + " found at location %d %n", middle);
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println(number + " is not present in the list.\n");
        }
    }
}

class ExampleBinarySearch {

    public static void main(String args[]) {
        int counter, num, item, array[], first, last;

        //Создаем объект Scanner для считывания чисел, введенных пользователем
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        num = input.nextInt();

        // Создаем массив введенного пользователем размера
        array = new int[num];

        System.out.println("Введите " + num + " чисел");

        //Заполняем массив, вводя элементы в консоль
        for (counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();

        // сортируем элементы массива, так как для бинарного поиска
        // элементы массива должны быть отсортированными
        Arrays.sort(array);

        System.out.println("Введите элемент для бинарного поиска: ");
        item = input.nextInt();
        first = 0;
        last = num - 1;

        // метод принимает начальный и последний индекс, а также число для поиска
        binarySearch(array, first, last, item);
    }

    // бинарный поиск
    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int comparisonCount = 1;    // для подсчета количества сравнений

        // для начала найдем индекс среднего элемента массива
        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] > item) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " является " + ++position + " элементом в массиве");
            System.out.println("Метод бинарного поиска нашел число после " + comparisonCount +
                    " сравнений");
        } else {
            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после "
                    + comparisonCount + " сравнений");
        }
    }
}
