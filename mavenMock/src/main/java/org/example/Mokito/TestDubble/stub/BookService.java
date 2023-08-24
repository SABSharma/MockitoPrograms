package org.example.Mokito.TestDubble.stub;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;
     public BookService(BookRepository bookRepository){
         this.bookRepository=bookRepository;
     }

    public List<Book> getNewBookDiscount(int discount , int pricegreater){
        List<Book> newBooks=bookRepository.findnewBooks(pricegreater);
        for(org.example.Mokito.TestDubble.stub.Book book :newBooks){
            int price=book.getPrice();
            int newPrice=price-(discount*price /100);
            book.setPrice(newPrice);
        }
        return newBooks;
    }



}
