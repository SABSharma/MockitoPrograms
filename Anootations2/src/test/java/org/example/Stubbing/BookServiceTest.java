package org.example.Stubbing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;

    @Test
    public void testCalculateToatalCostOfBOOks(){
        List<String> bookids = new ArrayList<>();
        bookids.add("22");
        bookids.add("33");

        Book book1 = new Book("22" ,"cello" ,500);
        Book book2 = new Book("33" ,"milton", 500);
        //Second method by do return
       // Mockito.doReturn(book1).when(bookRepository).findBookByBookId("22");

       Mockito.when(bookRepository.findBookByBookId("22")).thenReturn(book1);
        Mockito.when(bookRepository.findBookByBookId("33")).thenReturn(book2);
        int cost=bookService.calculatetotalcost(bookids);


         assertEquals(1000,cost);






    }

    @Test
    public void saveBookTest(){
        Book book1 = new Book("303" ,"mockito",1000);
        Mockito.doNothing().when(bookRepository).save(book1); // ==
        bookService.addbook(book1);


    }

    @Test
    public void saveBookWithBookRequestTest(){
       BookRequest bookRequest= new BookRequest("mockito",500);
        Book book1 = new Book(null  ,"mockito",500);
        Mockito.doNothing().when(bookRepository).save(book1); // ==
        bookService.addbook(bookRequest);


    }


}
