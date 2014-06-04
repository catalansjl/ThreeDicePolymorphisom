public class TripleDice extends Dice {
	
	public int Throw(int dices, int bounces) 
	{	
		int total = 0;
		for (int j = bounces; j > 0; j--)
		{				
			for (int c = dices; c  > 0; c--)
			{					
				int d = (int) (1 + (Math.random() * 6));
				System.out.printf("Dice # %d is % d\n", c, d);
				total += d;
			}	
		}
		System.out.printf("Total %s\n", total);     //here is happening the overriding
			return total;
		}
}


	
	


