package Com.SkipAndLimi;

import java.util.Arrays;
import java.util.List;

public class SkipAndLImit 
{
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10,0);
		list.stream().skip(2).limit(4).forEach(System.out::println);
		
	}
}
