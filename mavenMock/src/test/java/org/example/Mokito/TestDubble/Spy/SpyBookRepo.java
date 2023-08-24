package org.example.Mokito.TestDubble.Spy;

public class SpyBookRepo implements BookRepository{
    int savecalled=0;
    Book lastAddedBook=null;

    @Override
    public void save(Book book) {
        savecalled++;
        lastAddedBook=book;
    }

    public int timesCalled(){
        return savecalled;
    }

    public  boolean calledWith(Book book){
        return lastAddedBook.equals(book);
    }


}
