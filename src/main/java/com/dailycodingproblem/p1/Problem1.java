package com.dailycodingproblem.p1;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * Bonus: Can you do this in one pass?
 */


class Problem1 {

    static Boolean addsToK(Integer K, Integer... list) {


        Set<Integer> possibleKs = new HashSet<>();
        for (Integer integer : list) {
            if (possibleKs.contains(integer)) {
                return true;
            } else {
                possibleKs.add(K - integer);
            }
        }
        return false;

    }

}
