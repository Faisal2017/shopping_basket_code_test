package shopping_basket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingBasketTest {

    private ShoppingBasket basket;
    private Bread bread;
    private Cereal cereal;
    private Pasta pasta;


    @Before
    public void setUp() throws Exception {
        basket = new ShoppingBasket();
        bread = new Bread(2,4);
        cereal = new Cereal(2, 5);
        pasta = new Pasta(1,3);
    }

    @Test
    public void testBasketStartsEmpty() {
        assertEquals(0, basket.getItems());
    }

    @Test
    public void canAddItemsToBasket() {
        basket.addItems(cereal);
        assertEquals(1, basket.getItems());
    }

    @Test
    public void canRemoveItemFromBasket() {
        basket.addItems(pasta);
        basket.removeItem(pasta);
        assertEquals(0,basket.getItems());
    }

    @Test
    public void canEmptyBasket() {
        basket.addItems(cereal);
        basket.addItems(bread);
        basket.emptyBasket();
        assertEquals(0, basket.getItems());
    }
}