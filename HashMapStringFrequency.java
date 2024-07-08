import java.util.HashMap;
import java.util.Set;
class HashMapStringfq{
	public static void main(String[]args){
		String s= "lucknow junction";
		HashMap<Character,Integer> frequency = new HashMap <> ();
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)==' ')continue;
				if(frequency.get(s.charAt(i))==null){
					frequency.put(s.charAt(i),1);
				}else{
					int x=frequency.get(s.charAt(i)).intValue();
					x++;
					frequency.put(s.charAt(i),x);
				}
				 for (Character c : frequency.keySet()) {
         				   System.out.println(frequency.get(c));
        			}
		}
	}
}
