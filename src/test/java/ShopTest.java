import Shop.DrumSticks;
import Shop.GuitarStrings;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    DrumSticks drumSticks;
    GuitarStrings guitarStrings;
    Shop shop;

    @Before
    public void before(){

        drumSticks = new DrumSticks("Drum sticks", 5.0, 10.0);
        guitarStrings = new GuitarStrings("Guitar Strings", 10.0, 20.0);
        shop = new Shop();
    }

    @Test
    public void canAddStock(){
        shop.addStock(drumSticks);
        assertEquals(shop.stockCount(), 1);
    }

    @Test
    public void canremoveStock(){
        shop.removeStock(guitarStrings);
        assertEquals(shop.stockCount(),0);
    }


}
