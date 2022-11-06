package lesson20.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Example2 {
    public static void main(String[] args) {
        User user1 = new User("Jhon", 34, 3000);
        User user2 = new User("Mark", 27, 3400);

        Comparator<User> userComparator = new UserComparator();
        Comparator<User> userAgeComparator = new UserAgeComparator();

        Map<User, String> map = new TreeMap<>(userComparator.thenComparing(userAgeComparator).thenComparing(User::getName));
        map.put(user1, "text1");
        map.put(user2, "text2");

        for (Map.Entry<User, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
