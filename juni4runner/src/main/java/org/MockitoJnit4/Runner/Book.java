package org.MockitoJnit4.Runner;

public class Book {

    private String Bookid;
    private String Tittle;
    private int Price;

   // priavte  LocalDate publishdate;

    public String getBookid() {
        return Bookid;
    }

    public void setBookid(String bookid) {
        Bookid = bookid;
    }

    public String getTittle() {
        return Tittle;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

//    public priavte getLocalDate() {
//        return LocalDate;
//    }
//
//    public void setLocalDate(priavte localDate) {
//        LocalDate = localDate;
//    }

    public Book(String bookid, String tittle, int price) {
        Bookid = bookid;
        Tittle = tittle;
        Price = price;

    }
}
