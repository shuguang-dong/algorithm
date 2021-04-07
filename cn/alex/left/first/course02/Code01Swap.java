package alex.left.first.course02;

/**
 * @author alex
 * @version 1.0
 * @date 2021/4/7 9:49 下午
 */
public class Code01Swap {

    /**
     * 不适用额外遍历交换数组中 i 和 j 位置的值，其中i != j
     *
     * @param array array
     * @param i     i
     * @param j     j
     */
    public static void swap(int[] array, int i, int j) {
        array[i] = array[i] ^ array[j];
        array[j] = array[i] ^ array[j];
        array[i] = array[i] ^ array[j];
    }
}
