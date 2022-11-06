package lesson22.AnonymousClass;

public class AnonymousClassExample {
    public static void main(String[] args) {
        Flyable duck = new Duck();
        duck.fly();

        
        Flyable obj = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Im flying!!!");
            }
        };
        obj.fly();


        Flyable obj1 = () -> System.out.println("With help lambda!!!");
        obj1.fly();
    }
}
