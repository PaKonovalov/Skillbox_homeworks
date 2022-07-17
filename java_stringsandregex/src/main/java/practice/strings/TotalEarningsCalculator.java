package practice.strings;
import static java.lang.System.*;
public class TotalEarningsCalculator {

  public static void main(String[] args) {
    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    int sum = 0;
    for (int i = text.length(); i > 0; i--) {
      i = text.lastIndexOf("руб", i);
      if (i < 0) {
        break;
      }
      int start = text.lastIndexOf(" ", i - 2);
      sum += Integer.parseInt(text.substring(start, i).trim());
    }
    out.println(sum);
    //TODO: напишите ваш код, результат вывести в консоль
  }
}
//        if (i == text.indexOf(" ")) {
//        int start = text.lastIndexOf(" ", end - 1);
//        String subStr = text.substring(start + 1, end);
//        int pars = Integer.parseInt(subStr);
//        sum += pars;
//        out.println(sum);