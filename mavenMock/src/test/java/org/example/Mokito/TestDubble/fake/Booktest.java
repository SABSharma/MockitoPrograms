package org.example.Mokito.TestDubble.fake;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collection;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class Booktest {

    @Test
    public void testfake(){
        BookRepository bookRepository= new FakeBookRepository();
        BookService bookService= new BookService(bookRepository);
        // ab yahan bookService class me jaake , isko bookRepository ka object chahiye , pr hum original use nahi krenge to hame ek aoni fake
        //class implemnet krne padege
        bookService.addbook(new Book("124","JAVA",400));
        bookService.addbook(new Book("123","Python",300));

        //test
        //assertEquals(2,2);
        System.out.println("Good to Go chief");
        //assertEquals(2,bookService.findnumberofBooks());


    }

    // Mock test Mockito

    @Test
    public void testFakeWithMockito(){
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService=new BookService(bookRepository);

        Book book1= new Book("124","JAVA",400);
        Book book2 = new Book("123","Python",1000);

        Collection<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        // ab hm isko bta rhe hn ki jb bookrepi=sitory ka findall method call hogato kaya return krna h
        Mockito.when(bookRepository.findallBooks()).thenReturn(books);


        System.out.println("You are dealing with mockito");
        assertEquals(2,bookService.findnumberofBooks());





    }



}
