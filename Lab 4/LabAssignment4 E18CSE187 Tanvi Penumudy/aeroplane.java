package E18CSE187;
import java.util.Scanner;
/* "I have done this assignment on my own. 
 * I have not copied any code from another student or any online source. 
 * I understand if my code is found similar to somebody else's code,
 * my case can be sent to the Disciplinary committee of the institute for appropriate action." */
public class aeroplane {
			Node head;
			String name;
			aeroplane()
			{
				
			}
			aeroplane(String n)
			{
				name=n;
			}
			static class Node
			{
				String data;
				Node next;
				Node(String d)
				{
					data=d;
					next=null;
				}
			}
			static aeroplane insert(aeroplane l,String d)
			{
				Node new_node=new Node(d);
				if(l.head==null)
					l.head=new_node;
				else
				{
					Node last=l.head;
					while(last.next!=null)
						last=last.next;
					last.next=new_node;
				}
				return l;
			}
			static void printlist(aeroplane l)
			{
				Node curr=l.head;
				if(curr==null)
					System.out.println("No passenger detected");
				while(curr!=null)
				{
					System.out.print(curr.data+" ");
					curr=curr.next;
				}
				System.out.println();
			}
			static aeroplane delete(aeroplane l,String d)
			{
				Node prev=l.head;
				Node curr=prev.next;
				if(prev.data.equals(d))
					l.head=curr;
				else
				{
					while(curr.next!=null)
					{
					if(curr.data.equals(d))
						prev.next=curr.next;
					prev=curr;
					curr=curr.next;
					}
				}
				return l;
			}
			static void lengthoflist(aeroplane l)
			{
				Node curr=l.head;
				int c=0;
				if(curr==null)
					System.out.println(0);
				while(curr!=null)
				{
					curr=curr.next;
					c++;
				}
				System.out.println(c);
			}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Number of Aeroplanes:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.hasNextLine();
	aeroplane l[]=new aeroplane[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter Name of Aeroplane "+(i+1)+":");
		String name=sc.next();
		aeroplane ob=new aeroplane(name);
		l[i]=ob;
	}
	int op;
	do
	{
		System.out.println("Your Options:");
		System.out.println("1.Book Reservation(Insertion):");
		System.out.println("2.Cancel Reservation(Deletion):");
		System.out.println("3.Display the Passenger's Names and Number(Display):");
		System.out.println("4.Quit!");
		op=sc.nextInt();
		String name;
		aeroplane ob=new aeroplane();
		switch(op)
		{
		
		case 1:
			System.out.println("Enter Aeroplane Name:");
			name=sc.next();
			for(int i=0;i<l.length;i++)
			{
				if(l[i].name.equals(name))
					ob=l[i];
			}
			System.out.println("Enter the Passenger number to be booked:");
			int no=sc.nextInt();
			sc.nextLine();
			for(int i=0;i<no;i++)
			{
				System.out.println("Enter Passenger Name:");
				name=sc.nextLine();
				aeroplane.insert(ob,name);
			}
			break;
		case 2:
			System.out.println("Enter Aeroplane Name:");
			name=sc.next();
			for(int i=0;i<l.length;i++)
			{
				if(l[i].name.equals(name))
				{
					ob=l[i];
					break;
				}
			}
			System.out.println("Enter Number of Passengers to be Cancelled:");
			no=sc.nextInt();
			sc.nextLine();
			for(int i=0;i<no;i++)
			{
				System.out.println("Enter Name of Passenger:");
				name=sc.nextLine();
				aeroplane.delete(ob,name);
			}
			break;
		case 3:
			System.out.println("Enter Aeroplane Name:");
			name=sc.next();
			for(int i=0;i<l.length;i++)
			{
				if(l[i].name.equals(name)) {
					ob=l[i];
					break;
				}
			}
			aeroplane.printlist(ob);
			aeroplane.lengthoflist(ob);
			break;
		case 4:
			break;
		}
	}while(op!=4);
	
}

}
