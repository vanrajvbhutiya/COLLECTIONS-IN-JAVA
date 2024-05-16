import java.util.*;


class Test {

}
public class IteratorAndListIterator {
    public static void main(String[] args) {



        List a = new ArrayList();

        a.add(100);
        a.add(true);
        a.add(null);
        a.add('v');
        a.add("vanraj");
        a.add(13.14);

        ListIterator l = a.listIterator();

        while(l.hasNext()) {
            System.out.println(l.next());
        }
        while(l.hasPrevious()) {
            System.out.println(l);
        }


        //Diffrence between listiterator and iterator
//        List l = new ArrayList();
//        l.add(1);
//        l.add(2.3);
//        l.add('v');
//        l.add("vanraj");
//        l.add(true);
//        Iterator le  =  l.iterator();
//        while(le.hasNext()) {
//            System.out.println(le.next());
//        }

//
//        Set s = new HashSet();
//        s.add(1);
//        s.add(null);
//        s.add(99);
//
//        ListIterator l = s.list();

    }
}
