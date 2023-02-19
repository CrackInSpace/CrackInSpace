package lesson20.HomeWork.Robot;

import java.util.Comparator;

public class RobotPower implements Comparator<Robot> {

    @Override
    public int compare(Robot o1, Robot o2) {
        return Integer.compare(o1.getPower(), o2.getPower());
    }
}
