import Items.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book(15.00, "The Handsmaid's Tale", "Margaret Atwood");
    }


    @Test
    public void canGetSellingPrice(){
        assertEquals(15.00, book.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetTitle(){
        assertEquals("The Handsmaid's Tale", book.getTitle());
    }

    @Test
    public void canGetAuthor(){
        assertEquals("Margaret Atwood", book.getAuthor());
    }

    @Test
    public void can

    //Buy one Get one Free:
//  Apply buy one get one free on books - I think I want to have this in a discount class or interface?
//  Loop through the shopping basket and add books into a new book array
//  Count the new book array - if it is a even number apply a 50% discount  ie n%2==0
}
