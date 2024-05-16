import java.util.Vector;

import java.util.Enumeration;
public class Enumerationx {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add(10);
        v.add("vanraj");
        v.add(12.14);
        v.add(true);
        System.out.println(v);
        Enumeration  e = v.elements();

        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
