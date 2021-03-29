package matthieu.color.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColorTest {

    private Color color;

    @Test
    public void testGetRed(){
        assertEquals(255, color.getRed());
    }


}