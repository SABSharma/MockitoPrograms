package org.example.Mokito.TestDubble.fake;


import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    public void testfake(){

        BookRepository bookRepository= new FakeBookRepository();
       // BookService bookService= new BookService(bookRepository);

        BookService bookService= new BookService(bookRepository);
        // ab yahan bookService class me jaake , isko bookRepository ka object chahiye , pr hum original use nahi krenge to hame ek aoni fake
        //class implemnet krne padege
        bookService.addbook(new Book("124","JAVA",400));
        bookService.addbook(new Book("123","Python",300));

        //test
       // assertEquals(2,bookService.findnumberofBooks());
    }


}