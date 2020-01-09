/**
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author manish.gupta
 *
 */
public class EmployeeTest {

	public static void main(String[] args) {

		List<EmployeeClass> employeeList = new ArrayList<>();

		EmployeeClass emp1 = new EmployeeClass(1, "Manish", "IT");
		EmployeeClass emp2 = new EmployeeClass(2, "Ashish", "IT");
		EmployeeClass emp3 = new EmployeeClass(3, "Deepak", "IT");
		EmployeeClass emp4 = new EmployeeClass(4, "Vinay", "ABC");
		EmployeeClass emp5 = new EmployeeClass(5, "Sandeep", "Testing");
		EmployeeClass emp6 = new EmployeeClass(6, "Test", "QA");
		EmployeeClass emp7 = new EmployeeClass(6, "Manish", "QA");
		EmployeeClass emp8 = new EmployeeClass(6, "Ashish", "QA");

		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		employeeList.add(emp6);
		employeeList.add(emp7);
		employeeList.add(emp8);

		
		  System.out.println("Original employees list: " + employeeList);
		  
		  Collections.sort(employeeList, new NameComparator());
		  
		  System.out.println("\n ----------------------------------------------------------- -----------------------------------------------------------\n ");
		  System.out.println("Sorted employees list on basis of names : " +
		  employeeList);
		  
		  Collections.sort(employeeList, new DepartmentComparator());
		  System.out.println("\n");
		  System.out.println("\n ----------------------------------------------------------- -----------------------------------------------------------\n ");
		  System.out.println("Sorted employees list on basis of department " +
		  employeeList);
		 
		  System.out.println("\n ----------------------------------------------------------- -----------------------------------------------------------\n ");
		
		//Sorting on multiple fields; Group by.
		Comparator<EmployeeClass> groupByComparator = Comparator.comparing(EmployeeClass::getDepartment).thenComparing(EmployeeClass::getName);
		employeeList.sort(groupByComparator);
		System.out.println("Sorted employees list on basis of department and then name" + employeeList);

	}
}
