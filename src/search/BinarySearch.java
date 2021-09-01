package search;


/**
 * @author lemongo97
 */
public class BinarySearch implements SearchAlgorithm {

    @Override
    public int search(int[] array, int num) {
        if (array == null || array.length == 0){
            return -1;
        }
        int l = 0;
        int r = array.length - 1;
        int mid;
        while (l < r){
            // 不用 （L + R）/ 2 的原因是防止溢出，且避免浮点数 可以使用 L + (R - L) / 2
            // 在这里 (R - L) >> 1 等同于 (R - L) / 2
            mid = l + ((r - l) >> 1);
            if (array[mid] == num){
                r = mid;
            } else if (array[mid] > num){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return array[l] == num ? l : -1;
    }

}
