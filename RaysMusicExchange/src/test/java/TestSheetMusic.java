import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSheetMusic {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Rock",12.99, 14.50, "The Beetles", "Play like the Beetles", "1966");
    }

    @Test
    public void hasType() {
        assertEquals("Rock", sheetMusic.getType());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(12.99, sheetMusic.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(14.50, sheetMusic.getSellingPrice(), 0.01);
    }

    @Test
    public void hasAuthor() {
        assertEquals("The Beetles", sheetMusic.getAuthor());
    }

    @Test
    public void hasTitle() {
    assertEquals("Play like the Beetles", sheetMusic.getTitle());
    }

    @Test
    public void hasPubYear() {
    assertEquals("1966", sheetMusic.getPublishingYear());
    }

    @Test
    public void hasMarkUp() {
    assertEquals(1.51, sheetMusic.calculateMarkup(), 0.01);
    }
}
