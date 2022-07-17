package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {
        char[][] myArray = new char[size][size];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0, x = myArray[i].length - 1; j < myArray[i].length; j++, x--) {
                if (i == j || i == x) {
                    myArray[i][j] = SYMBOL;
                } else {
                    myArray[i][j] = ' ';
                }
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        return myArray;
    }
}
//TODO: Написать метод, который создаст двумерный массив char заданного размера.
// массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
// [X,  , X]
// [ , X,  ]
// [X,  , X]


