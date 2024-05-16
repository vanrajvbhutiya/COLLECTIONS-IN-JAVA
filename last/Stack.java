public class Stack {

    
    public static void main(String[] args) {

        // Stack In Collection Framework.

        java.util.Stack s = new java.util.Stack<>();

        s.push("one");
        s.push("two");
        s.push("three");
        s.push("four");

        System.out.println(s);
        Object deleted = s.removeFirst();

        System.out.println(s);
        System.out.println(s.indexOf("one"));

        System.out.println(s.empty());


    }
}
