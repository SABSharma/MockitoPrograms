package org.example.Annotations;

import java.util.Collection;

public interface BookRepository {
    void save(Book book);
    Collection<Book> findallBooks();
}
