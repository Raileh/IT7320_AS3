package exercise;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ComputeImplementationTest {
	//create an object of the interface and implementation
	ICompute interfaceObj;
	ComputeImplementation implementationObj;
	int x, y;
	
	@Before
	public void setUp() throws Exception {
		implementationObj = new ComputeImplementation();
		x = 10;
		y = 12;
		
		//initialized the mock object 
		interfaceObj = Mockito.mock(ICompute.class);
		//Mock for multiply(x,y)
		Mockito.when(interfaceObj.multiply(x,y)).thenReturn(120);
		//Mock for squareVar(y)
		Mockito.when(interfaceObj.squareVar(y)).thenReturn(144);
		
		implementationObj.setObj(interfaceObj);
	}

	@After
	public void tearDown() throws Exception {
		interfaceObj = null;
		implementationObj = null;
	}
	
	//Build first test case 
	@Test
	public void testMultiply() {
		assertEquals(120, interfaceObj.multiply(x, y) );
	}
	//After the first test case success 
	
	//Build second test case
	@Test
	public void testSquareVar() {
		assertEquals(144, interfaceObj.squareVar(y));
	}

}
