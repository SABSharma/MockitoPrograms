package org.MockitoJnit4.Annotaions.Runner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

//@RunWith(MockitoJUnitRunner.class)
public class AnnoationRunnerJunit4 {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    // Another way of using without test runner
    @Before
    public void befreEach(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void Junit4Runnertest(){

        List<Book> books = new ArrayList<Book>();
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
