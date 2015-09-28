package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;


public class TriangleTest{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void test() 
	{
		
		Triangle triangleTest = new Triangle();
		double testcase = triangleTest.getArea();
		assertEquals(0.5, testcase, 0);
		
		
		Triangle triangleTest1 = new Triangle();
		double testcase1 = triangleTest1.getPerimeter();
		assertEquals(3.0, testcase1, 4.0);
						
	}

}

