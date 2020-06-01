package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library in Wroclaw");
        library.getBooks().add(new Book("The silent treatment", "Abble Greaves", LocalDate.of(2019, 5, 31)));
        library.getBooks().add(new Book("Our little cruelties.", "Liz Nugent", LocalDate.of(2019, 4, 22)));
        library.getBooks().add(new Book("My dark Vanessa.", "Elizabeth Russel", LocalDate.of(2019, 1,24)));
        library.getBooks().add(new Book("Six wicked reasons.", "Jo Spain", LocalDate.of(2017, 10, 29)));

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
        library.getBooks();

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());


    }
}
