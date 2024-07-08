import java.util.Scanner;
class Doubly{
	Scanner sc = new Scanner(System.in);
	class Node{
		Node prev;
		Node next;
		int data;
		Node(int x){
			prev=null;
			next=null;
			data=x;
		}
	}
	private Node head;
	private int listsize;
	Doubly(){
		head=null;
	}
	void createlist(int size){
		listsize=size;
		Node p=null;
		for(int i=1;i<=size;i++){
			System.out.println("enter the data");
			Node temp= new Node(sc.nextInt());
			temp.next=temp;
			if(i==1){
				head=temp;
			}else{
				p=head;
				while(p.next!=head)p=p.next;
				p.next=temp;
				temp.prev=p;
				head.prev=temp;
				temp.next=head;
			}
		}
	}

	void forward(){
		Node temp=head;
		while(temp.next!=head){
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(temp.data+" ");
		temp=temp.next;
		System.out.println(temp.data);
	}

	void backward(){
		Node temp=head.prev;
		while(temp.prev!=head.prev){
			System.out.println(temp.data+" ");
			temp=temp.prev;
		}
		System.out.println(temp.data+" ");
		temp=temp.prev;
		System.out.println(temp.data);
	}

	public void insert(int pos,int data){
                Node temp=new Node(data);
                if(pos==1){
                        if(head==null){
                                head=temp;
                        }else{
                                Node p=head.prev;
                                p.next=temp;
                                temp.prev=p;
                                temp.next=head;
                                head.prev=temp;
                                head=temp;
                        }
                }else {
                        Node p=head;
                        int t=1;
                        while(p.next != head && t<pos-1){
                                t++;
                                p=p.next;
                        }
                        if(t==pos-1){
                                temp.next=p.next;
                                temp.prev=p;
                                if(p.next!=null){
                                        p.next.prev=temp;
                                }
                                p.next=temp;
                        }else{
                                System.out.println("Invalid position");
                        }
                }
        }

	public void delete(int pos){
                if(head==null){
                        System.out.println("List is already Empty");
                }else if(pos==1){
                        if(head.next==head){
                                head=null;
                        }else{
                                Node p=head.prev;
                                head=p.next.next;
                                head.prev=p;
                                p.next=head;
                        }
                }else{
                        Node p=head;
                        int count=2;
                        while(count < pos){
                                if(p.next.next == null){
                                        System.out.println("Invalid Position");
                                        return;
                                }
                                p = p.next;
                                count++;
                        }
                        Node q=p.next.next;
                        p.next=q;
                        if(q != null){
                                q.prev=p;
                        }
                }
        }
}




class Tester{
	public static void main(String[]args){
		Doubly dc=new Doubly();
		Scanner sc = new Scanner(System.in);
		int option=0;
		while(true){
			System.out.println("1. to create a new linked list");
			System.out.println("2. to traverse the linked list in forwarded");
			System.out.println("3. to traverse the linked list in backward");
			System.out.println("4. to insert a new Node");
			System.out.println("5. to delete a node ");
			System.out.println("10.  to exit");
			option = sc.nextInt();
			switch(option){
				case 1:
					System.out.println("1.to enter no. of nodes");
					int non=sc.nextInt();
					dc.createlist(non);
				break;
				case 2:
					System.out.println();
					dc.forward();
					System.out.println("linked list forwarded succesfully");
				break;
				case 3:
					System.out.println();
					dc.backward();
					System.out.println("linked list backwarded succesfully");
				break;
				case 4:
					System.out.println("enter data position");
					int a = sc.nextInt();
					System.out.println("enter node to insert");
					int b = sc.nextInt();
					dc.insert(a,b);
					System.out.println("Node inserted succesfully");
				break;
				case 5:
					System.out.println("enter node position to delete");
					int q=sc.nextInt();
					dc.delete(q);
					System.out.println("NOde deleted succesfully");
				break;
				case 10:
					System.exit(0);
				default:
					System.out.println("invalid option");
			}
		}
	}
}
