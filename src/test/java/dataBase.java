import java.sql.*;

public class dataBase {
    public static void main(String[] args) throws SQLException {

        String Host="localhost";
        String port="3306";

       Connection con =DriverManager.getConnection("jdbc:mysql://"+ Host + ":" + port +"/qadbt","root","Root");
        Statement s=con.createStatement();
        ResultSet rs =s.executeQuery("select * from Employeeinfo;");
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }


    }
}
