import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Witek on 11.07.2016.
 */
public class BinomsTest {
    @Test
    public void testOptimized() throws Exception {
        Binoms binoms = new Binoms();

        assertEquals(1,binoms.getResult(0,0),0.01);
        assertEquals(35,binoms.getResult(7,3),0.01);

        assertEquals(500,binoms.getResult(500,499),0.000001);

    }


    @Test
    public void testSilnia() throws Exception {
        Binoms binoms = new Binoms();
        assertEquals(24,binoms.silnia(4),0.000001);

    }

}