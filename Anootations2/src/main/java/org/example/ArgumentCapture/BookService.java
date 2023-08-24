package org.example.ArgumentCapture;

public class BookService {
    private BookRepository bookRepository;
     public BookService(BookRepository bookRepository){
         this.bookRepository=bookRepository;
     }


    public void addbook(Book book){
         if(book.getPrice()<500){
             return;
         }

         bookRepository.save(book);
    }

    public void addbook1(BookRequest bookrequest){
        if(bookrequest.getPrice()<500){
            return;
        }
        Book book = new Book();
        book.setTittle(bookrequest.getTittle());
        book.setPrice(bookrequest.getPrice());

        bookRepository.save(book);
    }

    public void updatePrize(String bookid, int updatedprize){
         if(bookid==null)
             return;
         Book book = bookRepository.findBookById(bookid);
         book.setPrice(updatedprize);
         bookRepository.save(book);
    }

    public void updatePrize2(String bookid, int updatedprize){
        if(bookid==null)
            return;
        Book book = bookRepository.findBookById(bookid);
        if(book.getPrice() == updatedprize)
            return;
        book.setPrice(updatedprize);
        bookRepository.save(book);
    }







}
