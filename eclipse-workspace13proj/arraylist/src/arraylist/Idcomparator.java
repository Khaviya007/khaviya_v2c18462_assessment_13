package arraylist;
import java.util.Comparator;
public class Idcomparator implements Comparator<Employee> {
	  
	public int compare(Employee o1,Employee o2){  
	Employee s1=(Employee)o1;  
	Employee s2=(Employee)o2;  
	  
	if(s1.empid==s2.empid)  
	return 0;  
	else if(s1.empid>s2.empid)  
	return 1;  
	else  
	return -1;  
	}  

}
