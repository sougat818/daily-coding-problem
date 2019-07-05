package com.dailycodingproblem.p2;

import static com.dailycodingproblem.p2.Problem2.productArraySolutionByDivision;
import static com.dailycodingproblem.p2.Problem2.productArraySolutionNotUsingDivision;
import static org.junit.Assert.assertArrayEquals;

import java.util.concurrent.TimeUnit;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Problem2Test {

  @Rule
  public Timeout globalTimeout = new Timeout(5, TimeUnit.MILLISECONDS);

  @Test
  public void productArrayTest1() {

    int[] ints = productArraySolutionByDivision(new int[]{1, 2, 3, 4, 5});
    assertArrayEquals(new int[]{120, 60, 40, 30, 24}, ints);

  }

  @Test
  public void productArrayTest2() {

    int[] ints = productArraySolutionByDivision(new int[]{3, 2, 1});
    assertArrayEquals(new int[]{2, 3, 6}, ints);

  }

  @Test
  public void productArrayTest3() {

    int[] ints = productArraySolutionByDivision(new int[]{10, 3, 5, 6, 2});
    assertArrayEquals(new int[]{180, 600, 360, 300, 900}, ints);
  }


  @Test
  public void productArraySolutionNotUsingDivisionTest1() {

    int[] ints = productArraySolutionNotUsingDivision(new int[]{1, 2, 3, 4, 5});
    assertArrayEquals(new int[]{120, 60, 40, 30, 24}, ints);

  }

  @Test
  public void productArraySolutionNotUsingDivisionTest2() {

    int[] ints = productArraySolutionNotUsingDivision(new int[]{3, 2, 1});
    assertArrayEquals(new int[]{2, 3, 6}, ints);
  }

  @Test
  public void productArraySolutionNotUsingDivisionTest3() {

    int[] ints = productArraySolutionNotUsingDivision(new int[]{10, 3, 5, 6, 2});
    assertArrayEquals(new int[]{180, 600, 360, 300, 900}, ints);
  }
}