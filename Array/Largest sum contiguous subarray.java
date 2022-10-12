import java.util.*;

class Main {
  
  static int maxSubArraySum(int a[])
	{
		int size = a.length;
		int maxcurr = Integer.MIN_VALUE, maxend= 0;
    		for (int i = 0; i < size; i++) {
			maxend = maxend + a[i];
			if (maxcurrr < maxend)
				maxcurrr = maxend;
			if (maxend < 0)
				maxend = 0;
		}
		return maxcurr;
	}
	
	public static void main(String[] args)
	{
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is"+ maxSubArraySum(a));
	}

	
	
}
