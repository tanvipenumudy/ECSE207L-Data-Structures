package LabAssignment2DS;
import java.util.Scanner;
import java.util.Random;
public class Question01_04_1{
    
    
   
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
    //Ques a)
        System.out.println("Question a");
            //int x=id[3];
            System.out.println(name[4]);
    //Ques b)        
            System.out.println("Question b");
			System.out.println(name[0]+id[0]+salary[0]+department[0]+adress[0]+contact[0]+emailid[0]+position[0]+experience[0]);
    //Ques c)
			System.out.println("Question c");
			System.out.println(name[4]+id[4]+salary[4]+department[4]+adress[4]+contact[4]+emailid[4]+position[4]+experience[4]);
    //Ques d)        
			System.out.println("Question d");
			String[] name1=new String[5];
            int[] id1=new int[5];
            long[] salary1=new long[5];
            String[] department1=new String[5];
            String[] adress1=new String[5];
            long[] contact1=new long[5];
            String[] emailid1=new String[5];
            int[] position1=new int[5];
            int[] experience1=new int[5];
            for(int j=0;j<4;j++){
                 name1[j+1]=name[j];
                 id1[j+1]=id[j];
                 salary1[j+1]=salary[j];
                 department1[j+1]=department[j];
                 adress1[j+1]=adress[j];
                 contact1[j+1]=contact[j];
                 emailid1[j+1]=emailid[j];
                 position1[j+1]=position[j];
                 experience1[j+1]=experience[j];}
          for(int z=0;z<=4;z++){
                 System.out.println(name1[z]+id1[z]+salary1[z]+department1[z]+adress1[z]+contact1[z]+emailid1[z]+position1[z]+experience1[z]);}
    //Ques e)         
          System.out.println("Question e");
			String[] name2=new String[5];
            int[] id2=new int[5];
            long[] salary2=new long[5];
            String[] department2=new String[5];
            String[] adress2=new String[5];
            long[] contact2=new long[5];
            String[] emailid2=new String[5];
            int[] position2=new int[5];
            int[] experience2=new int[5];
            for(int j4=0;j4<4;j4++){
                 name2[j4]=name[j4+1];
                 id2[j4]=id[j4+1];
                 salary2[j4]=salary[j4+1];
                 department2[j4]=department[j4+1];
                 adress2[j4]=adress[j4+1];
                 contact2[j4]=contact[j4+1];
                 emailid2[j4]=emailid[j4+1];
                 position2[j4]=position[j4+1];
                 experience2[j4]=experience[j4+1];}
          for(int z1=0;z1<=4;z1++){
                 System.out.println(name2[z1]+id2[z1]+salary2[z1]+department2[z1]+adress2[z1]+contact2[z1]+emailid2[z1]+position2[z1]+experience2[z1]);  
          }
          //Ques f)
          System.out.println("Question f");
          String[] name3=new String[5];
          int[] id3=new int[5];
          long[] salary3=new long[5];
          String[] department3=new String[5];
          String[] adress3=new String[5];
          long[] contact3=new long[5];
          String[] emailid3=new String[5];
          int[] position3=new int[5];
          int[] experience3=new int[5];
          for(int j1=0;j1<=2;j1++){
                name3[j1]=name[j1];
               id3[j1]=id[j1];
               salary3[j1]=salary[j1];
               department3[j1]=department[j1];
               adress3[j1]=adress[j1];
               contact3[j1]=contact[j1];
               emailid3[j1]=emailid[j1];
               position3[j1]=position[j1];
               experience3[j1]=experience[j1];}
         for(int k=3;k<4;k++){
               name3[k]=name[k+1];
               id3[k]=id[k+1];
               salary3[k]=salary[k+1];
               department3[k]=department[k+1];
               adress3[k]=adress[k+1];
               contact3[k]=contact[k+1];
               emailid3[k]=emailid[k+1];
               position3[k]=position[k+1];
               experience3[k]=experience[k+1];}
        for(int z2=0;z2<4;z2++){
               System.out.println(name3[z2]+id3[z2]+salary3[z2]+department3[z2]+adress3[z2]+contact3[z2]+emailid3[z2]+position3[z2]+experience3[z2]);}

         
            }

}


