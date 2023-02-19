package lesson14.example;

public class Example2<T> {
    private T instance;

    private Example2(){

    }

    public static <T> void simpleInit(T instance){//<T> Проинициализируется тем типом который в
        // параметрах (T instance)
        T obj = instance;      //  User obj;
        System.out.println(obj);
    }

    public static <T> Example2<T> init(T instance){
        return new Example2<>();//Тут будет передаваться значение от (T instance)
    }
    public void set(T obj){
        instance = obj;
    }
    public T getInstance(){
        return instance;
    }
}
