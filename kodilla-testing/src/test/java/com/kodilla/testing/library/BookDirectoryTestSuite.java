package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Almo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2019);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        Assert.assertEquals(4, theListOfBooks.size());
    }
    private List<Book> generateListOfNBooks(int booksQuantity) {
            List<Book> resultList = new ArrayList<Book>();
            for(int n = 1; n <= booksQuantity; n++) {
                Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
                resultList.add(theBook);
            }
            return resultList;
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        //Then
        Assert.assertEquals(0, theListOfBooks0.size());
        Assert.assertEquals(15, theListOfBooks15.size());
        Assert.assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //Then
        Assert.assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOf0() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryUser steven = new LibraryUser("Steven", "White", "95072003737");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOf0Books = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(steven)).thenReturn(listOf0Books);

        //When
        List<Book> theListOf0Books = bookLibrary.listBooksInHandsOf(steven);

        //Then
        Assert.assertEquals(0, theListOf0Books.size());
    }

    @Test
    public void testListBooksInHandsOf1() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryUser alice = new LibraryUser("Alice", "Black", "99082004444");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOf1Books = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(alice)).thenReturn(listOf1Books);

        //When
        List<Book> theListOf1Books = bookLibrary.listBooksInHandsOf(alice);

        //Then
        Assert.assertEquals(1, theListOf1Books.size());
    }

    @Test
    public void testListBooksInHandsOf5() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryUser maria = new LibraryUser("Maria", "Huertes", "92012504159");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOf5Books = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(maria)).thenReturn(listOf5Books);

        //When
        List<Book> theListOf5Books = bookLibrary.listBooksInHandsOf(maria);

        //Then
        Assert.assertEquals(5, theListOf5Books);
    }
}
