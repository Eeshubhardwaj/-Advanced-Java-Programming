import java.util.*;
import java.util.stream.*;

class Employee12{
	int Empid;
	int Salary;
	String name;
	Employee12(int id,int Salary,String name){
		this.Empid=id;
		this.Salary=Salary;
		this.name=name;
	}
}
public class streamapi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee12> emp=Arrays.asList(
				new Employee12(01,70000,"ram"),
			    new Employee12(02,60000,"Shyam")
	);
		List<String>names=emp.stream().filter(x->x.Salary>60000).map(s->s.name).collect(Collectors.toList());
		System.out.println(names);
	}

}
