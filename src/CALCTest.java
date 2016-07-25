import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
/**
 * Created by Witek on 25.07.2016.
 */
public class CALCTest {
    @Test
    public void addition() throws Exception {
    assertEquals(9,CALC.addition(6,3));
    }

    @Test
    public void subtraction() throws Exception {
    assertEquals(7,CALC.subtraction(4, -3));
    }

    @Test
    public void division() throws Exception {
        assertEquals(6, CALC.division(37,6));
    }

    @Test
    public void multiplication() throws Exception {
        assertEquals(8, CALC.multiplication(2,4));
    }

    @Test
    public void modulo() throws Exception {
        assertEquals(7, CALC.modulo(47,0));
    }

    @Test
    public void inputBuffer() throws Exception {
        String inputData = "+ 7 3";
        InputStream originInputStream = System.in ;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));
        String[] inputResult = CALC.getInput();
        assertEquals("+",inputResult[0]);
        assertEquals("7",inputResult[1]);
        assertEquals("3",inputResult[2]);

        System.setIn(originInputStream);
    }

    @Test
    public void chosenMethod() throws Exception {
        assertEquals("addition", CALC.chooseMethod("+"));
        assertEquals("subtraction", CALC.chooseMethod("-"));
        assertEquals("division", CALC.chooseMethod("/"));
        assertEquals("multiplication", CALC.chooseMethod("*"));
        assertEquals("modulo",CALC.chooseMethod("%"));
    }

    @Test
    public void invokeChosenMethod() throws Exception {
        String[] methodArguments = {"+","3","4"};
        assertEquals(7, CALC.invokeChosenMethod(methodArguments));
    }
}