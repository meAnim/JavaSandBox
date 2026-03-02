package animtry2;

public class EmployeeWithLocation extends Employee {
	
	private String location;

	public EmployeeWithLocation(int id, String name, String department, String location) {
		super(id, name, department);
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
