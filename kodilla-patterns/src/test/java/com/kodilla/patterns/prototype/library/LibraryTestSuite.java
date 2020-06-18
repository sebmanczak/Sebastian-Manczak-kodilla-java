package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("The silent treatment", "Abble Greaves", LocalDate.of(2019, 5, 31));
        Book book2 = new Book("Our little cruelties.", "Liz Nugent", LocalDate.of(2019, 4, 22));
        Book book3 = new Book("My dark Vanessa.", "Elizabeth Russel", LocalDate.of(2019, 1,24));
        Book book4 = new Book("Six wicked reasons.", "Jo Spain", LocalDate.of(2017, 10, 29));

        Library library = new Library("Library in Wroclaw");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        //making a shallow copy
        Library clonedLibrary = null;
        try {
                clonedLibrary = library.shallowCopy();
                clonedLibrary.setName("Library in Krakow");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // making a deep copy
        Library deepClonedLibrary = null;
        try {
                deepClonedLibrary = library.deepCopy();
                deepClonedLibrary.setName("Library in Warsaw");
        } catch (CloneNotSupportedException e) {
                System.out.println(e);
        }

        //When
        library.getBooks().remove(book4);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks().size(), clonedLibrary.getBooks().size());
        Assert.assertNotEquals(clonedLibrary.getBooks().size(), deepClonedLibrary.getBooks().size());


    }
}
