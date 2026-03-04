package animtry2;

public class EmployeeWithLocation {
	
//	extends Employee 
	
	String location;
	public EmployeeWithLocation() {}

//	public EmployeeWithLocation(int id, String name, String department, String location) {
//		super(id, name, department);
//		this.location = location;
//	}

//	public String getLocation() {
//		return location;
//	}
//
//	public void setLocation(String location) {
//		this.location = location;
//	}
	
//	@Override
	public void printMe() {
		System.out.println("The location is in the overriden method" + this.location);
		
	}

}
