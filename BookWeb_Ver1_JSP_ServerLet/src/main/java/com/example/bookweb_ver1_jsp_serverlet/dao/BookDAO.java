package com.example.bookweb_ver1_jsp_serverlet.dao;

import com.example.bookweb_ver1_jsp_serverlet.dbConnect.DBConnect;
import com.example.bookweb_ver1_jsp_serverlet.entity.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class BookDAO {
Connection connection;
    // tao construcor trong do ket noi voi dbconenct
    public BookDAO() {
        connection = DBConnect.getConnection();
    }
    // add cac Book vao trong List book nay
    public List<Book> selectAllBooks() {
        List<Book> bookList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM book";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            // tu động query từng cái 1, nice thật
            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                String title = resultSet.getString(2);
                String author = resultSet.getString("author");
                Float price = resultSet.getFloat("price");
                Book book = new Book(id,title,author,price);
                bookList.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookList;
    }
}
