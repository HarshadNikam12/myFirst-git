package Number;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNumber 
{
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		Integer integer = list.stream().reduce((x,y)->x+y).get();
		System.out.println(integer);
	}

}
