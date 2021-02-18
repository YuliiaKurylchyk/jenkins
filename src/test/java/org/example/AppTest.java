package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldNotFail() {
        assertTrue(true);
    }

    @Test
    public void shouldFail() {
        Assert.fail();
    }
}
