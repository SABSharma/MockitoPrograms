package org.example.Exception_H_VoidEMehod;

import java.sql.SQLException;
import java.util.List;

public interface BookRepository {


    List<Book> findallBooks() throws SQLException;
    void save(Book book) throws SQLException;
}
