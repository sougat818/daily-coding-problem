package com.dailycodingproblem.p7;

import static com.dailycodingproblem.p7.Problem7.decode;
import static com.dailycodingproblem.p7.Problem7.mapping;
import static com.dailycodingproblem.p7.Problem7.mergeMessages;
import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import org.junit.Test;

public class Problem7Test {

  @Test
  public void decodeTest() {
    assertEquals("[a]", decode(1).toString());
    assertEquals("[b]", decode(2).toString());
    assertEquals("[c]", decode(3).toString());
    assertEquals("[d]", decode(4).toString());
    assertEquals("[e]", decode(5).toString());
    assertEquals("[f]", decode(6).toString());
    assertEquals("[g]", decode(7).toString());
    assertEquals("[h]", decode(8).toString());
    assertEquals("[i]", decode(9).toString());
    assertEquals("[j]", decode(10).toString());
    assertEquals("[aa, k]", decode(11).toString());
    assertEquals("[ab, l]", decode(12).toString());
    assertEquals("[ac, m]", decode(13).toString());
    assertEquals("[ad, n]", decode(14).toString());
    assertEquals("[ae, o]", decode(15).toString());
    assertEquals("[p, af]", decode(16).toString());
    assertEquals("[q, ag]", decode(17).toString());
    assertEquals("[r, ah]", decode(18).toString());
    assertEquals("[s, ai]", decode(19).toString());
    assertEquals("[t]", decode(20).toString());
    assertEquals("[u, ba]", decode(21).toString());
    assertEquals("[bb, v]", decode(22).toString());
    assertEquals("[bc, w]", decode(23).toString());
    assertEquals("[bd, x]", decode(24).toString());
    assertEquals("[be, y]", decode(25).toString());
    assertEquals("[bf, z]", decode(26).toString());
    assertEquals("[bg]", decode(27).toString());
    assertEquals("[bh]", decode(28).toString());
    assertEquals("[ii]", decode(99).toString());
    assertEquals("[aaa, ka, ak]", decode(111).toString());
    assertEquals("[aab, kb, al]", decode(112).toString());
    assertEquals("[abf, az, lf]", decode(126).toString());
    assertEquals("[abg, lg]", decode(127).toString());

    assertEquals("[iii]", decode(999).toString());
    assertEquals("[kk, aka, kaa, aak, aaaa]", decode(1111).toString());
    assertEquals("[zz, bfbf, bfz, zbf]", decode(2626).toString());
    assertEquals("[bflf, zaz, zabf, bfaz, zlf, bfabf]", decode(26126).toString());

  }


  @Test
  public void mappingTest() {
    assertEquals("a", mapping(1));
    assertEquals("b", mapping(2));
    assertEquals("c", mapping(3));
    assertEquals("d", mapping(4));
    assertEquals("e", mapping(5));
    assertEquals("f", mapping(6));
    assertEquals("g", mapping(7));
    assertEquals("h", mapping(8));
    assertEquals("i", mapping(9));
    assertEquals("j", mapping(10));
    assertEquals("k", mapping(11));
    assertEquals("l", mapping(12));
    assertEquals("m", mapping(13));
    assertEquals("n", mapping(14));
    assertEquals("o", mapping(15));
    assertEquals("p", mapping(16));
    assertEquals("q", mapping(17));
    assertEquals("r", mapping(18));
    assertEquals("s", mapping(19));
    assertEquals("t", mapping(20));
    assertEquals("u", mapping(21));
    assertEquals("v", mapping(22));
    assertEquals("w", mapping(23));
    assertEquals("x", mapping(24));
    assertEquals("y", mapping(25));
    assertEquals("z", mapping(26));
  }

  @Test
  public void testMergeMessagesEmpty() {
    HashSet<String> first = new HashSet<>();
    HashSet<String> second = new HashSet<>();
    assertEquals("[]", mergeMessages(first, second).toString());
  }

  @Test
  public void testMergeMessagesOneEmpty() {

    HashSet<String> first = new HashSet<>();
    first.add("first");
    HashSet<String> second = new HashSet<>();
    assertEquals("[]", mergeMessages(first, second).toString());
  }


  @Test
  public void testMergeMessagesSingleItems() {

    HashSet<String> first = new HashSet<>();
    HashSet<String> second = new HashSet<>();
    first.add("first");
    second.add("second");

    assertEquals("[firstsecond]", mergeMessages(first, second).toString());
  }


  @Test
  public void testMergeMessagesMultipleItems() {

    HashSet<String> first = new HashSet<>();
    HashSet<String> second = new HashSet<>();
    first.add("first1");
    first.add("first2");

    second.add("second1");
    second.add("second2");

    assertEquals("[first2second1, first1second1, first2second2, first1second2]",
        mergeMessages(first, second).toString());
  }

  @Test
  public void testMergeMessagesMultipleAsymmetricItems() {

    HashSet<String> first = new HashSet<>();
    HashSet<String> second = new HashSet<>();
    first.add("first1");
    first.add("first2");
    first.add("first3");

    second.add("second1");
    second.add("second2");

    assertEquals(
        "[first3second1, first3second2, first2second1, first1second1, first2second2, first1second2]",
        mergeMessages(first, second).toString());
  }
}