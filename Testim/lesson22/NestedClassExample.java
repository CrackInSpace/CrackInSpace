package lesson22;

public class NestedClassExample {
    private  int exampleNonStatic = 5;
    private static int exampleStatic = 7;

    public static void main(String[] args) {

    }

    //Статический вложенный класс
    //В статических классах, как и в методах,
    // нельзя вызывать нестатические переменные
    static class NestedClass{
        void m(){
            System.out.println("Nested Class");
//            System.out.println(exampleNonStatic);
            System.out.println(exampleStatic);
        }
    }
}
