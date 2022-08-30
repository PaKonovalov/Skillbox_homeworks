package etheth;

public class Main {

    public static class myRnd {
        private int max;
        private int last;

        public myRnd(int max) {
            this.max = max;
            last = (int) (System.currentTimeMillis() % max);
        }

        public int nextInt() {
            last = (last * 32719 + 3) % 32749;
            return last % max;
        }
    }

    public static void main(String[] args) {

        myRnd r = new myRnd(100);

        int size = 10;

        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (r.nextInt());
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

        int max = array[0][0];
        int min = array[0][0];
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (max < array[i][j])
                    max = array[i][j];
                if (min > array[i][j])
                    min = array[i][j];
                avg += array[i][j] / array.length;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}