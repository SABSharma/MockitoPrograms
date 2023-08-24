package org.example.Spies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BookManagerTest {

    @InjectMocks
    private BookManager bookManager;

    @Spy
    private BookService bookService;


    @Test
    public void tesTMockitoSpy(){

         // 1st way of creating spy
           // 2nd way is annotaion which is cfeated abiove
//        BookService bookService = Mockito.spy(BookService.class);
//        BookManager bookManager = new BookManager(bookService);



    }

    @Test
    public void TestMockitoSpy_WithAnootaion(){
        Book book = new Book("123","classmate" ,100);

        Mockito.when(bookService.findbookById("1234")).thenReturn(book);


        int discointprice = bookManager.appllyDiscount("1234", 10);
        Assertions.assertEquals(90,discointprice);



    }
}
