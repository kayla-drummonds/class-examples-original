package com.teksystems.books;

import java.util.ArrayList;

public class ShowData {

    public static void main(String[] args) {
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> myBookList = b.bookDetails();
        
        for(Book showValue : myBookList) {
            System.out.println(showValue.getNumber() + " " + showValue.getName() + " " + showValue.getCategory() + " " + showValue.getAuthor());
        }
    }

}
