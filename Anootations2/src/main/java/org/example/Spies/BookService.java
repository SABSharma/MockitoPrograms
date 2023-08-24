package org.example.Spies;

import org.example.Stubbing.BookRepository;
import org.example.Stubbing.BookRequest;

import java.util.List;

public class BookService {


    public Book findbookById(String bookid) {
        // code bring from database
        return null;  // or it can return an excpetion like method no implemented
    }

    public int getAppliedDiscount(Book book, int discountRate) {

        int price = book.getPrice();
        int newprice=price-(price*discountRate/100);
        return newprice;
    }
}
