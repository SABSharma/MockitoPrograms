package org.example.Mokito.TestDubble.Stub;

import org.example.Mokito.TestDubble.stub.Book;
import org.example.Mokito.TestDubble.stub.BookRepository;
import org.example.Mokito.TestDubble.stub.BookService;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StubTest {

    @Test
    public void testStub(){

        BookRepository bookRepository = new BookRepositoryStub();
        BookService bookService= new BookService(bookRepository);

        List<Book> bookswithsicount =bookService.getNewBookDiscount(10,500);
        System.out.println("inside the studs folder");

        assertEquals(2,bookswithsicount.size());

    }

    @Test
    public void testStubMokito(){

        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService= new BookService(bookRepository);

        List<Book> books = new ArrayList<>();
        Book book1 = new Book("1","laptopAsus", 120000);
        Book book2 = new Book("2","laptopapple", 500000);
        Book book3 = new Book("3","laptophp", 320000);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        when(bookRepository.findnewBooks(500)).thenReturn(books);
        List<Book> bookDiscount =bookService.getNewBookDiscount(10,500);
        System.out.println("inside the stubs Mokito  folder");

       assertEquals(3,bookDiscount.size());

    }
}
