package practice.reverseArray;

import java.util.Arrays;

public class Main {

    // используя данный метод, вы можете использовать ваши методы, и проверить их работу на разных
    // значений для проверки и отладки
    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";
        String[] splitLine = line.split(",?\\s+");
        System.out.println(Arrays.toString(ReverseArray.reverse(splitLine)));
    }
}
