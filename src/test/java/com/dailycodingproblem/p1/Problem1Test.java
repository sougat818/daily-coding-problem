package com.dailycodingproblem.p1;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static com.dailycodingproblem.p1.Problem1.addsToK;

import org.junit.Test;

public class Problem1Test {

    @Test
    public void addsToKSolutionIsTrue() {
        assertTrue(addsToK(17, 10, 15, 3, 7));
    }

    @Test
    public void addsToKSolutionIsFalse() {
        assertFalse(addsToK(100, 10, 15, 3, 7));
    }

    @Test
    public void addsToKEdgeCases() {
        assertFalse(addsToK(1));
    }
}
