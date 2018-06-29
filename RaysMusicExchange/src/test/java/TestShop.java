import Behavoirs.ISell;
import Instruments.Guitar;
import Instruments.Piano;
import Instruments.Saxophone;
import Items.CarryCase;
import Items.SheetMusic;
import Items.Strings;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShop {
    
    Shop shop;
    Strings string;
    CarryCase carryCase;
    SheetMusic sheetMusic;
    Piano piano;
    Guitar guitar;
    Saxophone saxophone;
    
    @Before
    public void before(){
        shop = new Shop();
        string = new Strings("Nylon",2.99, 3.50);
        carryCase = new CarryCase("Guitar", 24.99, 35.00, "Black", "Leather");
        sheetMusic = new SheetMusic("Rock",12.99, 14.50, "The Beetles", "Play like the Beetles", "1966");
        piano = new Piano("Casio", "CS-44PC5", 47.99, 60.00);
        guitar = new Guitar("Music Alley", "MA-34-N", 35.20, 50.00, "Nylon");
        saxophone = new Saxophone("Andoer", "Alto", 188.90, 240.00,"Brass");
        shop.addItem(string);
        shop.addItem(carryCase);
        shop.addItem(sheetMusic);
        shop.addItem(piano);
        shop.addItem(guitar);
        shop.addItem(saxophone);
    }

    @Test
    public void canAddToStock() {

        assertEquals(6, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock() {
        shop.removeItem(piano);
        assertEquals(5, shop.getStock().size());
    }

    @Test
    public void canGetTotalProfit() {
        assertEquals(89.94, shop.totalProfit(),0.01);
    }
}
