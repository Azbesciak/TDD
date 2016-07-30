import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Witek on 30.07.2016.
 */
public class PodzielnoscTest {

    @Test
    public void inputTest() {
        String customInput = "2 7     2   4 35    5 12";
        InputStream inputStream = new ByteArrayInputStream(customInput.getBytes());
        int[] expected = {2,7,2,4,35,5,12};
        Podzielnosc.readInput(inputStream);
        assertEquals(Arrays.toString(expected), Arrays.toString(Podzielnosc.getInput()));
    }

    @Test
    public void lineAmountTest() {
        int[] expected = {2,7,2,4,35,5,12};
        Podzielnosc.setLineAmout(expected);
        assertEquals(2,Podzielnosc.getLineAmout());
        assertNotEquals(3,Podzielnosc.getLineAmout());
    }

    @Test
    public void answerTest() {
        assertEquals("2 6",Podzielnosc.getAnswer(7,2,4));
        assertEquals("",Podzielnosc.getAnswer(0,2,4));
        assertEquals("",Podzielnosc.getAnswer(100,1,1));
        assertEquals("",Podzielnosc.getAnswer(100,4,2));
        assertEquals("50",Podzielnosc.getAnswer(100,50,100));
    }
}