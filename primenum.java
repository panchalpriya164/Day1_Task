public class primenum {
	public static void main(String[] args) {
		int j,count;
		System.out.println("Prime Numbers between 1 to 100 : ");
		for(int i=2;i<=100;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
				System.out.print(i+" ");
		}
	}
}
