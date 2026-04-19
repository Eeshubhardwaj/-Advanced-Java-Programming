import java.util.List;
import java.util.*;
import java.util.stream.*;

public class streamapi3 {

	public static void main(String[] args) {
		
		List<Integer> l1=List.of(10,30,45,56,6,34,30,10);
//		l1.stream().distinct().forEach(System.out.println::l1);
		
//		List<Integer> l2=l1.stream().distinct().toList();
//		System.out.println(l2);
		
//		List<Integer> l2=l1.stream().distinct().skip(3).toList();
//		System.out.println(l2);
		
		List<Integer> l2=l1.stream().distinct().skip(1).limit(4).toList();
		System.out.println(l2);
		
		long c2=l1.stream().skip(1).limit(4).count();
		System.out.println(c2);
		
		long c=l1.stream().count();
		System.out.println(c);
		
		//l1.stream().filter()
	}

}
