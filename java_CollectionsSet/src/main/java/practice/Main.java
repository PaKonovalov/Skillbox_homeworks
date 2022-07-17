package practice;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String patternOfEmail = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            //TODO: write code here

            String regexEmail = "[a-zA-Z]+[0-9]*@.+";
            Pattern patternEmail = Pattern.compile(regexEmail);
            Matcher matcherEmail = patternEmail.matcher(input);
            while (matcherEmail.find()) {
                int start = matcherEmail.start();
                int end = matcherEmail.end();
                patternOfEmail = input.substring(start, end).toLowerCase();
            }
            String endOfEmail = "";
            int start = patternOfEmail.lastIndexOf(endOfEmail);
            int end = patternOfEmail.lastIndexOf('.', start);
            String domainName = patternOfEmail.substring(end + 1, start);
            //System.out.println(domainName);

            if (domainName.contains("ru") || domainName.contains("com")) {

                System.out.println(patternOfEmail);
            }
            else {
                System.out.println(WRONG_EMAIL_ANSWER);
                break;
            }
        }
    }
}
