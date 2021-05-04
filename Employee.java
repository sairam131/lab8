package pk6;

public class Employee {
	int id;
	String name;
	float salary;
	public Employee() {
		
	}
	public Employee(int id, String name, float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
	Employee e= new Employee(101, "apisero",12345.45f);
	System.out.println(e);
	}

}
