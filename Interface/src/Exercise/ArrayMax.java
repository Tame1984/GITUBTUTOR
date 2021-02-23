package Exercise;

public class ArrayMax {

	public static void main(String[] args) {
		int[] a = new int[] { 20, 30, 50, 4, 71, 100};
		int max1 = a[0];
		int max2 = a[1];
		
		for(int i = 1; i < a.length;i++)
		{
			if(a[i] > max1)
			{
				
				max1 = a[i];
			}
			else if(a[i]<max1 && a[i]>max2)
			{   
				
				max2 = a[i];
			}
		}
		
		System.out.println("The Given Array Element is:");
		for(int i = 0; i < a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("From The Array Element Largest Number is:" + max1);
		System.out.println("From The Array Element the second Largest Number is:" + max2);
	}

}
