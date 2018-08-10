package stringCaculator;

import java.util.regex.Pattern;

public class AddCaculation {

  public boolean isExistDelimeter(String input) {
    if(input.contains(":") || input.contains(","))
      return true;
    return false;
  }

  public void validateDelimeterFormat(String input){
    if(!Pattern.matches("(\\d+[,\\:])*\\d+",input)) {
      throw new RuntimeException();
    }
  }

  public void validateNotDigit(String notDigit) {
    if(Pattern.matches("(\\d[,\\:])*\\d",notDigit)) {

    }
    Integer.parseInt(notDigit);
  }

  public int sum(String[] input) {
	  int sum = 0;
	 for(String arg : input) {
		sum += Integer.parseInt(arg); 
	 }
    return sum;
  }

	public boolean isBasicParseNumber(String[] args) {
		Integer parseInt;
		for(String arg: args) {
			try {
				parseInt = Integer.parseInt(arg);				
			}catch (NumberFormatException e) {
				throw new NumberFormatException();
			}
		}
		return true;
	}
}
