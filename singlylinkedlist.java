import java.util.Scanner;
 class SingleCell{
	Scanner sc=new Scanner(System.in);
	class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			next=null;
		}
	}

	private Node head;
	private int listsize;
	SingleCell(){
		head=null;
	}
	void createlist(int size){
		listsize=size;
		Node p=null;
		for(int i=1;i<=size;i++){
			System.out.println("enter your nodes");
			Node temp=new Node(sc.nextInt());
			temp.next=temp;
			if(i==1){
				head=temp;
			}else{
				p=head;
				while(p.next!=head) p=p.next;
				p.next=temp;
				temp.next=head;
			}
		}
	}

	public void traverselist(){
		Node p=head;
		if(p==null){
			System.out.println("empty list");
		}else{
			while(p.next!=head){
				System.out.print(p.data+" ");
				p=p.next;
			}
			System.out.println(p.data);
		}
	}

	public void insert(int data,int pos){
		Node temp=new Node(data);
			temp.next=temp;
			if(pos==1){
				if(head==null){
					head=temp;
				}else{
					Node p=head;
					while(p.next!=head)p=p.next;
					temp.next=head;
					p.next=temp;
					head=temp;
				}
				int count=1;
				Node p=head;
				while(p.next!=head && count<pos-1){
					p=p.next;
					count++;
				}
				if(count==pos-1){
					temp.next=p.next;
					p.next=temp;
				}else{
					System.out.println("position does not found");
				}
			}
	}

	void delete(int pt){
		Node p=head; Node q=head;
		if(head==null){
			System.out.println("empty list");
		}else if(pt==1){
			while(q.next!=head)q=q.next;
				head=p.next;
				q.next=p.next;
		}else{
			int t=1;
			while(p.next!=head && t<pt){
				q=p;
				p=p.next;
				t++;
			}
			q.next=p.next;
			p.next=null;
		}
	}
}

class Tester{
	public static void main(String[]args){
		SingleCell list=new SingleCell();
		Scanner sc=new Scanner(System.in);
		int option=0;
		while(true){
			System.out.println("1. To Create Singly Circular List");
			System.out.println("2. To Traverse Linked List");
			System.out.println("3. To Insert Node");
			System.out.println("4. To Delete any Node");
			System.out.println("10 To exit");
			option=sc.nextInt();
			switch(option){
				case 1:
					System.out.println("enter number of linked list");
					int a=sc.nextInt();
					list.createlist(a);
					System.out.println();
				break;
				case 2:
					System.out.println();
					System.out.println("perform traversing operation");
					list.traverselist();
				break;
				case 3:
					System.out.println();
					System.out.println("enter data to insert node");
					int data=sc.nextInt();
					System.out.println("enter position where node is inserted");
					int pos=sc.nextInt();
					System.out.println("node inserted succesfully");
					list.insert(data,pos);
					System.out.println();
				break;
				case 4:
					System.out.println();
					System.out.println("Enter node position to delete");
					int p=sc.nextInt();
					list.delete(p);
					System.out.println("Node deleted sucessfully");
				break;

				case 10:
					System.exit(0);
				default:
					System.out.println("invalid option");
			}
		}
	}
}


