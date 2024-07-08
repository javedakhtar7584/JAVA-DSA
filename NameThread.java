class NameThread implements Runnable{
	static MySync ms = new MySync();
	public void run(){
		System.out.println(Thread.currentThread().getName());
		ms.printer();
	}
}

class MySync{
	public synchronized void printer(){
		for(int i=0; i<5000; i++){
			System.out.println("i= "+i);
		}
	}
}


class ThreadDemo{
	public static void main(String[]args){
		System.out.println(Thread.currentThread().getName());
		Thread t1= new Thread(new NameThread());
		Thread t2= new Thread(new NameThread());
		t1.start();
		t2.start();
	/*	t1.setName("Engineer thtread");
		t2.setName("Doctor ji");
		t1.setPriority(10);
		t2.setPriority(3);

		t1.start();
		t2.start();*/
	}
}
