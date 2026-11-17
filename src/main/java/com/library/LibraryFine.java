
package com.library;

public class LibraryFine {

    private static final int FINE_PER_DAY = 5;

    // Operation 1: Calculate fine for an overdue book
    public int calculateFine(int overdueDays) {
        if (overdueDays <= 0) {
            return 0;
        }

        return overdueDays * FINE_PER_DAY;
    }

    // Operation 2: Calculate total fine for multiple books
    public int calculateTotalFine(int[] overdueDays) {
        int totalFine = 0;

        for (int days : overdueDays) {
            totalFine += calculateFine(days);
        }

        return totalFine;
    }

    // Operation 3: Check whether a book is overdue
    public boolean isOverdue(int overdueDays) {
        return overdueDays > 0;
    }

    // Operation 4: Calculate fine with a maximum limit
    public int calculateFineWithLimit(int overdueDays, int maxFine) {
        int fine = calculateFine(overdueDays);

        return Math.min(fine, Math.max(0, maxFine));
    }
}

