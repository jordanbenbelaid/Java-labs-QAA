package exercise8;

import java.util.ArrayList;
import java.util.Iterator;

public class Manager extends Employee {
	ArrayList<Employee> employees = null;
	
	public Manager(String name, String jobTitle) {
		super(name, jobTitle);
		employees = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	
	@Override
	public String getInfo() {
		StringBuilder res = new StringBuilder(super.getInfo());
		for (Employee employee : employees) {
			res.append(employee.getInfo() + "\n");
		}
		return res.toString();
	}
}
