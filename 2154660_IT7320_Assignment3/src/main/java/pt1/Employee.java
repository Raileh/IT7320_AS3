package pt1;

public class Employee {
	
	double income;
	int amount;
	boolean option;
	
	public Employee(double income, int amount, boolean option) {
		this.income = income;
		this.amount = amount;
		this.option = option;
	}
	
	public double getIncome() {
		return income;
	}

	public void setIncome(Employee emp) {
		this.income = emp.income;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(Employee emp) {
		this.amount = emp.amount;
	}

	public boolean isOption() {
		return option;
	}

	public void setOption(Employee emp) {
		this.option = emp.option;
	}
	
	
}
