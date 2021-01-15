package LabAssignment2DS;
import java.util.Scanner;
import java.util.Random;
public class Question01_04_2{
    
    
   
     public static void main(String []args){
    	//Taking sample 5 entries with index 0,1,2,3,4
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        String[] name=new String[5];
        int[] id=new int[5];
        long[] salary=new long[5];
        String[] department=new String[5];
        String[] adress=new String[5];
        long[] contact=new long[5];
        String[] emailid=new String[5];
        int[] position=new int[5];
        int[] experience=new int[5];
        for(int i=0;i<=4;i++){
            String s=String.valueOf(i);
            name[i]="tanvi"+s;
            id[i]=i+50;
            int count=0;
            
            salary[i]=i*500000;
            department[i]="cse";
            adress[i]="bennett university";
            contact[i]=90200+i;
            emailid[i]="tanvi"+s+"@gmail.com";
            position[i]=i+5;
            experience[i]=i*10;}
      //Ques g)
        System.out.println("Question g");
        String[] name4=new String[6];
        int[] id4=new int[6];
        long[] salary4=new long[6];
        String[] department4=new String[6];
        String[] adress4=new String[6];
        long[] contact4=new long[6];
        String[] emailid4=new String[6];
        int[] position4=new int[6];
        int[] experience4=new int[6];
        for(int t=0;t<=5;t++){
            name4[t]=name[t];
             id4[t]=id[t];
             salary4[t]=salary[t];
             department4[t]=department[t];
             adress4[t]=adress[t];
             contact4[t]=contact[t];
             emailid4[t]=emailid[t];
             position4[t]=position[t];
             experience4[t]=experience[t];}
            name4[6]=sc.nextLine();
            id4[6]=sc.nextInt();
            int count=0;
            
            salary4[6]=sc.nextLong();
            department4[6]=sc.nextLine();
            adress4[6]=sc.nextLine();
            contact4[6]=sc.nextLong();
            emailid4[6]=sc.nextLine();
            position4[6]=sc.nextInt();
            experience4[6]=sc.nextInt();
      //Ques h)
        System.out.println("Question h");
        String[] name5=new String[6];
        int[] id5=new int[6];
        long[] salary5=new long[6];
        String[] department5=new String[6];
        String[] adress5=new String[6];
        long[] contact5=new long[6];
        String[] emailid5=new String[6];
        int[] position5=new int[6];
        int[] experience5=new int[6];
        for(int t=0;t<=5;t++){
             name5[t+1]=name[t];
             id5[t+1]=id[t];
             salary5[t+1]=salary[t];
             department5[t+1]=department[t];
             adress5[t+1]=adress[t];
             contact5[t+1]=contact[t];
             emailid5[t+1]=emailid[t];
             position5[t+1]=position[t];
             experience5[t+1]=experience[t];}
            name[0]=sc.nextLine();
            id[0]=sc.nextInt();
            int count=0;
            
            salary5[0]=sc.nextLong();
            department5[0]=sc.nextLine();
            adress5[0]=sc.nextLine();
            contact5[0]=sc.nextLong();
            emailid5[0]=sc.nextLine();
            position5[0]=sc.nextInt();
            experience5[0]=sc.nextInt();
        
      //Ques i)
        System.out.println("Question i");
        String[] name6=new String[6];
        int[] id6=new int[6];
        long[] salary6=new long[6];
        String[] department6=new String[6];
        String[] adress6=new String[6];
        long[] contact6=new long[6];
        String[] emailid6=new String[6];
        int[] position6=new int[6];
        int[] experience6=new int[6];
             name6[0]=name[0];
             id6[0]=id[0];
             salary6[0]=salary[0];
             department6[0]=department[0];
             adress6[0]=adress[0];
             contact6[0]=contact[0];
             emailid6[0]=emailid[0];
             position6[0]=position[0];
             experience6[0]=experience[0];
        for(int t=1;t<=5;t++){
            name6[t+1]=name[t];
             id6[t+1]=id[t];
             salary6[t+1]=salary[t];
             department6[t+1]=department[t];
             adress6[t+1]=adress[t];
             contact6[t+1]=contact[t];
             emailid6[t+1]=emailid[t];
             position6[t+1]=position[t];
             experience6[t+1]=experience[t];}
            name6[0]=sc.nextLine();
            id6[0]=sc.nextInt();
            count=0;
            
            salary6[0]=sc.nextLong();
            department6[0]=sc.nextLine();
            adress6[0]=sc.nextLine();
            contact6[0]=sc.nextLong();
            emailid6[0]=sc.nextLine();
            position6[0]=sc.nextInt();
            experience6[0]=sc.nextInt();
     }
}
