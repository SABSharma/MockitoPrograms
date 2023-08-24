package org.example.Mokito.TestDubble.Stub;

import org.example.Mokito.TestDubble.stub.Book;
import org.example.Mokito.TestDubble.stub.BookRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BookRepositoryStub implements BookRepository {

    @Override
    public List<Book> findnewBooks(int greatethanprice) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("124","JAVA",400));
        books.add(new Book("123","Pythonm",600));

        return books;
    }
}
