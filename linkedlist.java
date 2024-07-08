import java.util.Scanner;
class LinkedlistTester{
	public static void main(String[]args){
		 IntLinkedList iwi= new IntLinkedList();

		int option=0;
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("1. to create LinkedList");
			System.out.println("2.to traverse LinkedList");
			System.out.println("3. To add a new node");
			System.out.println("4. Add a last node");
			System.out.println("5.to Delete a Node");
			System.out.println("10. to Exit");
			System.out.println();
			option=sc.nextInt();
				switch(option){
				case 1:
			               System.out.println();
					 iwi.createList(3);
					System.out.println("list created");
					System.out.println();
					break;
				case 2:
                                        System.out.println();
					iwi.traverse();
					System.out.println("here is linked list");
					System.out.println();
					break;
				case 3:
					System.out.println();
					iwi.insert(4);
					System.out.println("node is added");
					System.out.println();
					break;
				case 4:
					 System.out.println("enter node position");
					int z=sc.nextInt();
					int y=sc.nextInt();
					iwi.lastnode(y,z);
					System.out.println("last node is added");
					break;
				case 5:
					System.out.println("which node you want to delete");
					int z=sc.nextInt();
					iwi.deletenode(y,z);
					System.out.println();
					break;
				case 10:
					System.exit(0);
				default:
					System.out.println("invalid command");
				}
		}
	}
}
