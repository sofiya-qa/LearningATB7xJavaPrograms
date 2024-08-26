package Aug2024.ex_24082024.ex_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab214 {
    public static void main(String[] args) {
        // Student - name, id

        Student s1 = new Student(4,"Supriya");
        Student s2 = new Student(2,"Eman");
        Student s3 = new Student(5,"Sofiya");
        Student s4 = new Student(3,"Javed");
        Student s5 = new Student(1,"Hannan");


        List arrayList = new ArrayList();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        arrayList.add(s5);

        System.out.println(arrayList);

      //  Collections.sort(arrayList); // Comparable

      //  Collections.sort(arrayList, new SortByName());
      //  Collections.sort(arrayList, new SortByID())
         Collections.sort(arrayList, new SortByNameDesc());

        System.out.println(arrayList);

    }
}

// Using comparator interface
// basically we can have our own comparison logic.
class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class SortByID implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

class SortByNameDesc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
// class Student implements Comparable<Student> {

   class Student{
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

//        @Override
//    public int compareTo(Student another) {
//        return Integer.compare(this.id, another.id);
//    }

    // We can not have both the function (Sort by id & Sort by name) in comparable

//    @Override
//    public int compareTo(Student another) {
//        return CharSequence.compare(this.name, another.name);
//    }

}