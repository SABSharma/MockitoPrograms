package org.example.Stubbing;

import java.util.List;

public interface BookRepository {
    public List<Book> findnewBooks(int greatethanprice);

    Book findBookByBookId(String bookid);

    void save(Book book);
}
