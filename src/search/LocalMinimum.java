package search;

/**
 * @author lemongo97
 *
 * 局部最小值问题：
 *      已知任意相邻两数不相等，求局部最小值下标
 */
public class LocalMinimum implements SearchAlgorithm{

    public int search(int[] arr){
        if (arr == null || arr.length == 0){
            return -1;
        }
        if (arr[0] < arr[1]){
            return arr[0];
        }
        if (arr[arr.length -1] < arr[arr.length -1 - 1]){
            return arr[arr.length -1];
        }
        int l = 0;
        int r = arr.length - 1;
        int mid;
        while (l < r){
            mid = l + ((r-l) >> 1);
            if (arr[mid] > arr[mid - 1]){
                r = mid;
            } else if (arr[mid] > arr[mid + 1]){
                l = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1,0,-1,6};
        LocalMinimum algorithm = new LocalMinimum();
        int result = algorithm.search(arr);
        System.out.println(result);
    }
}
