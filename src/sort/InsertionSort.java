package sort;

/**
 * @author lemongo97
 * 插入排序
 */
public class InsertionSort implements SortAlgorithm {

    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }
}
