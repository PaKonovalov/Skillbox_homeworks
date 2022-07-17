package practice.strings;

import java.util.Scanner;

public class FullNameFormatter {

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
            String start = "";
            int lastNStart = input.indexOf(start);
            int lastNEnd = input.indexOf(" ", lastNStart);
            int patronymicStart = input.lastIndexOf(start);
            int patronymicEnd = input.lastIndexOf(" ", patronymicStart);
            String lastNResult = input.substring(lastNStart, lastNEnd);
            String patronymicResult = input.substring(patronymicEnd + 1, patronymicStart);
            String firstNResult = input.substring(lastNEnd + 1, patronymicEnd);
            System.out.println(String.format("Фамилия: %s%nИмя: %s%nОтчество: %s", lastNResult, firstNResult, patronymicResult));
        }
    }
}
