package org.example.Dummy;

public class BookService {
    private BookRepository bookRepository;
    private EmailService  emailService;

    public BookService(BookRepository bookRepository, EmailService emailService) {
        this.bookRepository = bookRepository;
        this.emailService = emailService;
    }

    public void addbook(Book book){
          bookRepository.save(book);
     }

     public int findnumberofBooks(){
         return bookRepository.findallBooks().size();
     }


     //Other methods which are using the mails servcices
}
