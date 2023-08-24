package org.example.Exception_H_VoidEMehod;

import org.example.Exception_Handling.DatabaseReadException;

import java.sql.SQLException;
import java.util.List;
import java.util.zip.DataFormatException;

public class BookService {
    private BookRepository bookRepository;
     public BookService(BookRepository bookRepository){
         this.bookRepository=bookRepository;
     }


     public int totalprizeofbooks() throws DataFormatException, DatabaseReadException {
         List<Book> books= null;
         try {
             books = bookRepository.findallBooks();
         } catch (SQLException e) {
             // Log the  exception
             throw new DatabaseReadException("Unable toread dta from db -");
         }
         int total_price=0;
        for(Book book : books){
            total_price=total_price+book.getPrice();
        }
        return total_price;
     }


     public void addBook(Book book){
         try {
             bookRepository.save(book);
         } catch (SQLException e) {
             throw new DataBAseWriteException("Unable To write in dtatabase due to - "+ e.getMessage());
         }
     }








}
