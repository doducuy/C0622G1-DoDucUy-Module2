package ss14_sort.sort;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arr={7,9,10,3,4,5,5,5,78,99,65,25,87};
        System.out.println(Arrays.toString(Sort.insertSort(arr)));
        System.out.println(Arrays.toString(Sort.selectionSort(arr)));
        System.out.println(Arrays.toString(Sort.bubbleSort(arr)));
    }
}
