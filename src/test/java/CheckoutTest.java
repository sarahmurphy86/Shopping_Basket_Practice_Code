import Items.Book;
import ShoppingBasket.ShoppingBasket;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckoutTest {

    Checkout checkout;
    ShoppingBasket shoppingBasket;
    Book book1;
    Book book2;

    @Before
    public void before(){
        checkout = new Checkout();
        shoppingBasket = new ShoppingBasket();
        book1 = new Book (15.00, "The Handsmaid Tale", "Margaret Atwood");
        book2 = new Book (15.00, "Planet Earth", "David Attenborough");
    }

    @Test
    public void canAddTenPercentDiscount(){
        shoppingBasket.addItem(book1);
        shoppingBasket.addItem(book2);
        shoppingBasket.totalCostOfItems().applyDiscount();
        assertEquals(27,checkout)

    }
}
