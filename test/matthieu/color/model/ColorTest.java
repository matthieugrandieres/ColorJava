package matthieu.color.model;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ColorTest {

    private Color color1;
    private Color color2;


    @Before
    public void setUp(){
        color1 = new Color(255, 100, 12);
        color2 = new Color("#123456");
    }

    @Test
    public void testGetRed(){
        //color1 = new Color(255, 100, 12);
        assertEquals(255, color1.getRed());
    }

    @Test
    public void testGetBlue(){
        assertEquals(12, color1.getBlue());
    }

    @Test
    public void testGetGreen(){
        assertEquals(100, color1.getGreen());
    }

    // TEST RED
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRed(){
        new Color(1000, 100, 12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRed1(){
        new Color(-1, 100, 12);
    }

    // TEST GREEN
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorGreen(){
        new Color(255, 1000, 12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorGreen1(){
        new Color(255, -1, 12);
    }

    //TEST BLUE
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorBlue(){
        new Color(255, 100, 1000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorBlue1(){
        new Color(255, 100, -1);
    }

    //TEST HEX
    @Test
    public void testFirstChar(){
        assertEquals("#", color2.getHexValue().substring(0, 1));
    }

    @Test
    public void size(){
        assertEquals(7, color2.getHexLenght());
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifInt(){
        for (int i = 1; i <= 6; i++) {
            if (Integer.parseInt(color1.getHexValue().substring(i, i +1)) < 0 ||
                Integer.parseInt(color1.getHexValue().substring(i, i +1)) > 9) {
                    new Color("#123456");
            }
        }
    }


    @After
    public void tearDown(){
        color1 = null;
    }

}