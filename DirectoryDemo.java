import java.io.*;
import java.util.*;
class DirectoryDemo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter directory name to be created");
		String name= sc.nextLine().trim();
		File f = new File("/home/javed"+name);
		f.mkdir();
	}
}
