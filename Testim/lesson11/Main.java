
package lesson11;

public class Main {
    public static void main(String[] args) {
        Human father = new Human("Kolya", true, 45);
        Human mather = new Human("Vika", false, 47);
        Human daughter = new Human("Any", false, 21, father, mather);
        Human son = new Human("Dima", true, 19, father, mather);
        System.out.println(daughter + ".");//Не явный вызов метода toString
        System.out.println(son.toString() + ".");
    }
}
