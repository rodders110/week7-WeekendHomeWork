import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestGuitar {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Music Alley", "MA-34-N", 35.20, 50.00, "Nylon");
    }

    @Test
    public void hasMake() {
    assertEquals("Music Alley", guitar.getMake());
    }

    @Test
    public void hasModel() {
        assertNotNull("MA-34-N", guitar.getModel());
    }

    @Test
    public void hasPrice() {
        assertEquals(50.00, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(35.20, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Cambur pinton", guitar.play());
    }
}

