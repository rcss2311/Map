package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("UserName", "Maria");
		cookies.put("E-mail", "Maria@gmail.com");
		cookies.put("Phone", "666_meia mole-meia_dura");
		
		cookies.remove("E-mail");
		cookies.put("Phone", "666meia dura, meia mole");
		
		System.out.println("Contain 'phone' key: "+ cookies.containsKey("Phone"));
		System.out.println("Phone number: "+ cookies.get("Phone"));
		System.out.println("Email: "+ cookies.get("email"));
		System.out.println("Size: "+cookies.size());
		
		System.out.println("All cookies: ");
		
		for(String key: cookies.keySet()) {
			System.out.println(key+": "+ cookies.get(key));
		}

	}

}
