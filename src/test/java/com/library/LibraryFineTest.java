
package com.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryFineTest {

    LibraryFine libraryFine = new LibraryFine();

    @Test
    public void testCalculateFine() {
        assertEquals(25, libraryFine.calculateFine(5));
    }

    @Test
    public void testCalculateFineForZeroDays() {
        assertEquals(0, libraryFine.calculateFine(0));
    }

    @Test
    public void testCalculateTotalFine() {
        int[] overdueDays = {2, 5, 10};

        assertEquals(85, libraryFine.calculateTotalFine(overdueDays));
    }

    @Test
    public void testIsOverdue() {
        assertTrue(libraryFine.isOverdue(3));
    }

    @Test
    public void testIsNotOverdue() {
        assertFalse(libraryFine.isOverdue(0));
    }

    @Test
    public void testCalculateFineWithLimit() {
        assertEquals(500, libraryFine.calculateFineWithLimit(200, 500));
    }

    @Test
    public void testCalculateFineWithZeroLimit() {
        assertEquals(0, libraryFine.calculateFineWithLimit(10, 0));
    }
}

