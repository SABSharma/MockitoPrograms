package org.example.Mokito.TestDubble.fake;

import org.example.Mokito.TestDubble.fake.Book;

import java.util.Collection;

public interface BookRepository {
    void save(Book book);
    Collection<Book> findallBooks();
}
