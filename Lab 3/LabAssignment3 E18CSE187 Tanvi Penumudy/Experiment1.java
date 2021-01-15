package e18cse187;

import java.util.Scanner;
class player {
	String name;
	int [][] arr=new int[5][2];
	int [] weights={1,2,4,6,8};
	int total;
	player(String name,int[] runs){
		this.name=name;
		for(int i=0;i<arr.length;i++){
			arr[i][0]=runs[i];
			arr[i][1]=weights[i]*runs[i];
		}
		this.total=this.totalScore();
	}
	
	public void printData(){
			System.out.println("1\t2\t3\t4\t6\t");
			System.out.println(arr[0][0]+arr[1][0]+
					arr[2][0]+arr[3][0]+arr[4][0]);
	}
	
	public int totalScore(){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i][1];
		}
		return sum;
	}
}

public class CricketGame {

	private static player [] high_scores=new player[5];
	
	public static void print(){
		for(int i=0;i<high_scores.length;i++){
			//System.out.println("PLAYER "+(i+1));
			if(high_scores[i]==null) {
				break;
			}
			System.out.println(high_scores[i].name+":"+high_scores[i].total);
		}
	}
	
	public static void insert(player p, int pos){
		player temp=p;
		for(int i=pos;i<high_scores.length;i++){
			if(high_scores[i]==null){
				high_scores[i]=temp;
				break;
			}
			player temp1=high_scores[i];
			high_scores[i]=temp;
			temp=temp1;
		}
	}
	
	public static void remove(String name){
		boolean flag=false;
		for(int i=0;i<high_scores.length;i++){
			if(high_scores[i].name==name){
				flag=true;
			}
			if(flag){
				high_scores[i]=high_scores[i+1];
			}
		}
		high_scores[4]=null;
	}
	
	public static boolean add(player p){
		for(int i=0;i<high_scores.length;i++){
			if(high_scores[i]==null || p.total>high_scores[i].total){
				insert(p,i);
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("0.Display scoreboard");
		System.out.println("1.Add");
		System.out.println("2.Remove");
		System.out.println("3.Quit");
		System.out.println("Please make your choice");
		int choice=sc.nextInt();
		do{
			sc.nextLine();
			switch(choice) {
				case 0:
					print();
					break;
				case 1:
					System.out.println("Player name");
					String name=sc.nextLine();
					int[]runs=new int[5];
					System.out.println("Number of singles?");
					runs[0]=sc.nextInt();
					System.out.println("Number of 2's?");
					runs[1]=sc.nextInt();
					System.out.println("Number of 3's?");
					runs[2]=sc.nextInt();
					System.out.println("Number of fours?");
					runs[3]=sc.nextInt();
					System.out.println("Number of sixes?");
					runs[4]=sc.nextInt();
					player p=new player(name,runs);
					add(p);
					break;
				case 2:
					System.out.println("Which player?");
					remove(sc.nextLine());
					break;
			}
			System.out.println("Please make your choice");
			choice=sc.nextInt();
		}while(choice!=3);
	}
}
