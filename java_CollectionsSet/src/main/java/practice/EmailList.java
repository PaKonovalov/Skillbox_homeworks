package practice;

import java.util.ArrayList;

import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    TreeSet<String> emails = new TreeSet<>();
    String patternOfEmail;

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
        String regexEmail = "\\w+@{1}\\w+\\.\\w+";
        Pattern patternEmail = Pattern.compile(regexEmail);
        Matcher matcherEmail = patternEmail.matcher(email);
        while (matcherEmail.find()) {
            int start = matcherEmail.start();
            int end = matcherEmail.end();
            patternOfEmail = email.substring(start, end).toLowerCase();

            String endOfEmail = "";
            int startFindEnd = patternOfEmail.lastIndexOf(endOfEmail);
            int endFindFirstDot = patternOfEmail.lastIndexOf('.', startFindEnd);
            String domainName = patternOfEmail.substring(endFindFirstDot + 1, startFindEnd);
            if (domainName.contains("ru") || domainName.contains("com")) {
                emails.add(patternOfEmail);
                getSortedEmails();
            } else {
                break;
            }
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return new ArrayList<>(emails);
    }
}
