
import java.util.*;

class Lottery {
	private ArrayList<Integer>lotteryNumbers;
	private int digits = 5;
	
	// Constructor to initialize the Lottery Ticket.
	public Lottery() {
		lotteryNumbers = new ArrayList<>();
		Random rnd = new Random();
		for (int i = 0; i < digits; i++) {
			lotteryNumbers.add(rnd.nextInt(10));
		}
	}

	// Compare function to compare lottery ticket and person's ticket.
	public int compareTo(ArrayList<Integer>personLotteryNumbers) {
		int equalDigits = 0;
		for (int i = 0; i < digits; i++) {
			if (lotteryNumbers.get(i) == personLotteryNumbers.get(i))
				equalDigits++;
		}
		return equalDigits;
	}

	// getter function for lottery ticket.
	public ArrayList<Integer> get_lotteryNumbers() {
		return lotteryNumbers;
	}
}