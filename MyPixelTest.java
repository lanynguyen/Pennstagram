package org.cis1200;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Use this file to test your implementation of Pixel.
 * 
 * We will manually grade this file to give you feedback
 * about the completeness of your test cases.
 */

public class MyPixelTest {

    /*
     * Remember, UNIT tests should ideally have one point of failure. Below we
     * give you two examples of unit tests for the Pixel constructor, one that
     * takes in three ints as arguments and one that takes in an array. We use
     * the getRed(), getGreen(), and getBlue() methods to check that the values
     * were set correctly. These two tests do not comprehensively test all of
     * Pixel so you must add your own.
     * 
     * You might want to look into assertEquals, assertTrue, assertFalse, and
     * assertArrayEquals at the following:
     * http://junit.sourceforge.net/javadoc/org/junit/Assert.html
     *
     * Note, if you want to add global variables so that you can reuse Pixels
     * in multiple tests, feel free to do so.
     */

    @Test
    public void testConstructInBounds() {
        Pixel p = new Pixel(40, 50, 60);
        assertEquals(40, p.getRed());
        assertEquals(50, p.getGreen());
        assertEquals(60, p.getBlue());
    }

    @Test
    public void testConstructArrayLongerThan3() {
        int[] arr = { 10, 20, 30, 40 };
        Pixel p = new Pixel(arr);
        assertEquals(10, p.getRed());
        assertEquals(20, p.getGreen());
        assertEquals(30, p.getBlue());
    }

    /* ADD YOUR OWN TESTS BELOW */
    @Test
    public void testConstructArrayLessThan3() {
        int[] arr = { 10, 20 };
        Pixel p = new Pixel(arr);
        assertEquals(10, p.getRed());
        assertEquals(20, p.getGreen());
        assertEquals(0, p.getBlue());
    }

    @Test
    public void testConstructArrayOne() {
        int[] arr = { 10 };
        Pixel p = new Pixel(arr);
        assertEquals(10, p.getRed());
        assertEquals(0, p.getGreen());
        assertEquals(0, p.getBlue());
    }

    @Test
    public void testConstructArrayNull() {
        int[] arr = null;
        Pixel p = new Pixel(arr);
        assertEquals(0, p.getRed());
        assertEquals(0, p.getGreen());
        assertEquals(0, p.getBlue());
    }

    @Test
    public void testGetComponentsNull() {
        int[] rgb = null;
        Pixel p = new Pixel(rgb);
        int[] arr = { 0, 0, 0 };
        assertArrayEquals(arr, p.getComponents());
    }

    @Test
    public void testGetComponentsOne() {
        int[] rgb = { 10 };
        Pixel p = new Pixel(rgb);
        int[] arr = { 10, 0, 0 };
        assertArrayEquals(arr, p.getComponents());
    }

    @Test
    public void testGetComponentsTwo() {
        int[] rgb = { 10, 20 };
        Pixel p = new Pixel(rgb);
        int[] arr = { 10, 20, 0 };
        assertArrayEquals(arr, p.getComponents());
    }

    @Test
    public void testGetComponents() {
        Pixel p = new Pixel(40, 50, 60);
        int[] arr = { 40, 50, 60 };
        assertArrayEquals(arr, p.getComponents());
    }

    @Test
    public void testDistanceZero() {
        Pixel p = new Pixel(40, 50, 60);
        int[] arr = { 40, 50, 60 };
        Pixel px = new Pixel(arr);
        assertEquals(0, p.distance(px));
    }

    @Test
    public void testDistance() {
        Pixel p = new Pixel(10, 20, 10);
        int[] arr = { 10, 50 };
        Pixel px = new Pixel(arr);
        assertEquals(40, p.distance(px));
    }

    @Test
    public void testToString() {
        Pixel p = new Pixel(10, 20, 30);
        assertEquals("(10, 20, 30)", p.toString());
    }

    @Test
    public void testSameRGB() {
        Pixel p = new Pixel(10, 20, 30);
        Pixel px = new Pixel(10, 20, 30);
        assertTrue(p.sameRGB(px));
    }

    @Test
    public void testNotSameRGB() {
        Pixel p = new Pixel(0, 0, 0);
        Pixel px = new Pixel(10, 20, 30);
        assertFalse(p.sameRGB(px));
    }
}
