package sort;

/**
 * @author lemongo97
 */
public class SortStarter {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 1, 4, 5, 7, 1, 2};
        SortAlgorithm algorithm = new SelectionSort();
        algorithm.sort(arr);
        algorithm.verify(arr);
    }
}
