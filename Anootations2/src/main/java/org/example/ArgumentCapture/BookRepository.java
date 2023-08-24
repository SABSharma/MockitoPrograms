package org.example.ArgumentCapture;

public interface BookRepository {


    void save(Book book);

    Book findBookById(String id);
}
