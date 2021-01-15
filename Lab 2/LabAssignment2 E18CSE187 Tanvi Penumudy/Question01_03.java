package LabAssignment2DS;
import java.util.Scanner;
import java.util.Random;
public class Question01_03{
    
    
   
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        String[] name=new String[30];
        int[] id=new int[30];
        long[] salary=new long[30];
        String[] department=new String[30];
        String[] adress=new String[30];
        long[] contact=new long[30];
        String [] emailid=new String[30];
        int[] position=new int[30];
        int[] experience=new int[30];
        for(int i=0;i<=29;i++){
            String s=String.valueOf(i);
            name[i]="tanvi"+s;
            id[i]=i+50;
            //int count=0;
            salary[i]=i*500000;
            department[i]="cse";
            adress[i]="bennett university";
            contact[i]=902000+i;
            emailid[i]="tanvi"+s+"@gmail.com";
            position[i]=i+5;
            experience[i]=i*10;
        }
        for(int j=0;j<=29;j++){
        System.out.println(name[j]+id[j]+salary[j]+department[j]+adress[j]+contact[j]+emailid[j]+position[j]+experience[j]);
     }
     }
}
         
