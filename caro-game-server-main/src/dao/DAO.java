
package dao;

import java.sql.Connection;
import java.sql.*;

public class DAO {
    protected Connection con;

    public DAO() {
        
       // String jdbcURL = "jdbc:SQLEXPRESS://localhost:3306/caronhom3?useSSL=false";
       String jdbcURL="jdbc:mysql://localhost:3306/creat_db?useSSL=true";
        String jdbcdb="creat_db";
        String jdbcUsername = "root";
        String jdbcPassword = ""; //please change information to connect to DB
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            System.out.println("Kết nối thành công.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Kết nối với cơ sở dữ liệu không thành công.");
        }
    }
}