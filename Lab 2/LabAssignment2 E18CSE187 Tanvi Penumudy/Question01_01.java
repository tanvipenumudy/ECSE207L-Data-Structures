package LabAssignment2DS;
import java.util.Scanner;

public class Question01_01{
    
    
	   public static void main(String []args){
	   //The values in the array should be entered in the Scanner Class in the order of the initialisation of variables for each person
       System.out.println("Enter the required attributes for the employee name:");
	   Scanner sc=new Scanner(System.in);
       String[] name=new String[30];
       int[] id=new int[30];
       long[] salary=new long[30];
       String[] department=new String[30];
       String[] adress=new String[30];
       long[] contact=new long[30];
       String[] emailid=new String[30];
       int[] position=new int[30];
       int[] experience=new int[30];
       for(int i=0;i<=29;i++){
           name[i]=sc.next();
           id[i]=sc.nextInt();
           int count=0;
           while(id[i]!=0){
              id[i]=id[i]/10;
              count=count+1;}
           if(count>4){
           id[i]=sc.nextInt();}
           
           salary[i]=sc.nextLong();
           department[i]=sc.nextLine();
           adress[i]=sc.nextLine();
           contact[i]=sc.nextLong();
           emailid[i]=sc.nextLine();
           position[i]=sc.nextInt();
           experience[i]=sc.nextInt();
       }
       
    }
}
