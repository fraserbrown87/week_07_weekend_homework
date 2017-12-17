import Instruments.Guitar;
import Instruments.Piano;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Guitar guitar;
    Piano piano;

    @Before
    public void before(){
        guitar = new Guitar("Red", Type.STRINGS, 250.00, 1000.00, 6);
        piano = new Piano("Black", Type.KEYBOARD, 1000.00, 3000.00, 88);
    }


    @Test
    public void getColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void setColour() {
        guitar.setColour("Green");
        assertEquals("Green", guitar.getColour());
    }

    @Test
    public void getType() {
        assertEquals(Type.KEYBOARD, piano.getType());
    }

    @Test
    public void setType() {
        piano.setType(Type.BRASS);
        assertEquals(Type.BRASS, piano.getType());
    }

    @Test
    public void getBuy_price() {
    }

    @Test
    public void setBuy_price() {
    }

    @Test
    public void getSell_price() {
    }

    @Test
    public void setSell_price() {
    }
}
