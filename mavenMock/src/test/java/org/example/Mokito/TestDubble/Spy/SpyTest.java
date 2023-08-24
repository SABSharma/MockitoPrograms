package org.example.Mokito.TestDubble.Spy;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpyTest {

    @Test
    public void dempSpy(){
        BookRepository bookrepo=new SpyBookRepo();
        BookService bookService = new BookService(bookrepo);
        bookService.addbook(new Book("1","iphonr",94000));
        bookService.addbook(new Book("2","Android",14000));

        //assertEquals(3, ((SpyBookRepo) bookrepo).timesCalled());
        assertEquals(2,((SpyBookRepo) bookrepo).timesCalled());

    }
}
