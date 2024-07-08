import java.util.Hashtable;
class HashtableDemo{
	public static void main(String[]args){
		Hashtable<String,Integer> ht= new Hashtable <> ();
			ht.put("India",5);
			ht.put("china",3);
			ht.put("USA",2);
			System.out.println(ht.get("India"));
			System.out.println(ht.get("USA"));
			ht.put("USA",1);
			System.out.println(ht.get("USA"));
	}
}
