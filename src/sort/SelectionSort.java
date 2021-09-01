package sort;

/**
 * 选择排序
 *
 * @author lemongo97
 */
public class SelectionSort implements SortAlgorithm {
    @Override
    public void sort(int... arr) {
        if (arr == null || arr.length <= 1){
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                swap(arr, minIndex, i);
            }
        }
    }
}
