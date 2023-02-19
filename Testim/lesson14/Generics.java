package lesson14;

import lesson14.example.Example1;
import lesson14.example.Example2;
import lesson14.model.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Generics {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();
        System.out.println("/-----------------------------------/");

        Example1<User> example1 = new Example1<>();
        System.out.println(example1.get());
        example1.set(new User("Lol", 30));
        System.out.println(example1.get());
        System.out.println("/-----------------------------------/");


        //Example2.simpleInit(new User());
        Example2<User> example2 = Example2.init(new User());
        example2.set(new User("Alex", 30));
        System.out.println(example2.getInstance());
        System.out.println("/-----------------------------------/");

    }
}
