using System.Collections.Generic;
using System;

public class Program
{
	public static void Main()
	{
		int[] input = new int[]{10,10,10,20,0,0};
		Console.WriteLine(FindPairsInArray(input));
		
	}
	
	public static int FindPairsInArray(int[] input)
	{
		var dict = new Dictionary<int,int>();
		var count = 0;
		
		for(int i = 0; i< input.Length; i++)
		{
			if(dict.ContainsKey(input[i]))
			{
				dict[input[i]] += 1;
			}
			else 
			{
				dict.Add(input[i], 1);
			}
		}
		
		foreach(var entry in dict)
		{
			count += entry.Value /2;
		}
		
		return count;
	}
}
