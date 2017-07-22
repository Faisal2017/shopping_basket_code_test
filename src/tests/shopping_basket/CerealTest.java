package shopping_basket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CerealTest {

    private Cereal cereal;

    @Before
    public void setUp() throws Exception {
        cereal = new Cereal(2, 5);
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(2, cereal.getBuyingPrice());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(5, cereal.getSellingPrice());
    }
}