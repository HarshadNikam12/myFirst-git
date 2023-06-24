package Methods;

import java.util.HashMap;
import java.util.Map;

public class Maps 
{
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "harshad");
		map.put(2, "vishal");
		map.put(3, "hrusya");
		map.put(4, "rajendra");
		
		map.forEach((key,value)->System.out.println(key+" "+value));
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		
		
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(e->System.out.println(e));	
	}

}
