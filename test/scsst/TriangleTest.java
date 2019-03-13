package scsst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	Triangle a;
	@Before
	public void iii(){
		a = new Triangle();
	}
	@Test
	public void test1(){
		assertEquals(1,a.RMB(1));
	}
	@Test
	public void test2(){
		assertEquals(1,a.RMB(22));
	}
	@Test
	public void test3(){
		assertEquals(1,a.RMB(35));
	}
	@Test
	public void test4(){
		assertEquals(1,a.RMB(82));
	}
	@Test
	public void test5(){
		assertEquals(1,a.RMB(19));
	}
	
}
