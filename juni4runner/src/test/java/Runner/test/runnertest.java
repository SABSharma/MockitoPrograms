package Runner.test;

import org.MockitoJnit4.Runner.Book;
import org.MockitoJnit4.Runner.BookRepository;
import org.MockitoJnit4.Runner.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class runnertest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;


    @Test
    public void AnnotaionRunner(){
        List<Book> books = new ArrayList<>();
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
