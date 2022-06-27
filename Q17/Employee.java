package Q17;
import java.time.LocalDate;

public class Employee {
	
	String empName;
	LocalDate birth;
	LocalDate joining;
	LocalDate resign;
	String location;
	String department;
	double salary;
	
	
	public Employee(String empName, LocalDate birth, LocalDate joining, LocalDate resign, String location,
			String department, double salary) {
		super();
		this.empName = empName;
		this.birth = birth;
		this.joining = joining;
		this.resign = resign;
		this.location = location;
		this.department = department;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", birth=" + birth + ", joining=" + joining + ", resign=" + resign
				+ ", location=" + location + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
	
	

}
