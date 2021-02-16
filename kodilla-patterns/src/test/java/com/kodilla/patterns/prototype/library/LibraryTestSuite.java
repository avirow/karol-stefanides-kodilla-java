package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Library library = new Library("Biblioteka nr 1 - ul. Cicha ");
        Book book1 = new Book("Jan Brzechwa", "Oblicza zmyslone", LocalDate.of(1926, 01, 15));
        Book book2 = new Book("Jan Brzechwa", "Talizmany", LocalDate.of(1927, 01, 15));
        Book book3 = new Book("Jan Brzechwa", "Akademia pana Kleksa", LocalDate.of(1946, 01, 15));
        Book book4 = new Book("Jan Brzechwa", "Podroze pana Kleksa", LocalDate.of(1962, 01, 15));
        Book book5 = new Book("Jan Brzechwa", "Na wyspach Bergamutach", LocalDate.of(1948, 01, 15));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        //when
        Library clonedShallowCopyLibrary = null;
        try {
            clonedShallowCopyLibrary = library.shallowCopy();
            clonedShallowCopyLibrary.setName("Biblioteka nr 2 - ul. Stawowa");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library clonedDeepCopyLibrary = null;
        try {
            clonedDeepCopyLibrary = library.deepCopy();
            clonedDeepCopyLibrary.setName("Biblioteka nr 3 - ul. Wolna");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(book5);

        //then
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedShallowCopyLibrary.getBooks().size());
        assertEquals(5, clonedDeepCopyLibrary.getBooks().size());
    }
}
