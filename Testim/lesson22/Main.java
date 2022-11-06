package lesson22;

public class Main {
    public static void main(String[] args) {
        NestedClassExample.NestedClass nestedClass = new NestedClassExample.NestedClass();
        nestedClass.m();


        InnerClassExample innerClassExample = new InnerClassExample();
        InnerClassExample.InnerClass innerClass = innerClassExample.new InnerClass();
        innerClass.m();
    }
}
