package sort;

import java.util.Arrays;

/** @author lemongo97 */
public class SortStarter {

    public static void main(String[] args) {
        int testNum = 1000000;
        int maxSize = 100;
        int maxValue = 100;

        for (int i = 0; i < testNum; i++) {
            int[] arr = generateRandomArray(maxSize, maxValue);
            int[] arrCopy = copyArray(arr);
            int[] arrVerify = copyArray(arr);
            SortAlgorithm algorithm = new SelectionSort();
            algorithm.sort(arr);
            algorithm.comparator(arrCopy);
            if (!algorithm.isEquals(arr, arrCopy)) {
                System.err.println("failed !");
                System.out.println(algorithm.getClass().getSimpleName() + ": ");
                System.out.println(Arrays.toString(arrVerify));
                break;
            }
        }
        System.out.println("success !!");
    }

    private static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    private static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }
}
