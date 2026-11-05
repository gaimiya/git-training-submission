package chapter5.program1;

public abstract class Employee {
	private String name;
	private String department;
	
	public Employee(String name, String department) {
		setName(name);
		setDepartment(department);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setDepartment(String belongTo) {
		this.department = belongTo;
	}
	public String getDepartment() {
		return this.department;
	}
	
	public abstract void disclosure();
}
