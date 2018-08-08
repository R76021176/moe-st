package fcu.sqa.maven_demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DiffDemoTest {

	private DiffDemo diffDemo;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		diffDemo = new DiffDemo();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	/*
	public void test() {
		fail("Not yet implemented");
	}*/

	public void testGetDiff() {
		String str1 ="abcde";
		String str2= "abcxy";
		String expected = "xy";
		
		try {
			String deffResult = diffDemo.getDiff(str1, str2);
			assertEquals(expected, deffResult);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}
