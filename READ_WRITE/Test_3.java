import java.io.*;
import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        Scanner sc1 = new Scanner(file);
        Scanner sc2 = new Scanner(file);
        FileWriter fw = new FileWriter("output.txt");
        while (sc1.hasNext()) {
            try {
                double a = sc1.nextDouble();
                String op = sc1.next();
                double b = sc1.nextDouble();
                String ops = "+-*/";
                String result = "";
                if (!ops.contains(op)) result = "Operation Error!";
                switch (op) {
                    case "+": result = Double.toString(a + b); break;
                    case "-": result = Double.toString(a - b); break;
                    case "*": result = Double.toString(a * b); break;
                    case "/": result = (b == 0 ? "Error! Division by zero" : Double.toString(a / b)); break;
                }
                fw.append(sc2.nextLine() + " = " + result + "\n");
                fw.flush();
            } catch (Exception ex) {
                fw.append(sc2.nextLine() + " = " + "Error! Not number" + "\n");
                fw.flush();
                sc1.nextLine();
            }
        }
        fw.close(); sc1.close(); sc2.close();
    }
}