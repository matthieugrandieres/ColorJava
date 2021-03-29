package matthieu.color.model;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColorTest {

    private Color color;

    @Before
    public void setUp(){
        color = new Color(255, 255, 255);
    }

    @Test
    public void testGetRed(){
        assertEquals(255, color.getRed());
    }

    @After
    public void tearDown(){
        color = null;
    }


}