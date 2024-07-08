import java.util.Scanner;
class IntLinkedList{
	Scanner sc = new Scanner(System.in);
	class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			next=null;
		}
	}

	private Node head=null;
	public void createList(int non){
		for(int i=1; i<=non; i++){
			System.out.println("enter a data");
			Node temp=new Node(sc.nextInt());
			if(i==1){
				head=temp;
			}else{
				Node t=head;
				while(t.next!=null) t=t.next;
				t.next=temp;
			}
		}
	}
	public void traverse(){
		if(head==null){
			System.out.println("empty list");
		}else{
			Node temp=head;
			while(temp!=null){
				System.out.println(temp.data+" ");
				temp=temp.next;
			}
		}
	}

	public void insert(int pos){
		Node temp=new Node(sc.nextInt());
			temp.next=head;
			head=temp;
	}

	public void lastnode(int data, int pos){
		  Node temp=new Node(data);
      		if(pos==1){
			temp.next=head;
			head=temp;
		}else{
			Node p=head;
			int t=1;
			while(p.next!=null&&t<pos-1){
				t++;
				p=p.next;
			}
			if(t==pos-1){
				temp.next=p.next;
				p.next=temp;
			}else{
				System.out.println("position does'nt exists");
			}
		}
	}

	public void deleteNode(int pos){
		if(head==null){
			System.out.println("empty list");
		}else if(pos==1){

			Node p=head;
			head = p.next;
			p.next=null;
		}else{

			Node p= head;
			Node q=head;
			int t=1;
			while(q.next!=null&t<pos){
				p=q;
				q=q.next;
				t++;
			}
			p.next=q.next;
			q.next=null;
		}
	}
}






