package com.dailycodingproblem.p4;

import static com.dailycodingproblem.p4.Problem4.findMissingPositiveIntegerSolution;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Problem4Test {

  @Rule
  public Timeout globalTimeout = new Timeout(5, TimeUnit.MILLISECONDS);

  @Test
  public void findMissingPositiveIntegerSolutionTest1() {

    assertEquals(1, findMissingPositiveIntegerSolution(Arrays.asList(3, 2, 3, 4)));

  }

  @Test
  public void findMissingPositiveIntegerSolutionTest2() {

    assertEquals(2, findMissingPositiveIntegerSolution(Arrays.asList(3, 4, -1, 1)));

  }

  @Test
  public void findMissingPositiveIntegerSolutionTest3() {

    assertEquals(3, findMissingPositiveIntegerSolution(Arrays.asList(1, 2, 0)));

  }

  @Test
  public void findMissingPositiveIntegerSolutionTest4() {

    assertEquals(1, findMissingPositiveIntegerSolution(Arrays.asList(0, 0, 0)));

  }

  @Test
  public void findMissingPositiveIntegerSolutionTest5() {

    assertEquals(1, findMissingPositiveIntegerSolution(Arrays.asList()));

  }

  @Test
  public void findMissingPositiveIntegerSolutionTest6() {

    assertEquals(1,
        findMissingPositiveIntegerSolution(Arrays.asList(123213, 12312321, 12321312)));

  }

  @Test
  public void findMissingPositiveIntegerSolutionTest7() {

    assertEquals(6, findMissingPositiveIntegerSolution(Arrays.asList(1, 2, 3, 4, 5)));

  }
}