package stringCaculator;

import java.util.regex.Pattern;

public class AddCaculation {

	public boolean isExistDelimeter(String input) {
		if (input.contains(":") || input.contains(","))
			return true;
		return false;
	}

	public void validateDelimeterFormat(String input) {
		if (!Pattern.matches("(\\d+[,\\:])*\\d+", input)) {
			throw new RuntimeException();
		}
	}

	public void validateNotDigit(String notDigit) {
		if (Pattern.matches("(\\d[,\\:])*\\d", notDigit)) {

		}
		Integer.parseInt(notDigit);
	}

	public int sum(String[] input) {
		int sum = 0;
		for (String arg : input) {
			sum += Integer.parseInt(arg);
		}
		return sum;
	}

	public int[] isBasicParseNumber(String inputStr) {
		String[] splitStr = null;
		if (Pattern.matches("(\\d+[,\\:])*\\d+", inputStr)) {
			if (inputStr.contains(":")) {
				splitStr = inputStr.split(":");
			} else if (inputStr.contains(",")) {
				splitStr = inputStr.split(",");
			}
		}

		int[] result = new int[splitStr.length];
		for (int idx = 0; idx < splitStr.length; idx++)
			result[idx] = Integer.parseInt(splitStr[idx]);

		return result;
	}
}
