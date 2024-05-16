import java.util.ArrayList;

class Main {
    Main() {

        /*
        // Syntex Of an ArrayList
        // ArrayList is created on theh basis of growable and resizsiable Arrays
        // ArrayList is index based data structure
        //
        *  class ArrayList implements List {
        *
        *    Constructors
        *    Methods
        *
        *  }
        *
        *
        * */
        //ArrayList Present In java.util Package
        ArrayList<String> al = new ArrayList<>();

        al.add("10");
        al.add("11");
        al.add("12");
        al.add("13");

        Integer sizeOfArray = al.size();

        System.out.println("Size Of ArrayList Is : "+sizeOfArray);


    }

    public static void main(String[] args) {

        new Main();
        // List al = new ArrayList<>();
        // al.add(10);
        // al.add(3.14);
        // al.add(312345F);
        // al.add(4356776543d);
        // al.add('v');
        // al.add("hello");
        // al.add(false);

        // Both Are use to traval the array in java listiterator and iterator

        // ListIterator lit = al.listIterator();

        // while (lit.hasNext()) {
        // System.out.println(lit.next());
        // }
        // // System.out.println(al);
        // // java.util.Iterator i = al.iterator();

        // // // System.out.println(i);
        // // while (i.hasNext()) {
        // // System.out.println(i.next());
        // // }

        // System.out.println("End Of The Code...");
        // listiterator,iterator,enumeration this are the curser in java three types
//        Vector v = new Vector();
//        v.add(10);
//        v.add(11);
//        v.add(12);
//        v.add(13);
//        v.add(14);
//
//        Enumeration e = v.elements();
//
//        while (e.hasMoreElements()) {
//
//            Integer ref;
//
//            ref = Integer.valueOf(e.nextElement() + "");
//            if (ref == 11) {
//                System.out.println("YOU HAVE A 11 NUMBER IN YOUR PROGRAM..");
//            }
//
//            // E.printStackTrace();
//        }
//        System.out.print(e.nextElement() + " ");
    }
}
