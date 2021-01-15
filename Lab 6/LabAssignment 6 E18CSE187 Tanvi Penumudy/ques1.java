package LabAssign6ds;
import java.util.Scanner;

public class ques1 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		LinkedList list=new LinkedList();
		int y=1;
		while(y==1) {
			System.out.print("Enter Number: ");
			int x=in.nextInt();
			list.insert(x);
			System.out.println("Do you want to add anpther number\n1.Yes\n2.No");
			y=in.nextInt();
		}
		System.out.print("\nInitial List:");
		list.printlist();
		list.move();
		System.out.print("\nMoved List:");
		list.printlist();
	}
}



