package com.dailycodingproblem.p1;

import static com.dailycodingproblem.p1.Problem1.addsToK;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Problem1Test {

  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  @Test(timeout = 10)
  public void addsToKSolutionIsTrue() {
    assertTrue(addsToK(17, 10, 15, 3, 7));
  }

  @Test(timeout = 5)
  public void addsToKSolutionIsFalse() {
    assertFalse(addsToK(100, 10, 15, 3, 7));
  }

  @Test(timeout = 10)
  public void addsToKEdgeCases() {
    assertFalse(addsToK(1));
  }

  @Test
  public void addsToKListNullException() {
    expectedException.expect(NullPointerException.class);
    expectedException.expectMessage("list cannot be Null in Problem1:addsToK");
    addsToK(1, (int[]) null);

  }
}
