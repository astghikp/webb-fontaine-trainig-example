package Books;

import org.junit.Test;
import org.testng.Assert;

import java.time.LocalDate;


public class TestAPI {


    @Test
    public void testGetAllBooks() {

        String bookTitles = APIMethods.getAllBooks();
        Assert.assertEquals(bookTitles, "Hobbit The Stand Green mile Dark Tower Of Mice and Men ");

    }

    @Test
    public void testGetAllAuthors() {

        String authors = APIMethods.getAllAuthors();
        Assert.assertEquals(authors, "[Stephen King, John R.R Tolkien, John Steinbeck]");

    }

    @Test
    public void TestFindBookByAuthor() {

        String books = APIMethods.findBookByAuthor("Jo");
        Assert.assertEquals(books, "Hobbit Of Mice and Men ");

    }

    @Test
    public void TestFindBookByAuthorNotInDB() {

        String books = APIMethods.findBookByAuthor("Mike");
        Assert.assertNull(books);

    }

    @Test
    public void TestFindBookByAuthorNull() {

        String books = APIMethods.findBookByAuthor(null);
        Assert.assertNull(books);

    }

    @Test
    public void TestFindTop3() {

        String books = APIMethods.top3OfAuthor("Stephen");
        Assert.assertEquals(books, "Green mile The Stand Dark Tower ");

    }

    @Test
    public void TestFindTopAuthorNotInDB() {

        String books = APIMethods.top3OfAuthor("Mike");
        Assert.assertNull(books);

    }

    @Test
    public void TestFindTopAuthorSameName() {

        String books = APIMethods.top3OfAuthor("John");
        Assert.assertNull(books);

    }

    @Test
    public void TestFindTopAuthorNotHaving3books() {

        String books = APIMethods.top3OfAuthor("John");
        Assert.assertNull(books);

    }

    @Test
    public void TestFindAuthor() {

        String books = APIMethods.findInAuthors("ol");
        Assert.assertEquals(books, "John R.R Tolkien");

    }

    @Test
    public void TestFindAuthorNotInDB() {

        String books = APIMethods.findInAuthors("aaaaa");
        Assert.assertNull(books);

    }

    @Test
    public void TestFindAuthorNull() {

        String books = APIMethods.findInAuthors(null);
        Assert.assertNull(books);

    }

    @Test
    public void TestFindBook() {

        String books = APIMethods.findInBooks("ob");
        Assert.assertEquals(books, "Hobbit");

    }

    @Test
    public void TestFindBookNotInDB() {

        String books = APIMethods.findInBooks("aaaaa");
        Assert.assertNull(books);

    }

    @Test
    public void TestFindBookNull() {

        String books = APIMethods.findInBooks(null);
        Assert.assertNull(books);

    }

    @Test
    public void TestFindBookByDate() {
        LocalDate startDate = LocalDate.of(1990, 1, 8);
        LocalDate endDate = LocalDate.of(2020, 1, 8);
        String books = APIMethods.findByDateRange(startDate, endDate);
        Assert.assertEquals(books, "Green mile Dark Tower ");

    }

    @Test
    public void TestFindBookByDateNegative() {
        LocalDate startDate = LocalDate.of(2010, 1, 8);
        LocalDate endDate = LocalDate.of(2020, 1, 8);
        String books = APIMethods.findByDateRange(startDate, endDate);
        Assert.assertNull(books);

    }

    @Test
    public void TestFindBookByDateNullStartDate() {
        LocalDate startDate = LocalDate.of(2010, 1, 8);
        LocalDate endDate = LocalDate.of(2020, 1, 8);
        String books = APIMethods.findByDateRange(null, endDate);
        Assert.assertNull(books);

    }

    @Test
    public void TestFindBookByDateNullEndDate() {
        LocalDate startDate = LocalDate.of(2010, 1, 8);
        LocalDate endDate = LocalDate.of(2020, 1, 8);
        String books = APIMethods.findByDateRange(startDate, null);
        Assert.assertNull(books);

    }
}
