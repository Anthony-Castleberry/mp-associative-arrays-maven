package edu.grinnell.csc207;

import edu.grinnell.csc207.util.AssociativeArray;
import edu.grinnell.csc207.util.NullKeyException;
import edu.grinnell.csc207.util.KeyNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Anthony Castleberry
 */
public class TestsFromStudent {
  /**
   * Do the methods remove() and set() alter the size field when neccesary.
   * 
   * @throws NullKeyException
   * @throws KeyNotFoundException
   */
  @Test
  public void castleberryAnthonyTest1() throws Exception {
    AssociativeArray<String, Integer> testArrayOne = new AssociativeArray<String, Integer>();
    int expectedSize = 0;
    assertEquals(expectedSize, testArrayOne.size());
    expectedSize++;
    try {
      testArrayOne.set("1", 1);
      assertEquals(expectedSize, testArrayOne.size());
    } catch (Exception e) {
      fail("set threw an exception");
    } // try/catch
    try {
      testArrayOne.set("1", 2);
      assertEquals(expectedSize, testArrayOne.size());
    } catch (Exception e) {
        fail("set threw an exception");
    } // try/catch
    expectedSize--;
    try {
      testArrayOne.remove("1");
      assertEquals(expectedSize, testArrayOne.size());
    } catch (Exception e) {
      fail("remove threw an exception");
    } // try/catch
    try {
      testArrayOne.remove("1");
      assertEquals(expectedSize, testArrayOne.size());
    } catch (Exception e) {
      fail("remove threw an exception");
    } // try/catch
   } // castleberryAnthonyTest1()

  /**
   * Do the methods throw the appropiate exceptions.
   * 
   * @throws NullKeyException
   * @throws KeyNotFoundException
   */
  @Test
  public void castleberryAnthonyTest2() throws Exception {
    AssociativeArray<String, Integer> testArrayTwo = new AssociativeArray<String, Integer>();

    // does set throw a NullKeyException?
    try {
      testArrayTwo.set(null, 2);
      fail("Exception was not thrown with null key");
    } catch (NullKeyException e) {
      assertEquals(1, 1);
    } // try/catch

    // does set throw a NullKeyException?
    try {
      testArrayTwo.get("key does not exist");
      fail("get did not report that Key did not exist");
    } catch (KeyNotFoundException e) {
      assertEquals(1, 1);
    } // try/catch
  } // castleberryAnthonyTest2()

  /**
   * does get throw a KeyNotFoundException when null is input
   */
  @Test
  public void castleberryAnthonyEdge1() throws Exception {
    AssociativeArray<Integer, Integer> edgeArray =  new AssociativeArray<Integer, Integer>();
    try {
      edgeArray.get(null);
      fail("KeyNotFoundException not thrown when null key input");
    } catch (KeyNotFoundException e) {
      assertEquals(1,1);
    } // try/catch
  } // castleberryAnthonyEdge1()
} // class TestsFromStudent
