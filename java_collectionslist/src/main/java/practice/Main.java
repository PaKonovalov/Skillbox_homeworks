package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String command = "";
        int index = 0;
        String todo = null;
        String regexCommand = "[A-Z]+";
        Pattern patternCommand = Pattern.compile(regexCommand);
        Matcher matcherCommand = patternCommand.matcher(input);
        while (matcherCommand.find()) {
            int start = matcherCommand.start();
            int end = matcherCommand.end();
            command = input.substring(start, end);
        }

        String regexIndex = "[0-9]+";
        Pattern patternIndex = Pattern.compile(regexIndex);
        Matcher matcherIndex = patternIndex.matcher(input);
        while (matcherIndex.find()) {
            int start = matcherIndex.start();
            int end = matcherIndex.end();
            //index = Integer.parseInt(input.substring(start, end));
        }

        String regexText = "[\\s,a-z]+";
        Pattern patternText = Pattern.compile(regexText);
        Matcher matcherText = patternText.matcher(input);
        while (matcherText.find()) {
            int start = matcherText.start();
            int end = matcherText.end();
            todo = input.substring(start + 1, end);
        }
        if (command.equals("ADD")) {
            todoList.add(todo);
        }

    }
}