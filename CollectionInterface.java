import java.util.ArrayList;
import java.util.Collection;


public class CollectionInterface {
    public static void main(String[] args) {

        //Array return boolean values
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();

            a.add("aaa");
            a.add("bbb");
            a.add("ccc");

            b.add(111);
            b.add(222);
            b.add(333);

//            a.removeAll(a);
            System.out.println(b.remove(2));
        System.out.println(b);



//        System.out.println(a);
//        System.out.println(b);
//            b.addAll(a);
//        System.out.println(b);



    }
}
