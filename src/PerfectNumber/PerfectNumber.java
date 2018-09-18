package PerfectNumber;
import java.util.HashSet;
import java.util.Set;


public class PerfectNumber 
{
	public enum STATE
	{
		ABUNDANT,
		DEFICIENT,
		PERFECT
	}
	
	public static STATE process(int n)
	{
		int sum = 0;
		for(int i = 1;i<n;i++)
		{
			if(n % i == 0)
			{
				sum += i;
			}
		}
		
		if(sum == n)
			return STATE.PERFECT;
		else if(sum < n)
			return STATE.DEFICIENT;
		else
			return STATE.ABUNDANT;
			
	}
	
	public static Set<Integer> divisors(int n)
	{
		Set<Integer> returnSet = new HashSet<Integer>();
		for(int i = 1;i <= n; i++)
		{
			if(n % i == 0)
				returnSet.add(i);
		}
		return returnSet;
	}
}
