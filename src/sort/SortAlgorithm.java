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
     * @param arr1
     * @param arr2
     * @return bool
     */
    default boolean isEquals(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    /**
     * 比较器
     * @param arr
     */
    default void comparator(int[] arr){
        Arrays.sort(arr);
    }
}
