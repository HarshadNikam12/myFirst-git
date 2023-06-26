package Number;

import java.util.Arrays;
import java.util.List;

public class FindEvenNUmber 
{
	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(1,2,3,4,5,6,7,8,9);
		al.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
	}
	

}
