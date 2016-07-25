import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Witek on 10.07.2016.
 */
public class FanGenTest {
    @Test
    public void test1() throws Exception {
        FanGen fan = new FanGen();
        fan.setSize(-4);
        assertEquals(
                "****...*\n" +
                ".***..**\n" +
                "..**.***\n" +
                "...*****\n" +
                "*****...\n" +
                "***.**..\n" +
                "**..***.\n" +
                "*...****", fan.result());
    }

    @Test
    public void test2() throws Exception {
        FanGen fan = new FanGen();
        fan.setSize(3);
        assertEquals(
                "*..***\n" +
                        "**.**.\n" +
                        "****..\n" +
                        "..****\n" +
                        ".**.**\n" +
                        "***..*", fan.result());

    }





}