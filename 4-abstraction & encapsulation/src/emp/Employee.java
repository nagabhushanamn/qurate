package emp;


//  Java bean
public class Employee extends Object {

	private int id;
	private String name;
	private double salary;
	private double bonus;

	public Employee(int id) {
		if (id > 0)
			this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
		this.bonus = this.salary * 0.2;
	}

	public double getBonus() {
		return bonus;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

}