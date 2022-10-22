import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("G:/digital.txt");//В try нет смысла т.к. пометили метод
        Scanner sc = new Scanner(fr);

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

        } catch (Exception ex){
            System.out.println("Error! Not number");
        }
        sc.close();
    }
}