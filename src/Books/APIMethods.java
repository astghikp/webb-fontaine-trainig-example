package Books;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


public class APIMethods {

    private APIMethods() {}

    private static boolean checkDbIsFilled() {
        boolean listIsEmpty = DataProviderBooks.booksList() ==null;
        if ( listIsEmpty) {
            System.out.println(" Book list is empty ");
        }
        return !listIsEmpty;
    }

    public static String getAllAuthors() {

        if (!checkDbIsFilled())
            return null;
        Set<String> authorsList = new HashSet<>();

        // remove repeating Authors
        for (int i = 0; i < DataProviderBooks.booksList().length; i++) {
            authorsList.add(DataProviderBooks.booksList()[i].getAuthor().getName());

        }
        return authorsList.toString();
    }

    public static String getAllBooks() {
        if (!checkDbIsFilled())
            return null;
        StringBuilder bookList = new StringBuilder();

        for (int i = 0; i < DataProviderBooks.booksList().length; i++) {

            bookList.append(DataProviderBooks.booksList()[i].getTitle()).append(" ");
        }
        return bookList.toString();

    }

    public static String findBookByAuthor(String search) {
        if (!checkDbIsFilled())
            return null;
        if (search == null)
            return null;
        StringBuilder bookList = new StringBuilder();
        for (int i = 0; i < DataProviderBooks.booksList().length; i++) {
            if (DataProviderBooks.booksList()[i].getAuthor().toString().contains(search))
                bookList.append(DataProviderBooks.booksList()[i].getTitle()).append(" ");

        }
        if (bookList.length() == 0) {
            System.out.println("Search other name");
            return null;
        }
        System.out.println(Constants.SEARCH + bookList.toString());
        return bookList.toString();
    }

    public static String top3OfAuthor(String search) {
        if (!checkDbIsFilled())
            return null;
        int counter = 0;
        // ArrayList<Books> listOfTop = new ArrayList<Books>();
        Book[] listOfTop = new Book[DataProviderBooks.booksList().length];
        for (int i = 0; i < DataProviderBooks.booksList().length; i++) {
            if (DataProviderBooks.booksList()[i].getAuthor().toString().contains(search)) {
                listOfTop[counter] = new Book(DataProviderBooks.booksList()[i]);
                counter++;
            }
        }
        if (counter == 0)
            return null;
        else if (counter == 1)
            return listOfTop[0].getTitle();
        else {
            for (int i = 0; i < counter - 1; i++) {
                if (listOfTop[i] == null)
                    continue;
                Book temp;

                if (listOfTop[i].getRating() < listOfTop[i + 1].getRating()) {
                    temp = listOfTop[i];
                    listOfTop[i] = listOfTop[i + 1];
                    listOfTop[i + 1] = temp;
                }

                //senc chexav :(  Collections.sort(listOfTop, Comparator.comparingDouble((Books) listOfTop::getRaiting.reversed()));

            }
            StringBuilder bookList = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                bookList.append(listOfTop[i].getTitle()).append(" ");
            }
            return bookList.toString();
        }


    }

    public static String findInAuthors(String search) {
        if (!checkDbIsFilled())
            return null;
        if (search == null)
            return null;
        StringBuilder authorList = new StringBuilder();
        for (int i = 0; i < DataProviderBooks.booksList().length; i++) {
            if (DataProviderBooks.booksList()[i].getAuthor().toString().contains(search))
                authorList.append(DataProviderBooks.booksList()[i].getAuthor().getName());


        }
        if (authorList.length() == 0) {
            System.out.println("Search other name");
            return null;
        }
        System.out.println(Constants.SEARCH + authorList.toString());
        return authorList.toString();
    }

    public static String findInBooks(String search) {
        if (!checkDbIsFilled())
            return null;
        if (search == null)
            return null;
        StringBuilder bookList = new StringBuilder();
        for (int i = 0; i < DataProviderBooks.booksList().length; i++) {
            if (DataProviderBooks.booksList()[i].getTitle().contains(search))
                bookList.append(DataProviderBooks.booksList()[i].getTitle());

        }
        if (bookList.length() == 0) {
            System.out.println("Search other name");
            return null;
        }
        System.out.println(Constants.SEARCH + bookList.toString());
        return bookList.toString();

    }

    public static String findByDateRange(LocalDate startDate, LocalDate endDate) {
        if (!checkDbIsFilled())
            return null;
        if (startDate == null || endDate == null)
            return null;
        StringBuilder bookList = new StringBuilder();
        for (int i = 0; i < DataProviderBooks.booksList().length; i++) {
            if (DataProviderBooks.booksList()[i].getDate().isAfter(startDate) && DataProviderBooks.booksList()[i].getDate().isBefore(endDate))
                bookList.append(DataProviderBooks.booksList()[i].getTitle()).append(" ");

        }
        if (bookList.length() == 0) {
            System.out.println("Search other name");
            return null;
        }
        System.out.println(Constants.SEARCH + bookList.toString());
        return bookList.toString();
    }
}
