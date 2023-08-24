package org.example.Mokito.TestDubble.fake;

import org.example.Mokito.TestDubble.fake.Book;
import org.example.Mokito.TestDubble.fake.BookRepository;

public class BookService {
    private BookRepository bookRepository;
     public BookService(BookRepository bookRepository){
         this.bookRepository=bookRepository;
     }

     public void addbook(Book book){
          bookRepository.save(book);
     }

     public int findnumberofBooks(){
         return bookRepository.findallBooks().size();
     }

}
