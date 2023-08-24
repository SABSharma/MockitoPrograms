package org.example.Stubbing;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;
     public BookService(BookRepository bookRepository){
         this.bookRepository=bookRepository;
     }

    public List<Book> getNewBookDiscount(int discount , int pricegreater){
        List<Book> newBooks=bookRepository.findnewBooks(pricegreater);
        for(Book book :newBooks){
            int price=book.getPrice();
            int newPrice=price-(discount*price /100);
            book.setPrice(newPrice);
        }
        return newBooks;
    }

    public int calculatetotalcost(List<String> bookid){
        int total=0;
        for(String s : bookid){
            Book book= bookRepository.findBookByBookId(s);
            total= total + book.getPrice();

        }
        return total;

    }

    public void addbook(Book book){
         bookRepository.save(book);
    }

    public void addbook(BookRequest bookrequest){

         Book book = new Book();
         book.setTittle(bookrequest.getTittle());
         book.setPrice(bookrequest.getPrice());

         bookRepository.save(book);
    }



}
