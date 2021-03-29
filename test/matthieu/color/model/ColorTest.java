package matthieu.color.model;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColorTest {

    private Color color1;
    private Color color2;

    @Before
    public void setUp(){
        color1 = new Color(255, 255, 255);
        color2 = new Color("#123456");
    }

    @Test
    public void testGetRed(){
        assertEquals(255, color1.getRed());
    }

    @Test
    public void testGetBlue(){
        assertEquals(255, color1.getBlue());
    }

    @Test
    public void testGetGreen(){
        assertEquals(255, color1.getGreen());
    }

    @Test
    public void testGetHex(){
        assertEquals("#123456", color2.getHexValue());
    }

    @Test
    public void

    @After
    public void tearDown(){
        color1 = null;
        color2 = null;
    }

}