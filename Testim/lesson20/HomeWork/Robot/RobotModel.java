package lesson20.HomeWork.Robot;

import java.util.Comparator;

public class RobotModel implements Comparator<Robot> {
    @Override
    public int compare(Robot o1, Robot o2) {
        return CharSequence.compare(o1.getModel(), o2.getModel());
    }
}
