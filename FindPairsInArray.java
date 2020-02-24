public static int FindPairsInArray(int[] input)
	{
		HashMap<Integer,Integer> dict = new HashMap<Integer,Integer>();
		int count = 0;
		
		for(int i = 0; i< input.length; i++)
		{
			if(dict.containsKey(input[i]))
			{
				dict.put(input[i], dict.get(input[i])+1);
			}
			else 
			{
				dict.put(input[i], 1);
			}
		}
		
        for(Map.Entry<Integer, Integer> entry : dict.entrySet())
		{
			count += entry.getValue() /2;
		}
		
		return count;
	}