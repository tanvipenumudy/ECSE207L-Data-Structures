
public class ex_two_ten {

	public static void main(String[] args) {
		int num,rem,limit=1000, sum = 0;
		System.out.print("Armstrong numbers:");
		for (int i = 1; i >0 ; i++)
		{
			num = i;
			while (num > 0)
			{
				rem = num % 10;
				sum = sum + (rem*rem*rem);
				num = num / 10;
			}
	 
			if (sum == i)
			{
				System.out.print(i + " ");
			}
			sum = 0;
		}

	}

}

	


