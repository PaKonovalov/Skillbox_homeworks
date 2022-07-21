package practice;

import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {

        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int i, j, k, l, m, n;
        ArrayList<String> coolNumbers = new ArrayList<>(2_000_000);

        for (i = 0; i < letters.length; i++) {
            for (j = 0; j < numbers.length; j++) {
                for (k = 0; k < letters.length; k++) {
                    for (l = 0; l < letters.length; l++) {
                        for (m = 0; m <= 1; m++) {
                            for (n = 0; n <= 99; n++) {
                                String number = letters[i] + numbers[j] + numbers[j] + numbers[j] + letters[k]
                                        + letters[l] + m + n;
                                coolNumbers.add(number);
                            }
                        }
                    }
                }
            }
        }
        return coolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        return list.contains(number);
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        return Collections.binarySearch(sortedList, number) >= 0;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }

}
