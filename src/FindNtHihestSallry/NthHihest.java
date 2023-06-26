package FindNtHihestSallry;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NthHihest 
{
	public static void main(String[] args)
	{
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "Harshad", "Daman", 100000));
		list.add(new Employee(1, "Vishal", "nagar", 500000));
		list.add(new Employee(1, "Akkash", "vaijapur", 700000));
		list.add(new Employee(1, "Pundlik", "Valsad", 300000));
		list.add(new Employee(1, "Tushar", "vapi", 900000));
		
		
		
		Double double1 = list.stream().map(e->e.getSallary())
		.sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst().get();
		System.out.println(double1);
		System.out.println("======");
		
		list.stream().map(e->e.getSallary()).sorted(Comparator.reverseOrder())
		.distinct().limit(3).forEach(e->System.out.println(e));
		
		
	}

}
