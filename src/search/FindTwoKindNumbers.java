package search;

import java.util.Arrays;

/**
 * 一个数组中有两种数出现了奇数次，其他数都出现了偶数次，怎么找到并打印这两种数
 */
public class FindTwoKindNumbers {

    public static void main(String[] args) {
        int[] arr = new int[] {2, 2, 3, 1, 3, 6, 4, 3, 3, 4};

        FindTwoKindNumbers y = new FindTwoKindNumbers();
        int[] result = y.search(arr);
        System.out.println(Arrays.toString(result));
    }

    private int[] search(int[] arr) {
        int a = 0;
        for (int i : arr) {
            a ^= i;
        }
        // 找出末尾的二进制 1
        int seed = a & -a;
        int b = 0;
        for (int i : arr) {
            if (seed != (i & -i)) {
                // 过滤掉所有末尾的二进制 1 与上边 seed 不一样的值
                continue;
            }
            b ^= i;
        }
        a ^= b;
        return new int[] {a, b};
    }
}
