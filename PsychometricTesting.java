import java.util.Arrays;

public class PsychometricTesting {
	public int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) throws Exception {
		if (lowerLimits.length != upperLimits.length)
			throw new Exception("Insufficient upper/lower limits, please verify the inputs");
		if (lowerLimits.length < 1)
			throw new Exception("Number of element in lower/upper limit should not be less than 1");
		if (lowerLimits.length > Math.pow(10, 5))
			throw new Exception("Number of element in lower/upper limit should not be greater that 1000000");
		int[] qualified = new int[lowerLimits.length];

		for (int i = 0; i < lowerLimits.length; i++) {
			int numberOfQualified = 0;
			// Validate Constraints
			if (lowerLimits[i] < 1)
				throw new Exception("Lower score limit cannot be lower than 1.");
			if (lowerLimits[i] > upperLimits[i])
				throw new Exception("Lower score limit should not be greater than upper score limit.");
			if (upperLimits[i] > Math.pow(10, 9))
				throw new Exception("Upper score limit cannot be greater than 10000000000");

			for (int score : scores) {
				if (score < 1 || score > Math.pow(10, 9))
					throw new Exception("Score is invalid");
				if (score >= lowerLimits[i] && score <= upperLimits[i]) {
					numberOfQualified++;
				}
			}
			System.out.println("numberOfQualified" + numberOfQualified);
			qualified[i] = numberOfQualified;
		}
		return qualified;
	}

	public static void main(String[] input) throws Exception {
		int scoresize = 0;
		int lowerlimitsize = 0;
		int upperlimitsize = 0;
		try {
			scoresize = Integer.parseInt(input[0]);
			lowerlimitsize = Integer.parseInt(input[scoresize + 1]);
			upperlimitsize = Integer.parseInt(input[scoresize + lowerlimitsize + 1 + 1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new Exception("Not enough values");
		}
		int[] intlnput = new int[input.length];
		if (scoresize + lowerlimitsize + upperlimitsize + 3 != input.length)
			throw new Exception("Not enough values");
		try {
			for (int i = 0; i < input.length; i++) {
				intlnput[i] = Integer.parseInt(input[i]);
			}
		} catch (NumberFormatException e) {
			throw new Exception("Invalid number present in the input, please verify");
		}
		int[] scores = Arrays.copyOfRange(intlnput, 1, scoresize + 1);
		int[] lowerlimits = Arrays.copyOfRange(intlnput, scoresize + 1 + 1, scoresize + lowerlimitsize + 1 + 1);
		int[] upperlimits = Arrays.copyOfRange(intlnput, scoresize + lowerlimitsize + 1 + 1 + 1,
				scoresize + lowerlimitsize + upperlimitsize + 1 + 1 + 1);
		PsychometricTesting testing = new PsychometricTesting();
		int[] jobOffers = testing.jobOffers(scores, lowerlimits, upperlimits);
	}


		
}
