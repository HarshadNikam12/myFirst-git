package SortMapUsingLampda;

import java.util.HashMap;
import java.util.Map;

public class SortingMap 
{
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "one");
		map.put(6, "six");
		map.put(9, "nine");
		map.put(3, "Three");
		map.put(5, "five");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("======================");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		
		
		
		
	}

}
