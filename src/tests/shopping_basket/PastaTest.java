package shopping_basket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PastaTest {

    private Pasta pasta;

    @Before
    public void setUp() throws Exception {
        pasta = new Pasta(1,3);
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(1, pasta.getBuyingPrice());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(3, pasta.getSellingPrice());
    }

    @Test
    public void calculateMarkUp() {
        assertEquals(2, pasta.calculateMarkUp());
    }
}