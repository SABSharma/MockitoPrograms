package org.example.Annotations;

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
