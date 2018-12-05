
public class PhraseOMatic {
	public static void main(String[] args) {
		
		// (1) making three lists of words
		String[] wordListOne = {"fun", "garbage collectable", "throws", "fresh",
			"sick", "gorgeous", "object-oriented", "practical", "impatient", "strong",
			"dark", "prolific"};
		
		String[] wordListTwo = {"casual", "pain in the ass", "credible", "forgiving",
				"lovely", "crucial", "modern", "self-driven", "functional", "focused",
				"cooperative", "accelerated", "legit"};
		
		String[] wordListThree = {"legacy", "opinion", "fridge", "leg", "thought",
				"horizon", "operation", "constitution", "algorithm", "tooth"};
		// (2) getting the number of words in each list
		int firstListLength = wordListOne.length;
		int secondListLength = wordListTwo.length;
		int thirdListLength = wordListThree.length;
		
		//generating three random numbers
		
		int numOne = (int) (Math.random() * firstListLength);
		int numTwo = (int) (Math.random() * secondListLength);
		int numThree = (int) (Math.random() * thirdListLength);
		
		
		String phrase = wordListOne[numOne] + " " + wordListTwo[numTwo] + " " +
		wordListThree[numThree];
		
		System.out.println("What we need is a " + phrase);
		
	}

}
