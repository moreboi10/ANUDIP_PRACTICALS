import java.util.Random;

public class lab6_Q1 {
    public static void main(String[] args) {
        int[][][] array = new int[3][3][3];

        ThreeDArrayHelper helper = new ThreeDArrayHelper(array);
        helper.initializeRandom();
        helper.displayArray();
        System.out.println("Maximum value: " + helper.findMax());
        System.out.printf("Average of all elements: %.2f\n", helper.calculateAverage());
    }
}

class ThreeDArrayHelper {
    private int[][][] array;
    private Random rand;

    public ThreeDArrayHelper(int[][][] array) {
        this.array = array;
        this.rand = new Random();
    }

    public void initializeRandom() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = rand.nextInt(100);
                }
            }
        }
    }

    public void displayArray() {
        System.out.println("3D Array Elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Layer " + (i + 1) + ":"); // Each top-level index is a layer
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public int findMax() {
        int max = Integer.MIN_VALUE;
        for (int[][] layer : array) {
            for (int[] row : layer) {
                for (int val : row) {
                    if (val > max) {
                        max = val;
                    }
                }
            }
        }
        return max;
    }

    public double calculateAverage() {
        int sum = 0;
        int count = 0;
        for (int[][] layer : array) {
            for (int[] row : layer) {
                for (int val : row) {
                    sum += val;
                    count++;
                }
            }
        }
        return (double) sum / count;
    }
}
