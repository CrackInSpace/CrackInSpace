package lesson14.example;

public class Example1<T> {
    private T instance;

    public T get(){
        return instance;//Неявно вызывает toString в классе User
    }

    public void set(T obj){
        instance = obj;
    }
}
