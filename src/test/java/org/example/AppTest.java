package org.example;

import org.junit.Assert;
import org.junit.Ignore;
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

    @Ignore
    @Test
    public void shouldFail() {
        Assert.fail();
    }
}
