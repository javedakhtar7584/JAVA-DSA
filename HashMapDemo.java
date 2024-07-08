import java.util.HashMap;
import java.util.Set;
class HashMapDemo{
	public static void main(String[]args){
		HashMap <String,String> hm= new HashMap<> ();
			hm.put("name","javed akhtar");
			hm.put("city","lucknow");
			hm.put("country","india");
			Set<String> s= hm.keySet();
			for(String str : s){
				System.out.println(hm.get(str));
			}
	}
}
