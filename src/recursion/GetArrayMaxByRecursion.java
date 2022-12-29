package recursion;

public class GetArrayMaxByRecursion {

    public static int getMax(int[] arr) {
        return process(arr, 0, arr.length - 1);
    }

    private static int process(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex == rightIndex) {
            return arr[leftIndex];
        }
        int middleIndex = (leftIndex + rightIndex) / 2;
        int leftMax = process(arr, leftIndex, middleIndex);
        int rightMax = process(arr, middleIndex + 1, rightIndex);
        return Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {
        int[] example = new int[] {7, 1, 2, 4, 1, 2, 6};
        System.out.println(getMax(example));
    }
}
