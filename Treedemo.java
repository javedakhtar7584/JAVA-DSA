/*import java.util.*;
class TreeSetDemo{
	public static void main(String[]args){
		int [] arr={7,8,2,5,3,9,15,4};
		TreeSet<Integer> ts= new TreeSet<>();
		for(int i=0; i<arr.length; i++){
			ts.add(arr[i]);
		}
		int sl=0;
		for(int i=0; i<2; i++){
			sl=ts.pollLast().intValue();
		}
		System.out.println(sl);
	}
}*/


import java.util.*;
 class TreeDemo{
	public static void main(String[]args){
		TreeMap<String,Integer> tm = new TreeMap<> ();
			tm.put("umarata",200);
			tm.put("ajay",600);
			tm.put("suresh",500);
			tm.put("bimlesh",500);
		Set<String> s = tm.keySet();
		for(String str : s){
			System.out.println(tm.get(str));
		}
	}
}
