import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestPiano {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Casio", "CS-44PC5", 47.99, 60.00);
    }

    @Test
    public void hasMake() {
        assertEquals("Casio", piano.getMake());
    }

    @Test
    public void hasModel() {
        assertNotNull("CS-44PC5", piano.getModel());
    }

    @Test
    public void hasPrice() {
        assertEquals(60.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(47.99, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Plink, plonk", piano.play());
    }
}
