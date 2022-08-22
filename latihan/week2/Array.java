package week2;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        int[] kumpulanAngka = new int[5];
        System.out.println(array[1]);
        // urutkan array
        // Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // index of
        System.out.println(Arrays.binarySearch(array, 2));

        // array berbagai tipe data
        Object[] array2 = { 1, "string", 2.5, true };
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
