	import java.util.Vector;
	public class VectorDemo{
		public static void main(String[]args){
			Vector v= new Vector();
				v.add("lucknow");
				v.add(10);
				v.add(3.12f);
			//	String s= v.get(0);
				String s=(String)v.get(0);
			//	int i=v.get(1);
				int i=((Integer)v.get(1)).intValue();
				System.out.println(s+" "+i);
		}
	}
