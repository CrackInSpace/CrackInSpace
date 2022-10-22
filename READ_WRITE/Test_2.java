import java.io.*;
import java.util.Scanner;

public class Test_2{
    public static void main(String[] args) throws IOException {
        //Создаем и записываем в файл пример
        File file = new File("input.txt");
        file.createNewFile();
        FileWriter fw = new FileWriter(file);//В try нет смысла т.к. пометили метод
        //Scanner sc = new Scanner(System.in);//Если хотим в ручную вводить
        fw.write("2 + 7");
        fw.flush();
        fw.close();

        //Открывае файл и считываем пример
        FileReader fr = new FileReader("input.txt");
        Scanner sc = new Scanner(fr);
        //Создаем файл для ответа
        File file1 = new File("output.txt");
        file1.createNewFile();
        FileWriter fwAnswer = new FileWriter(file1);

        try{

            double a = sc.nextDouble();
            String ch = sc.next();
            double b = sc.nextDouble();
            double answer = 0;
            boolean check = true;

            switch(ch){
                case "+":
                    answer = a + b;
                    break;
                case "-":
                    answer = a - b;
                    break;
                case "*":
                    answer = a * b;
                    break;
                case "/":
                    if(b != 0) answer = a / b;
                    else {
                        System.out.println("Error! Division by zero");
                        check = false;
                    }
                    break;
                default :
                    System.out.println("Operation Error!");
                    check = false;
                    break;
            }
            if(check) System.out.println(answer);
            //fw.write(String.valueOf(answer));
            fwAnswer.write(String.valueOf(answer));
    
        } catch (Exception ex){
            System.out.println("Error! Not number");
        }
        fwAnswer.close();
        sc.close();
    }
}