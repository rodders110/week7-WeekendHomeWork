import Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestSaxophone {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("Andoer", "Alto", 188.90, 240.00,"Brass");
    }

    @Test
    public void hasModel() {
        assertNotNull("Andoer", saxophone.getModel());
    }

    @Test
    public void hasPrice() {
        assertEquals(188.90, saxophone.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(240.00, saxophone.getSellingPrice(), 0.01);
    }

    @Test
    public void hasDecoration() {
        assertEquals("Brass", saxophone.getDecoration());
    }

    @Test
    public void canPlay() {
        assertEquals("Parrrrp", saxophone.play());
    }
}

