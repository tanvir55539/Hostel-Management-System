package project;

import java.sql.*;

public class ConnectionProvider {

    public static Connection getCon() {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdu_hostel", "root", "robin123");
          return con;
        }
        catch(Exception e){
        return null;
        }
        }
    }