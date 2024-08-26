package Aug2024.ex_24082024.ex_List;

import java.util.Stack;

public class Lab213 {
    public static void main(String[] args) {
        // Vector, Stack - Legacy - 95% of time we are not going to use it in automation
        // legacy ? -> Old

        Stack s = new Stack();
        s.add("Aasif"); // We can use normal function also

        // Stack has important operations like peek(), pop(), push(), search()
        // and other operations are same as Vector

        s.push("Sofiya"); // used to insert/add element
        s.add("Eman");  // we can use add function also
        s.push("Ansari");
        s.push("Javed");
        System.out.println(s);

        System.out.println(s.peek()); // Give the top element
        System.out.println(s.pop()); // remove the top element
        System.out.println(s);
    }
}
