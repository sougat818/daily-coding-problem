package com.dailycodingproblem.p4;

import static com.dailycodingproblem.p4.Problem4.findMissingPositiveIntegerSolution;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class Problem4Test {

  @Test
  public void findMissingPositiveIntegerSolutionTest() {

    assertEquals(1, findMissingPositiveIntegerSolution(Arrays.asList(3, 2, 3, 4)));
    assertEquals(2, findMissingPositiveIntegerSolution(Arrays.asList(3, 4, -1, 1)));
    assertEquals(3, findMissingPositiveIntegerSolution(Arrays.asList(1, 2, 0)));
    assertEquals(1, findMissingPositiveIntegerSolution(Arrays.asList(0, 0, 0)));
    assertEquals(1, findMissingPositiveIntegerSolution(Arrays.asList()));
    assertEquals(1,
        findMissingPositiveIntegerSolution(Arrays.asList(123213, 12312321, 12321312)));
    assertEquals(6, findMissingPositiveIntegerSolution(Arrays.asList(1, 2, 3, 4, 5)));

  }
}