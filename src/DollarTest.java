import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Witek on 02.07.2016.
 */
public class DollarTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
        assertNotEquals(new Dollar(18), five.times(3));
    }
    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(10).equals(new Dollar(6)));
    }


}