package by.itacademy.gee.mavendemo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for App.
 */
public class AppTest {

    @Test
    public void sumAPosit_vBPosit_v() {
//        given
        int a = 15;
        int b = 10;
        int expectedSum = 25;
//        when
        int actualSum = App.sum(a,b);
//        then
        assertEquals(expectedSum, actualSum);
    }
    @Test
    public void sumAPosit_vMaximalBPosit_v() {
//        given
        int a = Integer.MAX_VALUE;
        int b = 10;
        int expectedSum = -2147483639;
//        when
        int actualSum = App.sum(a,b);
//        then
        assertEquals(expectedSum, actualSum);
    }
}
