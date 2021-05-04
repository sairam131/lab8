package pk6;

public class Manager extends Employee{
	int hours;
	int rate;
	public Manager() {
		}

	public Manager(int id, String name, float salary, int hours, int rate) {
		super(id, name, salary);
		this.hours=hours;
		this.rate=rate;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Manager [hours=" + hours + ", rate=" + rate + ", id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}
	

	public static void main(String[] args) {
		Manager m= new Manager(256,"sairam",125478.35f, 154,457);
		System.out.println(m);
	}
}
	
	

