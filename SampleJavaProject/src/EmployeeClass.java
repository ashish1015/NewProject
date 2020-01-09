/**
 * 
 */


import java.util.Comparator;

/**
 * @author manish.gupta
 *
 */
public class EmployeeClass {

	private int id;
	private String name, department;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "EmployeeClass [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	public EmployeeClass(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	
}

class NameComparator implements Comparator<EmployeeClass> {
    
	
	@Override
    public int compare(EmployeeClass o1, EmployeeClass o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


class DepartmentComparator implements Comparator<EmployeeClass> {
    
	
	@Override
    public int compare(EmployeeClass o1, EmployeeClass o2) {
        return o1.getDepartment().compareTo(o2.getDepartment());
    }
}

