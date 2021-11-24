public class Main {

    public static int[] add(int[] array, int num) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = num;
        return newArray;
    }

    public static int[] pop(int[] array) {
        int[] newArray = new int[array.length-1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
    
    public static int[] insert(int[] array, int index, int num) {
        int[] newArray = new int[array.length+1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = num;
        for (int j = index + 1; j < newArray.length; j++) {
            newArray[j] = array[j-1];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] randomArray = {2, 6, 3, 4, 7};
        for (int num:
             randomArray) {
            System.out.print(num+" ");
        }
        System.out.println();
        randomArray = add(randomArray, 13);
        for (int num:
                randomArray) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
