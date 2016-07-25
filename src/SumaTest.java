import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Witek on 11.07.2016.
 */
public class SumaTest {
    @Test
    public void test1() throws Exception {
        Suma suma = new Suma();
        assertEquals(3,suma.add(3));
        assertEquals(5,suma.add(2));
    }

}