package lesson20.Test;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
