package org.MockitoJnit4.Runner;

import java.util.List;

public interface BookRepository {
    public List<Book> findnewBooks(int greatethanprice);
}
