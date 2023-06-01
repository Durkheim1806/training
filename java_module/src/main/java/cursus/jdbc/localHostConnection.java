package cursus.jdbc;

import java.sql.*;

public class localHostConnection {


    public static void main(String[] args) {

//        Class.forName("com.mysql.cj.jdbc.Driver");

        try (
                Connection connectionLocalHost = DriverManager.getConnection("jdbc:mysql://localhost:3306/pubs", "root", "");
        ) {
            PreparedStatement p = connectionLocalHost.prepareStatement("select * from publishers;");
            ResultSet rs = p.executeQuery();
            p.execute();

            while (rs.next()) {
                String name = rs.getString("PUB_NAME");
                String city = rs.getString("city");
                System.out.println(name + "\t\t" + city);

            }
        } catch (SQLException sqlException) {
            System.out.println("foute boel");
        }
    }
}
