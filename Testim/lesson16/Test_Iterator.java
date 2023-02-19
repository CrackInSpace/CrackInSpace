package lesson16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("text1");
        list.add("text2");
        list.add("text3");

        //Итератор нужен, чтобы возвращать значения которые мы в него записываем.
        //Может работать в паре с коллекцией SET у которой нет метода get
        Iterator<String> iterator = list.iterator();//Возвращает объект list т.е. new ArrayList<>();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

        /*for(String s : list){//for each работает как итератор.
            System.out.println(s);//for each не может изменять содержимое массивов!
        }*/
    }
}
