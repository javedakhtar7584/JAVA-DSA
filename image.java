import java.io.*;
import java.util.*;

 class Imagecopy {
    public static void main(String[] args) {
    	    String uh= System.getProperty("user.home");
		String sep = File.separator;
		File  f1= new File("java.jpg");
		File f2 = new File("java2image.jpg");


       		 try {
           		 FileInputStream fis= new FileInputStream(f1);
			FileOutputStream fos = new FileOutputStream(f2);
			int data=0;
			while((data=fis.read())!=-1){
				fos.write(data);
			}
			fis.close();
			fis.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
