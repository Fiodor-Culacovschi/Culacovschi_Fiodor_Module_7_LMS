// Uncomment each piece of the code one by one run the test,
// read all comments carefully to avoid any errors
/*import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;*/

/*class LibraryManagementAppTest {

    // object for the test
    LibraryManagementApp libraryManager;


    @BeforeEach
    void setUp() {

        // test data for the object
        libraryManager = new LibraryManagementApp();

        //book sample
        int id = 1;
        String barcode = "123456789";
        String title = "To Kill a Mockingbird";
        String author = "Harper Lee";
        String genre = "Fiction";

        //Add the book to the user collection
        libraryManager.addBookToCollection(id, barcode, title, author, genre);
    }

    @Test
    void addBookToCollection() {

        // verify if book was added to the collection
/*Default status is available
       After you ran the test "addBookToCollection" don't forget
       to go to userCollection.txt file and remove it before running another test
       otherwise you'll receive an error and won't pass the test*/


       /* assertEquals(1, libraryManager.getUserCollection().size(), "Test has successfully completed");

    }
}*/
//###############################################################################################################
/*import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;*/

/*class LibraryManagementAppTest {

    // object for the test
    LibraryManagementApp libraryManager;


    @BeforeEach
    void setUp() {

        // test data for the object
        libraryManager = new LibraryManagementApp();

        //book sample
        int id = 1;
        String barcode = "123456789";
        String title = "To Kill a Mockingbird";
        String author = "Harper Lee";
        String genre = "Fiction";


        //Add the book to the user collection
        libraryManager.addBookToCollection(id, barcode, title, author, genre);

        System.out.println();
    }
    @Test

     /*Default status is available
       After you ran the test "addBookToCollection" don't forget
       to go to userCollection.txt file and remove it before running another test
       otherwise you'll receive an error and won't pass the test*/

    /*void removeBookFromCollection() {

        // Remove the book from the collection
        libraryManager.removeBookFromCollection(1); // Assuming the book has ID 1

        // Display a message for successful check-in
        System.out.println("Book under ID 1 was successfully removed from the collection.");

    }

}*/
//###############################################################################################################
/*Before running this test "testCheckInBook" go to
the source file where is original code find the
constructor for the Book class and change
 this.status = "available";  to  this.status = "checked in";
 otherwise test it won't passed the test
 */
/*import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryManagementAppTest {

    // object for the test
    LibraryManagementApp libraryManager;


    @BeforeEach
    void setUp() {

        // test data for the object
        libraryManager = new LibraryManagementApp();

    }

    @Test
    /*Default status is available
       After you ran the test "addBookToCollection" don't forget
       to go to userCollection.txt file and remove it before running another test
       otherwise you'll receive an error and won't pass the test*/

    /*public void testCheckInBook() {
        //book sample
        int id = 1;
        String barcode = "123456789";
        String title = "To Kill a Mockingbird";
        String author = "Harper Lee";
        String genre = "Fiction";

        libraryManager.addBookToCollection(id, barcode, title, author, genre);

        System.out.println();

        // Check in the book
        libraryManager.checkInBook(barcode);

        // Retrieve the book from the user's collection
        LibraryManagementApp.Book book = libraryManager.getUserCollection().get(0);

        // Verify that the book's status is "checked in"
        assertEquals("checked in", book.getStatus());

        // Verify that the due date is "null" after checking in
        assertNull(book.getDueDate());

        System.out.println();
        // Display a message for successful check-in
        System.out.println("Book with barcode 123456789 checked in successfully.");
    }
}*/

//###############################################################################################################
/*Before running this test "testCheckInBook" go to
the source file where is original code find the
constructor for the Book class and change
 this.status = "checked in";  to  this.status = "checked out";
 otherwise test it won't passed the test
 */
/*import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;*/

/*class LibraryManagementAppTest {

    // object for the test
    LibraryManagementApp libraryManager;


    @BeforeEach
    void setUp() {

        //test data for the object
        libraryManager = new LibraryManagementApp();
    }
    @Test
    /*Default status is available
       After you ran the test "addBookToCollection" don't forget
       to go to userCollection.txt file and remove it before running another test
       otherwise you'll receive an error and won't pass the test*/

    /*public void testCheckOutBook() {
        //book sample
        int id = 1;
        String barcode = "123456789";
        String title = "To Kill a Mockingbird";
        String author = "Harper Lee";
        String genre = "Fiction";

        libraryManager.addBookToCollection(id, barcode, title, author, genre);

        System.out.println();

        // Check out the book
        libraryManager.checkOutBook(barcode);

        // Retrieve the book from the user's collection
        LibraryManagementApp.Book book = libraryManager.getUserCollection().get(0);

        // Verify that the book's status is "checked out"
        assertEquals("checked out", book.getStatus());

        // Verify that the due date is "null" after checking out
        assertNull(book.getDueDate());

        System.out.println();
        //Display a message for successful check-out
        System.out.println("Book with barcode 123456789 checked out successfully.");
    }
}*/









