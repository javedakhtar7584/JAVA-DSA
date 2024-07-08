// this is 1st way
/*class MyThread implements Runnable{
	public void run(){
		for(int i=0; i<500; i++){
			System.out.println("i= "+i);
		}
	}
}

class ThreadTest{
	public static  void main(String[]args){
		Runnable  r = new MyThread();
		Thread t1= new Thread(r);
			Thread t2 = new Thread(r);
			t1.start();
			t2.start();
	}
}*/

// yhis is 2nd way
/*class ThreadTester{
	public static void main(String[]args){
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i = 0; i<5000;i++){
					System.out.println("i= "+i);
				}
			}
		});
//		t1.start();
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i =0; i<100; i++){
					System.out.println("i ="+i);
				}
			}
		});
		t1.start();
		t2.start();
	}
}*/



// 3rd way

/*class ThreadTester{
	public static void main(String[]args){
		Thread t1 = new Thread(()->{
			for(int i = 0; i< 500; i++){
				System.out.println("i="+i);
			}
		});
		t1.start();
	}
}*/

// 4th way by extending

class MThread extends Thread{
	public void run(){
		for(int i = 0; i< 10000; i++){
			System.out.println("i="+i);
		}
	}
}


class CheckThread{
	public static void main(String[]args){
		MThread mt1 = new  MThread();
		MThread mt2= new  MThread();
			mt1.start();
			mt2.start();
	}
}
