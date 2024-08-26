package Aug2024.ex_24082024.ex_List;

import java.util.ArrayList;
import java.util.Collections;

public class Lab215 {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();
        marks.add(50);
        marks.add(75);
        marks.add(90);
        marks.add(55);
        Collections.sort(marks); // Natural sorting
        System.out.println(marks);

        ArrayList names = new ArrayList();
        names.add("sofiya");
        names.add("eman");
        names.add("aiza");
        names.add("javed");
        names.add("Sofiya");
        names.add("Hannan");

        Collections.sort(names); //  H, S, a, e, j, s -> Natural Sorting first alpha
        System.out.println(names);
    }
}
