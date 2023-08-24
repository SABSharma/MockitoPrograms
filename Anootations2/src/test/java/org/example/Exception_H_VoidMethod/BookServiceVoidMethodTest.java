package org.example.Exception_H_VoidMethod;

import org.example.Exception_H_VoidEMehod.Book;
import org.example.Exception_H_VoidEMehod.BookRepository;
import org.example.Exception_H_VoidEMehod.BookService;
import org.example.Exception_H_VoidEMehod.DataBAseWriteException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;

@ExtendWith(MockitoExtension.class)
public class BookServiceVoidMethodTest {

    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;


    @Test
    public void TestBookServicevoid_Add_Method() throws SQLException {
        Book book = new Book("100","Bootle" ,1200);

        Mockito.doThrow(SQLException.class).when(bookRepository).save(book);

        Assertions.assertThrows(DataBAseWriteException.class,()->bookService.addBook(book));



    }


}
