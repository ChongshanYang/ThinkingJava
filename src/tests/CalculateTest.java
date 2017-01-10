package tests;

import iterator.Calculate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanglc on 2017/1/10.
 */
public class CalculateTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("结束");
    }

    @Test
    public void add() throws Exception {
        Calculate c = new Calculate();
        int b = c.add(1,2);
        assertEquals(3,b);
    }

}