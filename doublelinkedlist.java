import java.util.Scanner;
class	DoubleLinkedList{
        public static void main(String[]args){
		IntLinkedList dps =new IntLinkedList();
                Scanner sc = new Scanner(System.in);
		int option=0;
                while(true){
                        System.out.println("1. To create LinkedList");
                        System.out.println("2.To traverse LinkedList");
                        System.out.println("3. To Insert Node");
			System.out.println("4. To Delete any Node");
			System.out.println("10. To Exit");
                        System.out.println();
                        option=sc.nextInt();
                                switch(option){
                                case 1:
					System.out.println("enter how many nodes to be created");
					int x=sc.nextInt();
					dps.createList(x);
                                       System.out.println();
                                        System.out.println("list created");
                                        System.out.println();
                                        break;
                                case 2:
                                        System.out.println();
                                        System.out.println("here is linked list");
					dps.traverse();
                                        System.out.println();
                                        break;
				case 3:
					System.out.println();
					System.out.println("enter node to insert");
					int z=sc.nextInt();
					System.out.println("enter the position to insert node");
					int y=sc.nextInt();
					dps.insert(z,y);
					System.out.println("Node inserted succesfully");
					System.out.println();
					break;
				case 4:
					System.out.println();
					System.out.println("Enter node position to delete");
					int t=sc.nextInt();
					dps.deleteNode(t);
					System.out.println();
					System.out.println("Node Deleted Succesfully");
					break;
                               case 10:
					System.exit(0);
				default:
					System.out.println("invalid option choosen");
				}
		}
	}
}
