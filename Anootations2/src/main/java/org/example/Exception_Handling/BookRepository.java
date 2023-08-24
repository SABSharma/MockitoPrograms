package org.example.Exception_Handling;

import java.sql.SQLException;
import java.util.List;

public interface BookRepository {


    List<Book> findallBooks() throws SQLException;
}
