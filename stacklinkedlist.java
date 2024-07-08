import java.util.Scanner;
class IntStack{
	class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			next=null;
		}
	}

	private Node top=null;
	IntStack(){
		top=null;
	}

	public boolean push(int data){
		Node temp = new Node(data);
		if(temp==null)return false;
		temp.next=top;
		top=temp;
		return true;
	}
	public int pop(){
		if(top==null)return -1;
		System.out.println("stack is underflow");
		Node temp=top;
		top=top.next;
		temp.next=null;
		return temp.data;
	}
}

class Tester{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		IntStack ii = new IntStack();
		int option=0;
		while(true){
			System.out.println("1. enter data to push");
			System.out.println("2. enter data to pop");
			System.out.println("5. To exit");
			option=sc.nextInt();
			switch(option){
				case 1:
					System.out.println("Enter  Data to push");
					int a=sc.nextInt();
					ii.push(a);
				break;
				case 2:
					System.out.println(" to pop data");
					System.out.println(ii.pop());
				break;
				case 5:
					System.exit(0);
				default:
					System.out.println("invalid option");
			}
		}
	}
}


