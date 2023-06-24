package Project;

import java.util.ArrayList;
import java.util.List;

public class Database 
{
	public static List<Employee> getPuList()
	{
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "harshad", "Durga", 2000));
		list.add(new Employee(1, "vishal", "Durga", 5000));
		list.add(new Employee(1, "Aaksh", "Durga", 9000));
		list.add(new Employee(1, "nikhil", "Durga", 7000));
		
		return list;
		
	}

}
