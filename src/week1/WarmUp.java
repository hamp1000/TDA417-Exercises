package week1;

import java.util.Arrays;
import java.util.Objects;

public class WarmUp {

    public static void main(String[] args) {
        //revertTest();
        //palindromeTest();
        dynamicArrayTest();
    }

    private static void dynamicArrayTest() {
        Integer[] intArray = {1, 2, 3, 4, 5, 6,};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(intArray);
        System.out.println(Arrays.toString(dynamicArray.getArray()));
        dynamicArray.add(4);
        System.out.println(Arrays.toString(dynamicArray.getArray()));

    }

    private static void palindromeTest() {
        System.out.println(Boolean.toString(isPalindrome("madamimadam")));
        System.out.println(Boolean.toString(isPalindrome("madaamimadam")));

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

    /**
     * Checks if a string i s palindrome.
     *
     * @param string that is checked.
     * @return true if the string is palindrome.
     */
    private static Boolean isPalindrome(String string) {
        //TODO: Do harder version.
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(string.length() - i - 1) != string.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    static class DynamicArray<A> {
        private A[] array;

        DynamicArray(A[] array) {
            this.array = array;
        }

        void add(A object) {
            A[] updated =(A[]) (new Object[array.length + 1]);

            for (int i = 0; i < updated.length; i++) {
                if (i < array.length) {
                    updated[i] = array[i];
                } else {
                    updated[i] = object;
                }
            }
            array = updated;
        }

        A get(int index) {
            return array[index];
        }

        void set(int index, A object) {
            array[index] = object;
        }

        public A[] getArray() {
            return array;
        }
    }

}

