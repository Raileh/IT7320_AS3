package pt1;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import junit.framework.TestCase;
import pt1.Implementation;
import pt1.Interface;

public class ImplementationTest {
	
	//create the object for the interface and implementation
	Interface interfaceObj;
	Implementation implementationObj;
	Employee empObj1;
	Employee empObj2;
	int amount;
	double income;
	boolean option;
	
	@Before
	public void setUp() throws Exception {
		
		implementationObj = new Implementation();
		income = 200.00;
		amount = 100;
		option = true;
		//Employee object 1 & 2 (double income, amount, kiwiOption)
		empObj1 = new Employee(income,amount,option);
		empObj2 = new Employee(income,amount,option);

		//initialized the sock object
		interfaceObj = Mockito.mock(Interface.class);
		
		//Mock for computeTax(amount)
		Mockito.when(interfaceObj.computeTax(empObj1.getAmount())).thenReturn(100);
		
		//Mock for weeklySalary(income)
		Mockito.when(interfaceObj.weeklySalary(empObj1)).thenReturn(empObj2);
		
		//Mock for fortnightSalary(income)
		Mockito.when(interfaceObj.fortnightSalary(empObj1)).thenReturn(empObj2);
		
		//Mock for computeKiwiSaver(kiwiOption)
		Mockito.when(interfaceObj.computeKiwiSaver(empObj1)).thenReturn(empObj2);
		
		implementationObj.setObj(interfaceObj);
	}
	
	@After
	public void tearDown() throws Exception{
		interfaceObj = null;
		implementationObj = null;
	}
	
	@Test
	public void testComputeTax() {
		assertEquals(100,interfaceObj.computeTax(empObj1.getAmount()));
	}
	
	@Test
	public void testWeeklySalary() {
		assertEquals(empObj2,interfaceObj.weeklySalary(empObj1));
	}
	
	@Test
	public void testFortnightSalary() {
		assertEquals(empObj2,interfaceObj.fortnightSalary(empObj1));
	}
	
	@Test
	public void testComputeKiwiSaver() {
		assertEquals(empObj2,interfaceObj.computeKiwiSaver(empObj1));
	}
	

}
