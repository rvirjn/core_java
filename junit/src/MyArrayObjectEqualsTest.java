import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyArrayObjectEqualsTest {
	
	Object expectedEmps = new Object();
	
	@Before
	public void initInputs(){
		expectedEmps = new Employee(3, "Krish", 5000);
		
	}
	
	@Test
	public void compareEmployees(){
		/**
		 * convert List of objects to array of objects
		 */
		Object testOutput = Employee.getEmpList();
		assertEquals(expectedEmps, testOutput);
	}
}
