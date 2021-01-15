package LabAssign6ds;
import java.util.Scanner;

public class ques4 {
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			LinkedList list=new LinkedList();
			int y=1;
			while(y==1) {
				System.out.print("Enter Number : ");
				int x=in.nextInt();
				list.insert(x);
				System.out.println("Do you want to add another number?\n1.Yes\n2.No");
				y=in.nextInt();
			}
			System.out.print("\nInitial:");
			list.printlist();
			list.removeleft(list);
			System.out.println();
			list.printlist();
		}

	}


