package stringCaculator;

import java.util.regex.Pattern;

public class AddCaculation {

  public boolean isExistDelimeter(String input) {
    if(input.contains(":") || input.contains(","))
      return true;
    return false;
  }

  public void validateDelimeterFormat(String input){
    if(!Pattern.matches("(\\d[,\\:])*\\d",input)) {
      throw new RuntimeException();
    }
  }

  public void validateNotDigit(String notDigit) {
    if(Pattern.matches("(\\d[,\\:])*\\d",notDigit)) {

    }
    Integer.parseInt(notDigit);
  }
}
