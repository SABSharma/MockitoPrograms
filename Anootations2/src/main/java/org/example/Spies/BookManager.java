package org.example.Spies;

public class BookManager {
    private BookService bookService;

    public BookManager(BookService bookService){
        this.bookService=bookService;
    }

    public int appllyDiscount(String bookid , int discountRate){

        Book book = bookService.findbookById(bookid);  // we need to mock
        int discountedPrice = bookService.getAppliedDiscount(book , discountRate); // we need to call
        return  discountedPrice;
    }

}
