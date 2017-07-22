package shopping_basket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingBasketTest {

    private ShoppingBasket basket;

    @Before
    public void setUp() throws Exception {
        basket = new ShoppingBasket();
    }

    @Test
    public void testBasketStartsEmpty() {
        assertEquals(0, basket.getItems());
    }

}