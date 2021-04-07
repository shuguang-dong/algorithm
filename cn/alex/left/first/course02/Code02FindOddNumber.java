package alex.left.first.course02;

/**
 * @author alex
 * @version 1.0
 * @date 2021/4/7 9:55 下午
 */
public class Code02FindOddNumber {

    /**
     * 一个数组中有一种数出现了奇数次，其余均出现偶数次，找到并打印这种数
     * 主要利用了 相同数字异或结果为0 0 任意数字和0异或结果都是它本身
     *
     * @param array array
     * @return oddNumber
     */
    public static int findOddNumber(int[] array) {
        if (array == null || array.length == 0) return -1; // not found
        int xor = 0;
        for (int i : array) {
            xor ^= i;
        }
        System.out.println("出现一次奇数的数字是: " + xor);
        return xor;
    }
}
