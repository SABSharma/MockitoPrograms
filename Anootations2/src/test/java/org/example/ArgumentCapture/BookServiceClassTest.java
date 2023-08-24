package org.example.ArgumentCapture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BookServiceClassTest {

    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;

    @Captor
    private ArgumentCaptor<Book> bookArgumentCaptor;

    @Test
    public void testArgumnetcapture_SaveBook(){
        BookRequest bookRequest = new BookRequest("Mockito In Action", 500);

        // In place of this line we use the aanaotaion above
        // ArgumentCaptor<Book> bookArgumentCaptor = ArgumentCaptor.forClass(Book.class);
        bookService.addbook1(bookRequest);


        //  pehle hm yahan manuallu Book ka instance create krke data bhej rhe the ab hm
        // directly  hi Argument jo bhi method call me aayenge unko calture karenge ur save method usse arguments se chla denge

        Mockito.verify(bookRepository).save(bookArgumentCaptor.capture());

        Book book= bookArgumentCaptor.getValue();

        Assertions.assertEquals("Mockito In Action" , book.getTittle());
    }
}
