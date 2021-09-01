package sort;

import java.util.Arrays;

/** @author lemongo97 */
public interface SortAlgorithm {
    /**
     * 通用排序接口
     *
     * @param arr
     */
    void sort(int... arr);

    /**
     * 交换两个数组值
     *
     * @param arr
     * @param a
     * @param b
     */
    default void swap(int[] arr, int a, int b) {
        assert a != b;
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }

    /**
     * 验证排序结果
     *
     * @param arr
     */
    default void verify(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        System.out.println(this.getClass().getSimpleName() + ": ");
        if (Arrays.equals(arr, sortedArr)) {
            System.out.println("success");
        } else {
            System.err.println("failed");
        }
        System.out.println("your: " + Arrays.toString(sortedArr));
        System.out.println("sort: " + Arrays.toString(arr));
    }
}
