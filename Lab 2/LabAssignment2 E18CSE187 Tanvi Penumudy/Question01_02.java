package LabAssignment2DS;
import java.util.Scanner;
import java.util.Random;
public class Question01_02{
    
    
   
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        String[] name=new String[50];
        int[] id=new int[50];
        long[] salary=new long[50];
        String[] department=new String[50];
        String[] adress=new String[50];
        long[] contact=new long[50];
        String[] emailid=new String[50];
        int[] position=new int[50];
        int[] experience=new int[50];
        for(int i=0;i<=49;i++){
            String s=String.valueOf(i);
            name[i]="tanvi"+s;
            id[i]=i+1000;
            int count=0;
            salary[i]=i*50000;
            department[i]="cse";
            adress[i]="bennett university";
            contact[i]=9490+i;
            emailid[i]="v"+s+"@gmail.com";
            position[i]=i+5;
            experience[i]=i*10;
        }
        for(int j=0;j<=49;j++){
        System.out.println(name[j]+id[j]+salary[j]+department[j]+adress[j]+contact[j]+emailid[j]+position[j]+experience[j]);
     }
         
     }
}