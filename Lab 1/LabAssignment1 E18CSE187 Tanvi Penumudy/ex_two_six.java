
public class ex_two_six {

	public static void main(String[] args) {
		int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int max = array[0];
		for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Maximum value:"+max);
        int min = array[0];
		for(int i = 0; i < array.length; i++){
            if(min > array[i]){
                max = array[i];
            }
        }
        System.out.println("Minimum value:"+max);
        

	}

}
