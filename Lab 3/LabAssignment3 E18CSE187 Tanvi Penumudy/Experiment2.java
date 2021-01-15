package e18cse187;
import java.util.Scanner;
public class Question2 {
	
	static int [][] arr;
	
	public static void sort_columns() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=j+1;k<arr[i].length;k++) {
					if(arr[i][k]<arr[i][j]) {
						int temp=arr[i][j];
						arr[i][j]=arr[i][k];
						arr[i][k]=temp;
					}
				}
			}
		}
	}
	
	public static void sort_rows() {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=0;k<Math.min(arr[i].length,arr[j].length);k++) {
					if(arr[j][k]<arr[i][k]) {
						int[]temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						break;
					}
				}
			}
		}
	}
	
	public static void print() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give dimensions of the array(seperated by a space)");
		arr= new int[sc.nextInt()][sc.nextInt()];
		System.out.println("Give array row wise");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		sort_columns();
		sort_rows();
		print();
	}

}
