
import java.util.*;

public class HW7_3{
	private final static int digits = 5;
	private static Scanner input;

	public static void main(String args[]) throws OutOfRange{
		input = new Scanner(System.in);
		
		// Array of person's ticket.
		ArrayList<Integer> personLotteryNumbers = new ArrayList<>();
		Lottery lottery = new Lottery();
		System.out.println("Enter 5 numbers(0-9): ");
		
		// Input the person's lottery ticket.
		for (int i = 0; i < digits; i++) {
			int number = input.nextInt();
			if(number<0 || number>9)
				throw new OutOfRange();
			personLotteryNumbers.add(number);
		}
		
		// Compare the lottery ticket with person's ticket.
		int equalDigits = lottery.compareTo(personLotteryNumbers);
		System.out.println("Prize Lottery Number is: " + lottery.get_lotteryNumbers());
		System.out.println("Your Lottery Number is: " + personLotteryNumbers);
		
		// Print the message.
		if (equalDigits == digits) {
			System.out.println("Congrats!! You have won Rs 1 CRORE.");
		} else {
			System.out.println("Number of digits matched: " + equalDigits);
		}
	}
}

class OutOfRange extends Exception {
	public String toString() {
		return "Out of Range Exception";
	}
}