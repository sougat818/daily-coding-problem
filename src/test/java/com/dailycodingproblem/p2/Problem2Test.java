package com.dailycodingproblem.p2;

import static com.dailycodingproblem.p2.Problem2.productArraySolutionByDivision;
import static com.dailycodingproblem.p2.Problem2.productArraySolutionNotUsingDivision;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Problem2Test {

  @Test
  public void productArrayTest() {

    int[] ints = productArraySolutionByDivision(new int[]{1, 2, 3, 4, 5});
    assertArrayEquals(new int[]{120, 60, 40, 30, 24}, ints);

    ints = productArraySolutionByDivision(new int[]{3, 2, 1});
    assertArrayEquals(new int[]{2, 3, 6}, ints);

    ints = productArraySolutionByDivision(new int[]{10, 3, 5, 6, 2});
    assertArrayEquals(new int[]{180, 600, 360, 300, 900}, ints);
  }


  @Test
  public void productArraySolutionNotUsingDivisionTest() {

    int[] ints = productArraySolutionNotUsingDivision(new int[]{1, 2, 3, 4, 5});
    assertArrayEquals(new int[]{120, 60, 40, 30, 24}, ints);

    ints = productArraySolutionNotUsingDivision(new int[]{3, 2, 1});
    assertArrayEquals(new int[]{2, 3, 6}, ints);

    ints = productArraySolutionNotUsingDivision(new int[]{10, 3, 5, 6, 2});
    assertArrayEquals(new int[]{180, 600, 360, 300, 900}, ints);
  }
}