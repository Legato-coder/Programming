package programming;

import java.util.HashMap;

public class HashMapIteration {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Choco-Fruit");
		
		System.out.println(map.get(2)); //ouput-banana
		System.out.println(map);
		
		
	}

}
