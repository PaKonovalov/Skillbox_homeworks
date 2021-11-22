package ru.skillbox;

public class Book {
    private final String bookName;
    private final String autor;
    private final int pageCount;
    private final int ISBNNumber;

    public Book (String bookName, String autor, int pageCount, int ISBNNumber) {
        this.bookName = bookName;
        this.autor = autor;
        this.pageCount = pageCount;
        this.ISBNNumber = ISBNNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAutor() {
        return autor;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getISBNNumber() {
        return ISBNNumber;
    }
}

