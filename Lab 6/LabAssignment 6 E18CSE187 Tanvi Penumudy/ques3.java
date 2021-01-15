package LabAssign6ds;
import java.util.Scanner;
public class ques3{
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			LinkedList A=new LinkedList();
			int y=1;
			System.out.println("Linked List-1:");
			while(y==1) {
				System.out.print("Enter Number: ");
				int x=in.nextInt();
				A.insert(x);
				System.out.println("Do you want to add another number?\\n1.Yes\\n2.No?");
				y=in.nextInt();
			}
			LinkedList B=new LinkedList();
			y=1;
			System.out.println("Linked List-2:");
			while(y==1) {
				System.out.print("Enter Number : ");
				int x=in.nextInt();
				B.insert(x);
				System.out.println("Do you want to add another number?\n1.Yes\n2.No");
				y=in.nextInt();
			}
			System.out.print("\nLL-1 ");
			A.printlist();
			System.out.print("\nLL-2 ");
			B.printlist();
			System.out.println();
			A.identical(A, B);
		}

	}

