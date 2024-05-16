import java.util.Vector;

class LegacyClassesInJava {
    
 
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
    

        Vector v1 = new Vector();
        Vector v2 = new Vector();
        Vector v3 = new Vector();
        

        v1.add(1);
        v1.add(2);
        v1.add(3);

        v2.add(1);
        v2.add(2);
        v2.add(3);

        v3.add(1);
        v3.add(2);
        v3.add(3);


        v1.addAll(1,v2);

        System.out.println(v1.indexOf(1));

        /**
         * Legacy class Names
         * 
         * Vector, 
         * 
         * 
         * **/

    }
}