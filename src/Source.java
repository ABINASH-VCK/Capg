import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}
	
}
public class Source {

	public static void main(String[] args) {
	Set<Employee> emp=new TreeSet<Employee>();
	Employee emp1=new Employee(102, "abinash", 32000, 22, "Developer");
	emp.add(emp1);
	emp.add(new Employee(103, "dinesh", 33000, 23, "Java Developer"));
	emp.add(new Employee(101, "karthi", 23000, 41, "Sr. Developer"));
	emp.add(new Employee(104, "madhu", 45500, 35, "Team leader"));
	emp.add(new Employee(105, "ashika", 12500, 32, "HR"));
	emp.add(new Employee(106, "arthi", 67500, 42, "Team leader"));
	System.out.println("======== Stored default by ID======");
	for (Employee employee : emp) {
		System.out.println(employee);
	}
	System.out.println("========= Tree Set By Name ==========");
	
	TreeSet<Employee> empName=new TreeSet<Employee>(new SortByName());
	empName.addAll(emp);
	for (Employee employee : empName) {
		System.out.println(employee);
	}
	
	System.out.println("============ Tree Set By Designation using lambda====");
	TreeSet<Employee> empDes=new TreeSet<Employee>((o1,o2)->o1.getDesignation().compareTo(o2.getDesignation()));
	
	empDes.addAll(emp);
	
	for(Employee employee : empDes) {
		System.out.println(employee);
	}
	}
	}



