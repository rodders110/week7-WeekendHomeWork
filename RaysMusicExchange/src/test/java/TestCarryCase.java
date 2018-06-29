import Items.CarryCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCarryCase {

    CarryCase carryCase;

    @Before
    public void before(){
        carryCase = new CarryCase("Guitar", 24.99, 35.00, "black", "Leather");
    }

    @Test
    public void hasType() {
        assertEquals("Guitar", carryCase.getType());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(24.99, carryCase.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(35.00, carryCase.getSellingPrice(), 0.01);
    }

    @Test
    public void hasColour() {
        assertEquals("black", carryCase.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Leather", carryCase.getMaterial());
    }

    @Test
    public void hasMarkUp() {
        assertEquals(10.01, carryCase.calculateMarkup(), 0.01);
    }
}
