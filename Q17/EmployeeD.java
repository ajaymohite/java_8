package Q17;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import assignment.City;

public class EmployeeD {
	/*
	 * String empName;
	 *  LocalDate birth; 
	 *  LocalDate joining; 
	 *  LocalDate resign; 
	 *  String location; 
	 *  String department; 
	 *  double salary;
	 */
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("ajay",LocalDate.of(1996, 04, 22),LocalDate.of(2010, 03, 18),LocalDate.of(2030, 11, 23),"pune","development",23000));
		list.add(new Employee("vijay",LocalDate.of(1996, 11, 01),LocalDate.of(2005, 05, 15),LocalDate.of(2030, 07, 23),"mumbai","testing",25000));
		list.add(new Employee("smith",LocalDate.of(1996, 07, 25),LocalDate.of(2011, 05, 15),LocalDate.of(2030, 07, 23),"chennai","testing",25000));
		list.add(new Employee("john",LocalDate.of(2005, 9, 25),LocalDate.of(2025, 05, 30),LocalDate.of(2035, 07, 15),"hydrabad","testing",25000));
		
		System.out.println("enter a department");
		Scanner sc=new Scanner(System.in);
		String choice=sc.nextLine();
		List<String> dept=list.stream().filter(i->i.department==choice).map(i->i.empName).collect(Collectors.toList());
		System.out.println(dept);
		
		
		
		
		Employee m=list.stream().max((a,b)->a.salary>b.salary ?1:-1).get();
		System.out.println("higesh population city is :"+m.empName);
		
		//City leastArea=clist.stream().min((a,b)->a.area>b.area ?1:-1).get();
		
		
		
		
		
		
		
		
	
		
		 
		 
		 
		 
		
		
		
	}

}
