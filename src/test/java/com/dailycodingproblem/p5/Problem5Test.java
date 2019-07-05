package com.dailycodingproblem.p5;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class Problem5Test {

  @Test
  public void findMissingPositiveIntegerSolution() {

    assertEquals(2, Problem5.findMissingPositiveIntegerSolution(Arrays.asList(3, 4, -1, 1)));
    assertEquals(3, Problem5.findMissingPositiveIntegerSolution(Arrays.asList(1, 2, 0)));
    assertEquals(1, Problem5.findMissingPositiveIntegerSolution(Arrays.asList(0, 0, 0)));
    assertEquals(1, Problem5.findMissingPositiveIntegerSolution(Arrays.asList()));
    assertEquals(1,
        Problem5.findMissingPositiveIntegerSolution(Arrays.asList(123213, 12312321, 12321312)));
    assertEquals(6, Problem5.findMissingPositiveIntegerSolution(Arrays.asList(1, 2, 3, 4, 5)));

  }
}