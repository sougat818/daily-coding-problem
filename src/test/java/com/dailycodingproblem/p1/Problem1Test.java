package com.dailycodingproblem.p1;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static com.dailycodingproblem.p1.Problem1.addsToK;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void addsToKListNullException() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("list cannot be Null in Problem1:addsToK");
        addsToK(1, (int[]) null);

    }
}
