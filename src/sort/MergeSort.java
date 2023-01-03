package sort;

import java.util.Arrays;

public class MergeSort {

    public static int[] sort(int[] arr) {
        process(arr, 0, arr.length - 1);
        return arr;
    }

    public static void process(int[] arr, int leftPos, int rightPos) {
        if (leftPos == rightPos){
            return;
        }
        int middlePos = (leftPos + rightPos) / 2;
        process(arr, leftPos, middlePos);
        process(arr, middlePos + 1, rightPos);
        merge(arr, leftPos, middlePos,rightPos);
    }

    private static void merge(int[] arr, int leftPos, int middlePos, int rightPos) {
        int[] help = new int[rightPos - leftPos + 1];
        int leftPointer = leftPos;
        int rightPointer = middlePos + 1;
        int helpPointer = 0;
        while (leftPointer <= middlePos && rightPointer <= rightPos){
            help[helpPointer++] = arr[leftPointer] <= arr[rightPointer] ? arr[leftPointer++] : arr[rightPointer++];
        }
        while (leftPointer <= middlePos){
            help[helpPointer] = arr[leftPointer++];
        }
        while (rightPointer <= rightPos){
            help[helpPointer] = arr[rightPointer++];
        }
        for (int i = 0; i < help.length; i++) {
            arr[leftPos + i] = help[i];
        }
    }

    public static int[] sortByLoop(int[] arr){
        processByLoop(arr, 0, arr.length - 1);
        return arr;
    }

    public static void processByLoop(int[] arr, int leftPos, int rightPos){
        if (leftPos == rightPos){
            return;
        }
        int step = 1;
        while (step < arr.length) {
            int leftPointer = 0;
            while (leftPointer < arr.length){
                if (step >= arr.length - leftPointer) {
                    break;
                }
                int middlePointer = leftPointer + step - 1;
                int rightPointer = middlePointer + Math.min(step, arr.length - middlePointer - 1);
                merge(arr, leftPointer, middlePointer, rightPointer);
                leftPointer = rightPointer + 1;
            }
            if (step > arr.length / 2){
                break;
            }
            step <<= 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{3, 1, 4, 2})));
        System.out.println(Arrays.toString(sortByLoop(new int[]{3, 1, 4, 2})));
    }
}
