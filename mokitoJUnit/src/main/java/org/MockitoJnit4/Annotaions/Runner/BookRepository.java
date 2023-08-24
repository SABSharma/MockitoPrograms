package org.MockitoJnit4.Annotaions.Runner;

import java.util.List;

public interface BookRepository {
    public List<Book> findnewBooks(int greatethanprice);
}
