
/*
 * Methods And Constructors
 * 
 * 
*/

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class Car {

    Car() {
    }

    boolean isStart(boolean ref) {
        if (ref) {
            return true;
        } else {
            return false;
        }
    }

}

public class LinkedlistMethodAndCon {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Car car1 = new Car();
        boolean startOrNot = car1.isStart(true);

        System.out.println(startOrNot);

        LinkedList l = new LinkedList();

        // l.add(10);
        // l.add(10.22);
        // l.add('v');
        // l.add("hello");
        // l.add(null);
        // l.add(true);

        // System.out.println(l);

    }
}
