package org.example.BehvaiourVerification;

import java.util.List;

public interface BookRepository {


    void save(Book book);

    Book findBookById(String id);
}
