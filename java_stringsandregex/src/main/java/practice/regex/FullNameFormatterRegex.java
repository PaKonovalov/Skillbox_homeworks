package practice.regex;

import java.util.Scanner;

public class FullNameFormatterRegex {

    public static void main(String[] args) {

        int spaceCount = 0;
        boolean error = false;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }
            for (int i = 0; i < input.length(); i++) {
                char symbol = input.charAt(i);
                if (symbol == ' ') {
                    spaceCount++;
                    if (spaceCount > 2) {
                        error = true;
                        break;
                    }
                } else if (symbol == '-') {
                    continue;
                } else if (Character.isDigit(symbol) || Character.UnicodeBlock.of(symbol) != Character.UnicodeBlock.CYRILLIC) {
                    error = true;
                    break;
                }
            }
            if (spaceCount < 2 || error) {
                System.out.println("Введенная строка не является ФИО");
                return;
            }
            String[] words = input.split(" ");
            for (int i = 0; i < words.length; i++) {
                String.format("Фамилия: %s%nИмя: %s%nОтчество: %s", words[0], words[1], words[2]);
            }
            System.out.println(String.format("Фамилия: %s%nИмя: %s%nОтчество: %s", words[0], words[1], words[2]));
            return;
        }
    }
}