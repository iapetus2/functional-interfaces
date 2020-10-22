import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CustomTime _1 = new CustomTime(0, 0, 0);
        CustomTime _2 = new CustomTime(0, 1, 0);
        CustomTime _3 = new CustomTime(0, 0, 59);
        CustomTime _4 = new CustomTime(0, 59, 59);
        CustomTime _5 = new CustomTime(24, 0, 59);

        List<CustomTime> list = Arrays.asList(_1, _2, _3, _4, _5);
        Collections.shuffle(list);

        //todo compare here
        list.sort();
        System.out.println(list);
    }
}
