package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //given
        Book bookA1 = new Book("Author1", "Title1", 1990, "Signature1");
        Book bookA2 = new Book("Author2", "Title2", 1995, "Signature2");
        Book bookA3 = new Book("Author3", "Title3", 2000, "Signature3");
        Book bookA4 = new Book("Author4", "Title4", 1985, "Signature4");
        Book bookA5 = new Book("Author5", "Title5", 2000, "Signature5");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(bookA1);
        bookSet.add(bookA2);
        bookSet.add(bookA3);
        bookSet.add(bookA4);
        bookSet.add(bookA5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //when
        int result = medianAdapter.publicationYearMedian(bookSet);

        //then
        assertEquals(1995, result);
    }
}
