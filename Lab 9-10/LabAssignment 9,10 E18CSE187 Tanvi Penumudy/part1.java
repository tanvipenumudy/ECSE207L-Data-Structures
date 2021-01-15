package E18CSE187lab9;
import java.util.Scanner;
public class part1 {

	public static void main(String[] args) {
		
		Tree tree1 = new Tree();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1:Insert");
		System.out.println("2:Print");
		System.out.println("3:Exit");
		System.out.println("Enter Number:");
		String command = scan.nextLine();
		while(command!="3") {
			switch(command) {
			
			case "1":
				System.out.println("Enter Customer Name: ");
				String name = scan.nextLine();
				System.out.println("Enter Age: ");
				tree1.insert(name, scan.nextInt());
				scan.nextLine();
				break;
				
			case "2":
				if(tree1.root == null) {
					System.out.println("Binary Search Tree is Empty");
				}
				
				else {
				System.out.println("Inorder Traversal: ");
				tree1.inorder();
				}
				
				break;
			}
			System.out.println("Enter Number: ");
			command = scan.nextLine();
		}
		
	scan.close();	
		
	}

}