import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertEquals(5, input1[0]);
    assertEquals(4, input1[1]);
    assertEquals(3, input1[2]);

    int[] input2 = {3, 4};
    ArrayExamples.reverseInPlace(input2);
    assertEquals(4, input2[0]);
    assertEquals(3, input2[1]);

    int[] input3 = {3};
    ArrayExamples.reverseInPlace(input3);
    assertEquals(3, input3[0]);
    assertEquals(1, input3.length);

    int[] input4 = {};
    ArrayExamples.reverseInPlace(input4);
    assertEquals(0, input4.length);
	}

  @Test
  public void testReversed() {
    int[] input1 = {3, 4, 5};
    assertArrayEquals(new int[]{5, 4, 3}, ArrayExamples.reversed(input1));

    int[] input2 = {3, 4};
    assertArrayEquals(new int[]{4, 3}, ArrayExamples.reversed(input2));

    int[] input3 = {3};
    assertArrayEquals(new int[]{3}, ArrayExamples.reversed(input3));

    int[] input4 = {};
    assertEquals(0, ArrayExamples.reversed(input4).length);
  }
}

