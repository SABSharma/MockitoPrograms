package org.example.Mokito.TestDubble.Spy;

public class BookRespositorySpy implements BookRepository {


    int savecalled=0;
    Book lastAddedBook=null;
    @Override
    public void save(Book book) {

        savecalled++;
        lastAddedBook=book;


    }

    // behaviour verifications
    public int timesCalled(){
        return savecalled;
    }

    public  boolean calledWith(Book book){
        return lastAddedBook.equals(book);
    }
}
