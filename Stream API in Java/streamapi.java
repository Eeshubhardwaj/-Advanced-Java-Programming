import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.*;
import java.util.*;

public class streamapi {

	public static void main(String[] args) {
		
		//1
//		int[] arr= {3,4,2,65,87};
//		IntStream s=Arrays.stream(arr); //to store a stream
//		s.forEach(x->System.out.print(x+" "));
//		System.out.println("");
		
		//2.values  another way to create a stream
//		Stream<Integer> s2=Stream.of(2,6,57,89);
//		s2.forEach(x->System.out.print(x+" "));
//		System.out.println("");
		
		//3 Collections
		
		//List<Integer> list=new ArrayList<>();
		List<Integer> l3=new ArrayList<>();
		l3.add(34);
		l3.add(5);
		l3.add(56);
		l3.add(12);
		
		//Stream<Integer> s3=l3.stream();
		List<Integer> l4=l3.stream().filter(x->x%2==0).map(x->x*x).collect(Collectors.toList());
		System.out.println(l4);
		
		
		
		
		
		
//		s3.forEach(x->{
//			if(x%2==0)
//				list.add(x);
//				
//		});
//		System.out.println("");
		
	}

}
