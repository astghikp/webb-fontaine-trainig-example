package Books;

import java.time.LocalDate;
import java.util.Date;

public class BooksDB {


  // Title, Author, date,  genre, rating,  cost
    public static Books[] booksList() {
         Books [] book= new Books[5];
        Authors [] authors = new Authors[3];
   authors[0] = new Authors("John R.R Tolkien", LocalDate.of(1889, 1, 3),"Great Britain");
       authors[1] = new Authors("Stephen King", LocalDate.of(1994, 9, 21) ,"USA");
       authors[2] = new Authors("John Steinbeck",LocalDate.of(1902, 2, 27) ,"USA");


         book[0] = new Books("Hobbit", authors[0], LocalDate.of(1937, 2, 2), "fantasy", 4.36, 50);
        book[1] = new Books("The Stand", authors[1], LocalDate.of(1989, 5, 12), "post-apocalyptic", 4.34, 30);
       book[2] = new Books("Green mile", authors[1], LocalDate.of(1996, 12, 6), "mystic", 4.46, 25);
       book[3] = new Books("Dark Tower", authors[1], LocalDate.of( 2004, 9, 21), "fantasy", 4.25, 32.4);
       book[4] = new Books("Of Mice and Men",authors[2] , LocalDate.of( 1937, 11, 23), "drama", 3.88, 15.99);
       return book;
    }

}
