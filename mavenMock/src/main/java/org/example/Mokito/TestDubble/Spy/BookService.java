package org.example.Mokito.TestDubble.Spy;

public class BookService {
    private BookRepository bookRepository;
     public BookService(BookRepository bookRepository){
         this.bookRepository=bookRepository;
     }

     public void addbook(Book book){
          bookRepository.save(book);
     }


}
