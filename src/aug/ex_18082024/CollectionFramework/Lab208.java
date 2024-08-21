package aug.ex_18082024.CollectionFramework;

import java.util.*;

public class Lab208 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(61);
        marks.add(81);
        marks.add(75);

        System.out.println(marks);

        Collections.sort(marks);
        System.out.println(marks);

        Collections.sort(marks, Comparator.reverseOrder());
        System.out.println(marks);

    }
}
