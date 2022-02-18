package com.example.bookweb_ver1_jsp_serverlet.dbConnect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;
public class DBConnect {

    private static final String DB_URL= "jdbc:mysql://127.0.0.1:3306/bookdb";
    private static final String DB_USERNAME= "khuatlinh";
    private static final String DB_PASSWORD= "passisnone";

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
//            Statement stm = con.createStatement();
//            String query = "select * from book";
//            ResultSet rs = stm.executeQuery(query);
//            while(rs.next()) {
//                System.out.println("Book ID: " + rs.getInt(1));
//                System.out.println("Book Title: " + rs.getString(2));
//                System.out.println("Book Author: " + rs.getString(3));
//                System.out.println("Book Price: " + rs.getString(4));
//                System.out.println("------------------------");
//            }
//            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return con;
    }


}
