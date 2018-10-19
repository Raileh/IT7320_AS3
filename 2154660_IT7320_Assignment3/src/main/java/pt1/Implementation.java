package pt1;

public class Implementation implements Interface{

	Interface obj;
	
	public int computeTax(int amount) {
		return obj.computeTax(amount);
	}

	public Employee weeklySalary(Employee emp) {
		return obj.weeklySalary(emp);
	}

	public Employee fortnightSalary(Employee emp) {
		return obj.fortnightSalary((emp));
	}

	public Employee computeKiwiSaver(Employee emp) {
		return obj.computeKiwiSaver(emp);
	}

	public void setObj(Interface obj) {
		this.obj = obj;
		
	}

}
