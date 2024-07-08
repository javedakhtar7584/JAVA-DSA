class Queue{
	private int[] data;
	private int front;
	private int rear;

	public Queue(int size){
		data= new int[size];
		front =-1;
		rear=-1;
	}

	public void enqueue(int x){
		if(rear==data.length-1){
			System.out.println("Queue is over flow");
		}else{
			data[++rear]=x;
			if(front ==-1 && rear==0){
				front=0;
			}
		}
	}

	public int dequeue(){
		if(front==-1&&rear==-1){
			return -1;
		}
		if(front>rear){
			front =-1;
			rear=-1;
			return -1;
		}
		return data[front++];
	}
}




class QueueTest{
	public static void main(String[]args){
		Queue q = new Queue(10);
			q.enqueue(10);
			q.enqueue(10);
			int result;
			while((result=q.dequeue())!=-1){
				System.out.println(result);
			}
	}
}









