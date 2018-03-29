import java.util.Arrays;

public class BalancedOrNot {

	public int[] balancedOrNot(String[] expression, int[] maxReplacements) {
		int[] balancedOrNot = new int[expression.length];
		for (int i = 0; i < expression.length; i++) {
			String formatted = expression[i];
			do {
				formatted = formatted.replaceAll("<>", "");
				if (!formatted.contains("<>"))
					;
				break;
			} while (true);
			System.out.println("formatted .." + formatted);
			if (maxReplacements[i] >= formatted.length()) {
				balancedOrNot[i] = 1;
				System.out.println(formatted + " " + 1);
			} else {
				System.out.println(formatted + " " + 0);
				balancedOrNot[i] = 0;
			}
		}
		return balancedOrNot;
	}

	public static void main(String[] input) throws Exception {
		int expressionssize = 0;
		int maximumValsize = 0;
		try {
			expressionssize = Integer.parseInt(input[0]);
			maximumValsize = Integer.parseInt(input[expressionssize + 1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new Exception("Not enough values");
		}

		int[] intMaxvalues = new int[maximumValsize];
		String[] expressions = Arrays.copyOfRange(input, 1, expressionssize + 1);
		String[] maxvalues = Arrays.copyOfRange(input, expressionssize + 1 + 1,
				expressionssize + maximumValsize + 1 + 1);
		try {
			for (int i = 0; i < maximumValsize; i++) {
				intMaxvalues[i] = Integer.parseInt(maxvalues[i]);
			}
		} catch (NumberFormatException e) {
			throw new Exception("Invalid number present in input, please verify.");
		}
		if (expressions.length > maxvalues.length)
			throw new Exception("Not all the expressions have maximum values");
		if (expressions.length < maxvalues.length)
			throw new Exception("Too many maximum values");
		BalancedOrNot testing = new BalancedOrNot();
		int[] balancedOrNot = testing.balancedOrNot(expressions, intMaxvalues);
		System.out.println("balancedOrNot::" + balancedOrNot);
	}

}
