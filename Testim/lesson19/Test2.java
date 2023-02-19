package lesson19;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("До переопределения методов equals и hashCode ответы будут:\n" +
                "false\nfalse\n\ntrue\ntrue\n\nfalse\nfalse");
        System.out.println("/================================\\");

        Test test1 = new Test();
        Test test2 = new Test();

        System.out.println(test1.hashCode() == test2.hashCode());//hashCode() превращает ссылку на объект в уникальное число
        System.out.println(test1.equals(test2));
        System.out.println();


        Test test3 = test2;
        System.out.println(test3.hashCode() == test2.hashCode());//true
        System.out.println(test3.equals(test2));//true
        System.out.println();


        Test test4 = new Test(30, 20.20);//пофиг на параметры, главное, что ссылки разные.
        Test test5 = new Test(30, 20.20);//В этом и кроется главная причина.
        // Поэтому мы должны переопределять методы equals и hashCode в своих классах
        System.out.println(test4.hashCode() == test5.hashCode());
        System.out.println(test4.equals(test5));
        System.out.println("/==========================\\");


        //Иногда придётся писать методы equals и hashCode в ручную, а не с помощью автогенерации.
        //Чтобы проверить, правильно ли мы переопределили методы. Мы должны придерживаться 4 правилам
        Test test7 = new Test(30, 20.20);
        Test test8 = new Test(30, 20.20);
        Test test9 = new Test(30, 20.20);

        System.out.println(test7.equals(test7)); // Рефлексивность

        System.out.println(test7.equals(test8) && test8.equals(test9) && test7.equals(test9));// Транзитивность

        System.out.println(test7.equals(test9) && test9.equals(test7));// Симметричность

        System.out.println(test7.equals(null));//Должно вернуть false
    }
}
