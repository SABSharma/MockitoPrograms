package org.example.Exception_Handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;
import java.util.zip.DataFormatException;

@ExtendWith(MockitoExtension.class)
public class BookServiceExceptionTest {

    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;

    @Test
    public void testtotalPriceOfBook() throws DataFormatException, DatabaseReadException, SQLException {
        Mockito.when(bookRepository.findallBooks()).thenThrow(SQLException.class);
       // int totalprice=bookService.totalprizeofbooks();
        Assertions.assertThrows(DatabaseReadException.class ,()->bookService.totalprizeofbooks());




    }

}
