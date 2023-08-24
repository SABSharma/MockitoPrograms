package org.example.BehaviourVerification;

import org.example.BehvaiourVerification.Book;
import org.example.BehvaiourVerification.BookRepository;
import org.example.BehvaiourVerification.BookRequest;
import org.example.BehvaiourVerification.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class BookServiceBehviourtest {

    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;

    @Test
    public void  testaddBook() {

        Book book = new Book("200" ,"errorcode" , 400);
        bookService.addbook(book);
        Mockito.verify(bookRepository).save(book);

    }

    @Test
    public void saveBookWithBookRequestTest(){
//        BookRequest bookRequest= new BookRequest("mockito",500);
        BookRequest bookRequest= new BookRequest("mockito" ,400);
        Book book1 = new Book(null  ,"mockito",400);
      //  Mockito.doNothing().when(bookRepository).save(book1); // ==
       // ab hm yahan se bookService addbook1() with bookrequest call karrenge
        bookService.addbook1(bookRequest);

        // yahan pr internally to book hi call ho rha h  to verify hm book ko hi karenge
        Mockito.verify(bookRepository ,Mockito.times(0)).save(book1);

    }

    @Test
    public void saveBookWithBookRequestTest2(){
//        BookRequest bookRequest= new BookRequest("mockito",500);
        BookRequest bookRequest= new BookRequest("mockito" ,1000);
        Book book1 = new Book(null  ,"mockito",1000);
        //  Mockito.doNothing().when(bookRepository).save(book1); // ==
        // ab hm yahan se bookService addbook1() with bookrequest call karrenge
        bookService.addbook1(bookRequest);

        // yahan pr internally to book hi call ho rha h  to verify hm book ko hi karenge
        Mockito.verify(bookRepository ,Mockito.times(0)).save(book1);

    }

    @Test
    public void saveBookWithBookRequestTest33(){

        BookRequest bookRequest= new BookRequest("mockito" ,400);
        Book book1 = new Book(null  ,"mockito",400);

        bookService.addbook1(bookRequest);
        //Mockito.verify(bookRepository ,Mockito.times(0)).save(book1);
      // Same as Above
        Mockito.verify(bookRepository ,Mockito.never()).save(book1);

    }

    //34 video verifyNointeration
    // in successful scenario two cases will be calaled
    @Test
    public void testupdatePrize(){

//          Book book = new Book("22","Lamel" ,100);
//          Mockito.when(bookRepository.findBookById("22")).thenReturn(book);
          bookService.updatePrize(null ,500);
          Mockito.verifyNoInteractions(bookRepository);

    }

    @Test
    public void testupdatePrize2(){

          Book book = new Book("22","Lamel" ,500);
          Mockito.when(bookRepository.findBookById("22")).thenReturn(book);
        bookService.updatePrize2("22" ,500);

        Mockito.verify(bookRepository).findBookById("22");
        Mockito.verifyNoMoreInteractions(bookRepository);

    }

    @Test
    public void testupdatePrizeOrderVerification(){

        Book book = new Book("22","Lamel" ,500);
        Mockito.when(bookRepository.findBookById("22")).thenReturn(book);
        bookService.updatePrize2("22" ,700);

        InOrder inOrder = Mockito.inOrder(bookRepository);
        //inOrder.verify(bookRepository).save(book);
        inOrder.verify(bookRepository).findBookById("22");
        inOrder.verify(bookRepository).save(book);

        Mockito.verifyNoMoreInteractions(bookRepository);

    }

    @Test
    public void saveBookWithBookRequestTest37(){
//        BookRequest bookRequest= new BookRequest("mockito",500);
        BookRequest bookRequest= new BookRequest("mockito" ,1000);
        Book book1 = new Book(null  ,"mockito",1000);

        //  Mockito.doNothing().when(bookRepository).save(book1); // ==
        // ab hm yahan se bookService addbook1() with bookrequest call karrenge
        bookService.addbook1(bookRequest);
        bookService.addbook1(bookRequest);
        bookService.addbook1(bookRequest);

        // yahan pr internally to book hi call ho rha h  to verify hm book ko hi karenge
        //Mockito.verify(bookRepository ,Mockito.times(0)).save(book1);

        Mockito.verify(bookRepository,Mockito.atLeast(2)).save(book1);
        Mockito.verify(bookRepository,Mockito.atMost(4)).save(book1);

    }
}
