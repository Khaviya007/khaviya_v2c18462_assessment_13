package arraylist;
import java.util.ArrayList;
import java.util.*;
//import java.util.EnumSet;
import arraylist.Employee.Status;
class Employee{
	int empid;
	String empname;
	Status status;
	
	enum Status{
		PENDING,CONFIRMED,REJECTED;
	}

	public Employee(int empid, String empname, Status status) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.status = status;
	}

	
}
public class Organization {

	public static void main(String[] args) {
	            ArrayList<Employee> emp=new ArrayList<Employee>();
				Employee e1 = new Employee(1,"John",Employee.Status.PENDING);
				Employee e2= new Employee(4,"Tom",Employee.Status.REJECTED);
				Employee e3= new Employee(2,"Sam",Employee.Status.CONFIRMED);
				Employee e4= new Employee(3,"Ram",Employee.Status.PENDING);
		      
				emp.add(e1);
				emp.add(e2);
				emp.add(e3);
				emp.add(e4);
				for(Employee i: emp) {
					System.out.println("Employeeid:"+i.empid + " "+"Employeename: " + i.empname+" "+"Status: "+i.status);
				}
				
				System.out.println("Sorted by empid:");  
				Collections.sort(emp,new Idcomparator());
				for(Employee k: emp) {
					System.out.println(k.empid + " "+ k.empname+" "+k.status);
				}
			
			   
			}

		}

	


