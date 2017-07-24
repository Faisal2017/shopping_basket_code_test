package shopping_basket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    private Shop shop;
    private Basket basket;
    private Bread bread;
    private Pasta pasta;
    private Cereal cereal;

    @Before
    public void setUp() throws Exception {
        basket = new Basket();
        shop = new Shop();
        bread = new Bread(10, 20);
        pasta = new Pasta(7, 14);
        cereal = new Cereal(8, 15);
    }

    @Test
    public void testBuyOneGetOneFree() {
        basket.addItems(cereal);
        basket.addItems(cereal);
        int totalToPay = shop.buyOneGetOneFree(basket);
        assertEquals(15, totalToPay);
    }

    @Test
    public void testDiscountOverTwenty() {
        basket.addItems(bread);
        basket.addItems(cereal);
        int totalToPay = shop.percentageDiscount(basket);
        assertEquals(35, totalToPay);
    }

}