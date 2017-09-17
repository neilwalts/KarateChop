package ubs.walterne.karateChop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by walterne on 13/09/2017.
 */
public class KarateChopTest {

    KarateChop karateChop = new KarateChop();


    @Test
    public void findMidValueOdd() {
        assertEquals(1, karateChop.chop('B', new int[]{'A', 'B', 'C'}));
    }

    @Test
    public void findMidValueEven() {
        assertEquals(1, karateChop.chop('B', new int[]{'A', 'B', 'C', 'D'}));
    }

    @Test
    public void findHighValueEven() {
        assertEquals(2, karateChop.chop('C', new int[]{'A', 'B', 'C', 'D'}));
    }

    @Test
    public void findHighValueOdd() {
        assertEquals(3, karateChop.chop('D', new int[]{'A', 'B', 'C', 'D', 'E'}));
    }

    @Test
    public void findLowValueOdd() {
        assertEquals(1, karateChop.chop('B', new int[]{'A', 'B', 'C', 'D', 'E'}));
    }

    @Test
    public void findLowValueEven() {
        assertEquals(1, karateChop.chop('B', new int[]{'A', 'B', 'C', 'D', 'E', 'F'}));
    }


    @Test
    public void testEmptyArray() {
        assertEquals(-1, karateChop.chop(3, new int[]{}));
    }

    @Test
    public void testSmallArrayNumberNotPresent() {
        assertEquals(-1, karateChop.chop(3, new int[]{1}));
    }

    @Test
    public void testSmallArrayNumberPresent() {
        assertEquals(0, karateChop.chop(1, new int[]{1}));
    }


    @Test
    public void testArray3Position0() {
        assertEquals(0, karateChop.chop(1, new int[]{1, 3, 5}));
    }

    @Test
    public void testArray3Position1() {
        assertEquals(1, karateChop.chop(3, new int[]{1, 3, 5}));
    }

    @Test
    public void testArray3Position2() {
        assertEquals(2, karateChop.chop(5, new int[]{1, 3, 5}));
    }

    @Test
    public void testArray3PositionNotPresentLowEnd() {
        assertEquals(-1, karateChop.chop(0, new int[]{1, 3, 5}));
    }

    @Test
    public void testArray3PositionNotPresentMid() {
        assertEquals(-1, karateChop.chop(2, new int[]{1, 3, 5}));
    }

    @Test
    public void testArray3PositionNotPresentHigh() {
        assertEquals(-1, karateChop.chop(4, new int[]{1, 3, 5}));
    }

    @Test
    public void testArray3PositionNotPresentHighEnd() {
        assertEquals(-1, karateChop.chop(6, new int[]{1, 3, 5}));
    }


    @Test
    public void testArray4PositionPresentLowEnd() {
        assertEquals(0, karateChop.chop(1, new int[]{1, 3, 5, 7}));
    }

    @Test
    public void testArray4PositionPresentMid() {
        assertEquals(1, karateChop.chop(3, new int[]{1, 3, 5, 7}));
    }

    @Test
    public void testArray4PositionPresentHigh() {
        assertEquals(2, karateChop.chop(5, new int[]{1, 3, 5, 7}));
    }

    @Test
    public void testArray4PositionPresentHighEnd() {
        assertEquals(3, karateChop.chop(7, new int[]{1, 3, 5, 7}));
    }


    @Test
    public void testArray4PositionNotPresentLowEnd() {
        assertEquals(-1, karateChop.chop(0, new int[]{1, 3, 5, 7}));
    }

    @Test
    public void testArray4PositionNotPresentMid() {
        assertEquals(-1, karateChop.chop(2, new int[]{1, 3, 5, 7}));
    }

    @Test
    public void testArray4PositionNotPresentHigh() {
        assertEquals(-1, karateChop.chop(4, new int[]{1, 3, 5, 7}));
    }
// add high low markers and ensure you're not going higher again

    @Test
    public void testArray4PositionNotPresentHighEnd() {
        assertEquals(-1, karateChop.chop(6, new int[]{1, 3, 5, 7}));
    }

    @Test
    public void testArray4PositionNotPresentHigherEnd() {
        assertEquals(-1, karateChop.chop(8, new int[]{1, 3, 5, 7}));
    }


}