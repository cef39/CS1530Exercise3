import org.junit.Test;
import static org.junit.Assert.*;

import christian.Fibonacci;

public class FibonacciTest {

	@Test
	public void testFibonacci0() {
		assertEquals(Fibonacci.fibonacci(0), 0);
	}

	@Test
	public void testFibonacci1() {
		assertEquals(Fibonacci.fibonacci(1), 1);
	}

	@Test
	public void testFibonacci9() {
		assertEquals(Fibonacci.fibonacci(9), 34);
	}
}