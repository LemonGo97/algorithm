package merge;

public class SmallNumberSum {

    public static int sum(int[] arr) {
        return process(arr, 0, arr.length - 1);
    }

    private static int process(int[] arr, int leftPos, int rightPos) {
        if (leftPos == rightPos) {
            return 0;
        }
        int midPos = (rightPos + leftPos) / 2;
        return process(arr, leftPos, midPos)
                + process(arr, midPos + 1, rightPos)
                + merge(arr, leftPos, midPos, rightPos);
    }

    private static int merge(int[] arr, int leftPos, int midPos, int rightPos) {
        int[] help = new int[rightPos - leftPos + 1];
        int leftPointer = leftPos;
        int rightPointer = midPos + 1;
        int helpPointer = 0;
        int ans = 0;
        while (leftPointer <= midPos && rightPointer <= rightPos) {
            int leftNum = arr[leftPointer];
            int rightNum = arr[rightPointer];
            if (leftNum < rightNum) {
                // 拷贝左组
                help[helpPointer++] = leftNum;
                leftPointer++;
                // 计算小和
                ans += leftNum * (rightPos - rightPointer + 1);
            } else {
                // 拷贝右组
                help[helpPointer++] = rightNum;
                rightPointer++;
            }
        }
        while (leftPointer <= midPos) {
            help[helpPointer++] = arr[leftPointer++];
        }
        while (rightPointer <= rightPos) {
            help[helpPointer++] = arr[rightPointer++];
        }
        for (int i = 0; i < help.length; i++) {
            arr[leftPos + i] = help[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[] {3, 1, 2, 4, 7, 5, 6, 0}));
    }
}
