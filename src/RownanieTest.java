import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Witek on 11.07.2016.
 */
public class RownanieTest {
    @Test
    public void test1() throws Exception {
        assertEquals(0,Rownanie.equationsAmount(0.3, 0.3, 0.4));
        assertEquals(1,Rownanie.equationsAmount(0.5, 1, 0.5));
        assertEquals(2,Rownanie.equationsAmount(-0.5, -0.5, 0));

    }

}