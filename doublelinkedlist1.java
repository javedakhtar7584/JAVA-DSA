import java.util.Scanner;
class IntLinkedList{
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
				temp.prev=t;
                        }
                }
        }
        public void traverse(){
		Node p=head;
                while(p.next!=null){
			System.out.println(p.data);
			p=p.next;
		}
		System.out.println(p.data);
		while(p.prev!=null){
			System.out.println(p.data);
			p=p.prev;
		}
		System.out.println(p.data);
	}

	  public void insert(int data,int pos){
                Node temp=new Node(data);
                    if(head==null)head=temp;
			if(pos==1){
				temp.next=head;
				head.prev=temp;
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
					temp.prev=p;
					if(p.next!=null)p.next.prev=temp;
					p.next=temp;
					}else{
						System.out.println("position does not found");
					}
			}
	}


	 void  deleteNode(int pos){
		if(head==null){
			System.out.println("list is already empty");
			return;
		}
		if(pos<1){
			System.out.println("invalid position");
			return;
		}
		Node p=head;
		for(int i=1; p!=null && i<pos; i++){
			p=p.next;
		}
		if(p==null){
			System.out.println("position is out of range");
			return;
		}
		if(p.prev!=null){
			p.prev.next=p.next;
		}else{
			head = p.next;
		}
		if(p.next!=null){
			p.next.prev=p.prev;
		}
	}
}
