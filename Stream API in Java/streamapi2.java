import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

//class Student12{
//	int id;
//	String name;
//	Student12(int id,String name){
//		this.id=id;
//		this.name=name;
//	}
//}
public class streamapi2 {

	public static void main(String[] args) {
		
//		List<Student12> stud=Arrays.asList(
//				new Student12(1,"ram"),
//				new Student12(2,"shyam")
//				
//				);
//		List<String> names=stud.stream().map(s->s.name).collect(Collectors.toList());
//		System.out.println(names);
		
		
		
		
//		List<String> list=new ArrayList<>();
//		list.add("Ajay");
//		list.add("Rahul");
//		List<String> list1=list.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
//		System.out.println(list1);
	
//		List<String> list2=List.of("Shyam","ram","AYESHA","Sherya");
//		List<String> l1=list2.stream().filter(s->s.endsWith("A")).collect(Collectors.toList());
//		List<String> l2=list2.stream().filter(s->s.contains("A")).collect(Collectors.toList());
//		System.out.println(l2);
//		System.out.println(l1);
		
		
//		
//		List<Integer> l2=List.of(12,-4,9,10,-3);
//		List<Integer> l3=l2.stream().filter(s->s>0).collect(Collectors.toList());
//		System.out.println(l3);
		
//		Find out list of pass and fail students in given list those attendance is more than 60%.
		List<Integer> marks=List.of(60,50,87,45,67,55,97,67);
		
		long list=marks.stream().filter(x->x>60).count();
		long list1=marks.stream().filter(x->x<60).count();
//		System.out.println("Passed students : "+list);
//		System.out.println("Failed Students : "+list1);
		long list2=marks.stream().filter(x->x>50).count();
		System.out.println("Numbers greater than 50 : "+list2);
		
		List<Integer> list3=marks.stream().filter(x->(x%2==0)).map(s->s*s);
		forEach(x->(System.out.println(marks)));
		
		
		
		
		
		
		
	}

}
