package org.example.Exception_Handling;

public class BookRequest {


    private String Tittle;
    private int Price;


    public BookRequest(String tittle, int price) {
        Tittle = tittle;
        Price = price;
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
}
