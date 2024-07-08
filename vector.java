import java.util.Vector;
class VectorTest{
	public static void main(String[]args){
	Vector <String> names = new Vector <> ();
		System.out.println(names.size());
		System.out.println(names.capacity());
			names.add("javed");
			names.add("shahbaz");
			names.add("satyam");
			System.out.println(names.get(0));
			names.set(0,"aayesha");
			System.out.println(names.get(0));
	}
}
