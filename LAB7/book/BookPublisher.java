package com.solid.book;


import java.util.List;

public class BookPublisher implements Publisher{
    public static void main(String[] args) {
        
        BookPublisher bookpublisher = new BookPublisher();
        bookpublisher.printToFile();
    }
    
    @Override
    public void printToFile() {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        boolean isEven = false;
        String previousPage = "";
        try {
            FileWriter fileWriter = new FileWriter(book.getTitle() + ".txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            do {
                if (isEven) {
                    previousPage = book.getCurrentPage();
                    isEven = false;
                } else {
                    printWriter.printf("%-25s : %25s%n", previousPage, book.getCurrentPage());
                    isEven = true;
                }
            } while (book.turnToNextPage());
            printWriter.close();
        } catch (IOException ex) {
            System.out.println("Cannot print this book due to IOException");
        }
    }
}