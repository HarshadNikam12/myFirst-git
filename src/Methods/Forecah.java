package Methods;

import java.util.ArrayList;
import java.util.List;

public class Forecah 
{
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("harshad");
		list.add("vishal");
		list.add("Aakash");
		list.add("rameswar");
		list.add("pundlik");
		
		list.stream().forEach(e->System.out.println(e));
	}

}
