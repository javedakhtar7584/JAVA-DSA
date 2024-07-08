/*import java.util.*;
class IterationDemo{
	public static void main(String[]args){
		ArrayList<String> al = new ArrayList<> ();
		al.add("lucknow");
		al.add("Allahabad");
		al.add("jaunpur");
		Iterator<String> it= al.iterator();
		while(it.hasNext()){
			String s= it.next();
			System.out.println(s);
		}
	}
}*/


/*import java.util.*;
class IterationDemo{
	public static void main(String[]args){
		TreeSet<String> hst= new TreeSet<>();
			hst.add("lucknow");
			hst.add("kanpur");
			hst.add("singapur");
			hst.add("lucknow");
			System.out.println(hst.size());
			Iterator<String> it = hst.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
	}
}*/

import java.util.*;
class IterationDemo{
	public static void main(String[]args){
		String s="lucknow junction";
		Set<Character> st = new HashSet<> ();
			for(int i =0; i<s.length(); i++){
				if(s.charAt(i)==' ')continue;
				st.add(s.charAt(i));
			}
			System.out.println(st.size());
	}
}
					 
