import org.junit.Before;
import Items.Strings;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestString {

    Strings string;


    @Before
    public void before(){
        string = new Strings("Nylon", 2.50, 3.25);
    }

    @Test
    public void hasType() {
        assertEquals("Nylon", string.getType());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(2.50, string.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(3.25, string.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(0.75, string.calculateMarkup(), 0.01);
    }
}
