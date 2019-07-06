package com.dailycodingproblem.p7;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it
 * can be decoded.
 * For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
 * You can assume that the messages are decodable. For example, '001' is not allowed.
 */

class Problem7 {

  /*
  Time Complexity - O(?)
  Space Complexity - O(?)
  Auxiliary Space - O(?)
   */
  static int countNumberOfWaysToDecode(int message) {
    return decode(message).size();
  }


  public static Set<String> decode(int number) {
    HashSet<String> result = new HashSet<>();
    if (number <= 0) {
      throw new IllegalArgumentException(
          "number in Problem7.decode should be between 0 and 100(exclusive)");
    }
    if (number > 99) {
      int counter = 1;
      int left;
      int right;
      do {
        left = number / (int) Math.pow(10, counter);
        right = number % (int) Math.pow(10, counter);
        result.addAll(mergeMessages(decode(left), decode(right)));
        counter++;

      } while (left >= 10);
      return result;
    }

    if (number > 10 && number % 10 != 0) {
      result.add(mapping(number / 10) + mapping(number % 10));

    }
    if (number < 27) {
      result.add(mapping(number));
    }
    return result;
  }

  public static String mapping(int number) {
    if (number <= 0 || number >= 27) {
      throw new IllegalArgumentException(
          "number in Problem7.mapping should be between 0 and 27(exclusive)");
    }
    return String.valueOf((char) (number + '`'));
  }


  public static Set<String> mergeMessages(Set<String> left, Set<String> right) {
    Objects.requireNonNull(left, "left Set in Problem7.mergeMessages cannot be null");
    Objects.requireNonNull(right, "right Set in Problem7.mergeMessages cannot be null");
    HashSet<String> result = new HashSet<>();
    left.forEach(s -> left.forEach(
        leftString -> right.forEach(
            rightString -> result.add(leftString.concat(rightString)))));
    return result;
  }
}
