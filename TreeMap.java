import java.util.*;
import java.util.TreeMap;
class Tester{
        public static void main(String[]args){
                TreeMap<String, Integer> tm = new TreeMap<>();
                        tm.put("umarata",200);
                        tm.put("ajay",600);
                        tm.put("suresh",500);
                        tm.put("bimlesh",500);
	                Set<String> s = tm.keySet();
        	        for(String str : s){
                	        System.out.println(str+" "+tm.get(str));
                	}
        }
}
