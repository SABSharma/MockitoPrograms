package org.example.Mokito.TestDubble.dummy;

import org.example.Dummy.Book;
import org.example.Dummy.BookRepository;
import org.example.Dummy.BookService;
import org.example.Dummy.EmailService;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class Dummytest {

    @Test
    public void testDummy(){
        BookRepository bookRepository=new FakeBookRepository();
        EmailService emailService=new EmailServiceImpl();

        BookService bookService = new BookService(bookRepository ,emailService);

        // ab yahan bookService class me jaake , isko bookRepository ka object chahiye , pr hum original use nahi krenge to hame ek aoni fake
        //class implemnet krne padege
       bookService.addbook(new Book("12" ,"pharamacy" ,100));
        bookService.addbook(new Book("11" ,"pharamacyD" ,1000));
        bookService.addbook(new Book("18" ,"pharamacyDm" ,10000));

        //test
        //assertEquals(2,2);
        System.out.println("Good to Go chief");
        assertEquals(3, bookService.findnumberofBooks());

    }

    @Test
    public void demoDummyWithMokito(){

        BookRepository bookRepository = mock(BookRepository.class);
        EmailService emailService=mock(EmailService.class);
        BookService bookService=new BookService(bookRepository,emailService);

        Book book2 = new Book("12","puyhom",300);
        Book book1 = new Book("13","C++",400);
        Book book3 = new Book("14","C",400);

        Collection<Book> books=new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        System.out.println("inside the Mokito  Dummytest");
        when(bookRepository.findallBooks()).thenReturn(books);
        assertEquals(3,bookService.findnumberofBooks());


    }
}
