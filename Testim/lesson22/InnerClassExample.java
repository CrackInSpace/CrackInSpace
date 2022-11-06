package lesson22;

public class InnerClassExample {
    private  int exampleNonStatic = 5;
    private static int exampleStatic = 7;

    public static void main(String[] args) {

    }

    class InnerClass{
        void m(){
            System.out.println("Inner Class");
            System.out.println(exampleNonStatic);
            System.out.println(exampleStatic);
        }
    }
}
