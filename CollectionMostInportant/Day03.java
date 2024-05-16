import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Day03 {
    public static void main(String[] args) {

        System.out.println("Hello Java");
        //collection framework is use to store multiple data
        //MAP & Collection Are Know As Collections Framework

        //Collection is interface
            //list
                //arraylist
                //linklist
                //vector
                //stack
            //set
                //hashset
                //linkedHashSet
                //SortedSet
                //TreeSet
            //queue
                //priorityQueue
                //DQueue
                //ArrayDQueue

        //MAP -> interface Map Store Key/value pair
            //HashMAp
            //HashTable
            //SortedMap
            //TreeMap

        List l = new ArrayList<Integer>();

        l.add(12);
        l.add("Demo");
        l.add('w');

        System.out.println(l);

        Iterator la = l.iterator();
        while(la.hasNext()) {
            System.out.print(la.next()+" ");
        }

        Map m = new HashMap();
        m.put(1,11);
        m.put(2,22);

        System.out.println(m.containsKey(1));

    }
}
