import org.junit.Test;
import static org.junit.Assert.*;

import exercise3.Exercise3;

public class Exercise3Test {

	@Test
	public void testLazy1() {
		assertEquals(Exercise3.Lazy(0), 1);
	}

	@Test
	public void testLazy2() {
		assertEquals(Exercise3.Lazy(1), 2);
	}

	@Test 
	public void testLazy3(){
		assertEquals(Exercise3.Lazy(2), 4);
	}

	@Test
	public void testTri1(){
		assertEquals(Exercise3.Tri(0), 0);
	}

	@Test
	public void testTri2(){
		assertEquals(Exercise3.Tri(1), 1);
	}

	@Test
	public void testTri3(){
		assertEquals(Exercise3.Tri(2), 3);
	}

}