package figure;

import figure_3.*;
import figure_3.figure_4_and_more.quadrangle;

public class Figure {
    public static void main(String[] args){
        System.out.println("Тестим пакеты");
        triangle t = new triangle();
        t.info();
        t.q();
        quadrangle q = new quadrangle();
        q.info();
        q.info();
        System.out.println("Закончили проверку");
    }
}
