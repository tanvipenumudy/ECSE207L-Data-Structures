package LabAssignment2DS;
import java.util.Scanner;

public class Question02{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length :");
		int x=sc.nextInt();
		int ratings[]=new int[x];
		System.out.println("Ratings:");
		for(int i=0;i<ratings.length;i++){
			ratings[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=ratings.length-1;i>0;i--){
			if(ratings[i]!=0){
				sum=sum+ratings[i];
			}
			else if(ratings[i]==0 && (i-1!=0)){
				i=i-1;
			}
		}
		System.out.println("Sum of Ratings:"+sum);

	}

}
