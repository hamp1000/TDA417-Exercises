package week1;

import java.util.Arrays;

public class WarmUp {

    public static void main(String[] args) {
        revertTest();
    }

    private static void revertTest() {
        Integer[] intArray = {1, 2, 3, 4, 5, 6,};
        String[] stringArray = {"a", "b", "c", "d"};


        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(revers(intArray)));
        System.out.println();
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(revers(stringArray)));

    }

    /**
     * reverts an array.
     *
     * @param array is the array we wanted reverted.
     * @return the array reverted.
     */
    private static <T> T[] revers(T[] array) {
        int size = array.length;
        T[] returnArray = (T[]) (new Object[size]);

        for (int i = 0; i < size; i++) {
            returnArray[size - i - 1] = array[i];
        }
        return returnArray;
    }

}

