package bytecode;

public class YiHuoCalculate {
    public static void main(String[] args) {

    }

    /**
     * 一个数组中有一种数出现了 k 次，其他数都出现 m 次，且 m > 1, k < m。
     * 找到出现了 k 次的数。要求：额外空间复杂度 O(1), 时间复杂度 O(N)
     */
    public static int findKNum(int[] arr, int k, int m){
        int[] t = new int[32];
        for (int num : arr) {
            // 获取所有的1
            for (int i = 0; i < 32; i++) {
                if (((num >> i) & 1) != 0){
                    t[i] += 1;
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < 32; i++) {
            if (t[i] % m != 0){
                // 说明 k 位置的数在此出现过
                ans |= (1 << i);
            }
        }

        return ans;
    }

}
