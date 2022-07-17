package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }
            String regexNotCorrectNumb = "[^0-9]";
            String inputOnlyNumb = input.replaceAll(regexNotCorrectNumb, "");

            String regexCorrectNumb = "[7]{1}[0-9]{10}";
            String regexCheckFirstNine = "[9]{1}[0-9]{10}";

            if (inputOnlyNumb.matches(regexCheckFirstNine) || inputOnlyNumb.length() < 10 || inputOnlyNumb.length() > 11) {
                System.out.println("Неверный формат номера");
                break;
            }
            if (inputOnlyNumb.length() == 10 && inputOnlyNumb.matches("[9]{1}[0-9]{9}")) {
                System.out.println("7" + inputOnlyNumb);
                break;
            }
            if (inputOnlyNumb.matches("[8]{1}[0-9]{10}")) {
                System.out.println(inputOnlyNumb.replace('8','7'));
                break;
        }
            System.out.println(inputOnlyNumb);

        }
    }
}
