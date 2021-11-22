public class Main {
    public static void main(String[] args) {
//        Part 1:
        int[] array1 = new int[20];
        int count1 = 0;
        for (int i = 0;i < 20; i++) {
            array1[i] =  (int) Math.floor(Math.random() * 6 + 1);
            if (array1[i] == 1) {
                count1++;
            }
        }
        System.out.println("Array 1:");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("Number of 1's in array 1: " + count1 +"\n");
// Part 2
        double[] array2 = new double[10];
        double count2 = 0;
        for (int j = 0; j < 10; j++) {
            array2[j] = Math.floor(Math.random() * 100 + 1);
            count2 += array2[j];
        }
        System.out.println("Array 2:");
        for (double v : array2) {
            System.out.print(v + " ");
        }
        System.out.println("\n");
        System.out.println("Average of array 2: " + count2 / 10);

// Part 3
        System.out.println("Swapped 3rd number and 5th number: ");
        swap(array2, 2, 5);
        for (double v : array2) {
            System.out.print(v + " ");
        }
        System.out.println("\n");

//  Part 4
        System.out.println("Reversed the (changed) array:");
        for (int k = 0; k < 5; k++) {
            swap(array2, k, 9-k);
        }
        for (double v : array2) {
            System.out.print(v + " ");
        }
    }

    public static double[] swap(double[] array, int position1, int position2) {
        double temp = array[position1];
        array[position1] = array[position2];
        array[position2] = temp;
        return array;
    }
}


