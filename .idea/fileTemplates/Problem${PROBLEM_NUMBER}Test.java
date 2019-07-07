package com.dailycodingproblem.p${PROBLEM_NUMBER};

import org.junit.Before;
import org.junit.Test;

public class Problem${PROBLEM_NUMBER}Test {

  Problem${PROBLEM_NUMBER} problem${PROBLEM_NUMBER};

  @Before
  public void setUp() {
    problem${PROBLEM_NUMBER} = new Problem${PROBLEM_NUMBER}();
  }

  @Test
  public void testSolution() {
    problem${PROBLEM_NUMBER}.solution();
  }
}