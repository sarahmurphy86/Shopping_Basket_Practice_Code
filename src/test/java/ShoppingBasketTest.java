import Items.Book;
import ShoppingBasket.ShoppingBasket;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {


    ShoppingBasket shoppingBasket;
    Book book1;
    Book book2;

    @Before
    public void before(){
        shoppingBasket = new ShoppingBasket();
        book1 = new Book (15.00, "The Handsmaid Tale", "Margaret Atwood");
        book2 = new Book (4.00, "Planet Earth", "David Attenborough");
    }

    @Test
    public void shoppingBasketStartsEmpty(){
        assertEquals(0, shoppingBasket.getAmountOfItems());
    }

    @Test
    public void canAddItemToShoppingBasket(){
        shoppingBasket.addItem(book1);
        assertEquals(1, shoppingBasket.getAmountOfItems());
    }

    @Test
    public void canRemoveItemFromShoppingBasket(){
        shoppingBasket.addItem(book1);
        shoppingBasket.addItem(book2);
        shoppingBasket.removeItem(book1);
        assertEquals(1, shoppingBasket.getAmountOfItems());
    }

    @Test
    public void canEmptyShoppingBasket(){
        shoppingBasket.addItem(book1);
        shoppingBasket.addItem(book2);
        shoppingBasket.emptyAllItems();
        assertEquals(0, shoppingBasket.getAmountOfItems());
    }

    @Test
    public void canCalculateCostOfAllItemsInShoppingBasket(){
        shoppingBasket.addItem(book1);
        shoppingBasket.addItem(book2);
        assertEquals(19.00, shoppingBasket.totalCostOfItems(), 0);
    }

    @Test
    public void canAddTenPercentDiscount(){
        shoppingBasket.addItem(book1);
        shoppingBasket.addItem(book1);
        assertEquals(27, shoppingBasket.totalCostOfItems(),0 );
    }
}
