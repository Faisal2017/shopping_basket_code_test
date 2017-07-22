package shopping_basket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BreadTest {

    private Bread bread;

    @Before
    public void setUp() throws Exception {
        bread = new Bread(2,4);
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(2, bread.getBuyingPrice());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(4, bread.getSellingPrice());
    }
}