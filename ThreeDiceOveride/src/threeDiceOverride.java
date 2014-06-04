import java.util.Scanner;
public class threeDiceOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
	TripleDice Tripledice = new TripleDice();	
	
	Scanner input = new Scanner (System.in);
	
	int dices = input.nextInt();
	
	System.out.printf("Type in the number of times you want to be rolled.\n");
	
	int bounces = input.nextInt();
	
	System.out.printf("%d dice have been rolled.\n", dices);
	
	int D = Tripledice.Throw(dices, bounces);
	
	int avg = (D/(dices))/(bounces);
	
	System.out.printf("They have an average of %d", avg);	
	
	}
}

	