package sort;

public class MergeSort implements SortAlgorithm {

    @Override
    public void sort(int... arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        process(arr, 0, arr.length - 1);
    }

    private void process(int[] arr, int left, int right) {
        if (left == right){
            return;
        }
        int mid = left + ((right - left) >> 1);
        process(arr, left, mid);
        process(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int leftPos = left;
        int rightPos = mid + 1;
        int i = 0;

        while (leftPos <= mid && rightPos <= right) {
            temp[i++] = arr[leftPos] <= arr[rightPos] ? arr[leftPos++] : arr[rightPos++];
        }

        while (leftPos <= mid) {
            temp[i++] = arr[leftPos++];
        }

        while (rightPos <= right) {
            temp[i++] = arr[rightPos++];
        }
        for (i = 0; i < temp.length; i++) {
            arr[left + i] = temp[i];
        }
    }

}
