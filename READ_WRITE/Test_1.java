import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

class Test_1 {
    public static void main(String[] args ) throws IOException {
        String s="";
        //создание файла и запись в него
        File file = new File("input.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write("2 + 8");
        writer.flush();
        writer.close();
        //чтение из файла
        try(FileReader reader = new FileReader("input.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                s+=(char)c;
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        //остальное то же, что и в предыдущем задании
        Object[] m = Arrays.stream(s.split(" ")).toArray();//загоняем значения в массив
        Double a,b;
        //через обработку исключений вычисляем а и в
        try {
            a = Double.valueOf(String.valueOf(m[0]));
        } catch (NumberFormatException e) {
            System.out.println("Error! Not number");
            return;
        }
        try {
            b = Double.valueOf(String.valueOf(m[2]));
        } catch (NumberFormatException e) {
            System.out.println("Error! Not number");
            return;
        }
        switch (String.valueOf(m[1])) {//обрабатываем знак операции, кроме деления
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(b!=0?a/b:"Error! Division by zero");//деление double через исключение не отловить, в отличие от int, поэтому обрабатываем его просто поиском нуля
                break;
            default:
                System.out.println("Operation Error!");
        }
    }
}