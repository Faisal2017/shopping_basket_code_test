package shopping_basket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    private Shop shop;
    private ShoppingBasket basket;
    private Bread bread;
    private Pasta pasta;
    private Cereal cereal;

    @Before
    public void setUp() throws Exception {
        basket = new ShoppingBasket();
        shop = new Shop();
        bread = new Bread(10, 20);
        pasta = new Pasta(7, 14);
        cereal = new Cereal(8, 15);
    }

    @Test
    public void testValueAtTill() {
        basket.addItems(bread);
        basket.itemValues();
        int totalToPay = shop.checkBasket(basket);
        assertEquals(1, totalToPay);
    }


}