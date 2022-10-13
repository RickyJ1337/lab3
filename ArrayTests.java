import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testBetterReverseInPlace() {
    int[] array = {1, 2};
    ArrayExamples.reverseInPlace(array);
    assertArrayEquals(new int[]{2, 1}, array);
  }

  @Test
  public void testBetterReversed() {
    int[] array = {4};
    assertArrayEquals(new int[]{4}, ArrayExamples.reversed(array));
  }
}
