package Number;

import java.util.Arrays;
import java.util.List;

public class FindOddNUmner 
{
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		list.stream().filter(e->e%2!=0).forEach(e->System.out.println(e));
	}

}
