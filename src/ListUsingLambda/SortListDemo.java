package ListUsingLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Project.Database;
import Project.Employee;

public class SortListDemo 
{
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(4);
		list.add(9);
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(2);
		System.out.println("============Assending=============");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("============ReversOrdder=============");
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println("============Assending=============");
		
		list.stream().sorted().forEach(e->System.out.println(e));
		
		
		System.out.println("============ReversOrdder=============");

		list.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.println(e));
		
		
		System.out.println("===============================================================");
		
		List<Employee> employee=Database.getPuList();
		//employee.stream().sorted((a,b)->(int)(a.getSallary()-b.getSallary())).forEach(System.out::println);
		//employee.stream().sorted(Comparator.comparing(emp->emp.getSallary())).forEach(System.out::println);
		employee.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		
		
	}

}
