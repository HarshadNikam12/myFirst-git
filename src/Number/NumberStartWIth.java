package Number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NumberStartWIth 
{
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> starNUmber = list.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2"))
		.map(Integer::valueOf)
		.collect(Collectors.toList());
		System.out.println(starNUmber);
	}

}
