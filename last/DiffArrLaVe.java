import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

public class DiffArrLaVe  extends Thread{
    @Override
    public void run() {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(11);
        al.add(12);
        System.out.println(al);
    }

    public static void main(String[] args) throws SQLException {


        DiffArrLaVe t1 = new DiffArrLaVe();
        t1.start();

        Vector v = new Vector();
        System.out.println(v.capacity());


        String url = "jdbc:mysql://localhost:3306/p";
        String useName = "root";
        String password= "root";

        Connection con = DriverManager.getConnection(url,useName,password);

        String Query = "insert into demo values(3,'mayur',20)";
        PreparedStatement ps = con.prepareStatement(Query);

//        ResultSet rs = ps.executeQuery();
        int ref = ps.executeUpdate();

            if(ref > 0) {
                System.out.println("Data Inserted Succ..");
            }else{
                System.out.println("Something Wrong in This Code");
            }



        /*
         *  ArrayList Is not Legacy Class introduce 1.2 version ->  nom-sync.
         *  Vector Is Legacy Class introduce 1.0 version -> sync.
         *  ArrayList Not Thread Safe.
         *  Vector is Thread Safe.
         * */

    }
}
