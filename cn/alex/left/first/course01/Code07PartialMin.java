package alex.left.first.course01;

/**
 * 局部最小值问题
 *
 * @author alex
 * @version 1.0
 * @date 2021/4/2 5:41 下午
 */
public class Code07PartialMin {

    /**
     * 返回数组中任一一个局部最小值
     *
     * @param array array
     * @return partialMinValue 所在的 index
     */
    public static int partialMin(int[] array) {
        if (array == null || array.length == 0) return -1; // 不存在
        if (array.length == 1 || array[0] < array[1]) return 0;
        if (array[array.length - 1] > array[array.length - 2]) return array.length - 1;
        int leftIndex = 1;
        int rightIndex = array.length - 2;
        while (leftIndex < rightIndex) {
            int midIndex = leftIndex + ((rightIndex - leftIndex) >> 1);
            if (array[midIndex] > array[midIndex - 1]) {
                // left -- mid 直接有个最小值，因为 array[0] >= array[1]
                rightIndex = midIndex - 1;
            } else if (array[midIndex] > array[midIndex + 1]) {
                leftIndex = midIndex + 1;
            } else {
                return midIndex;
            }
        }
        return leftIndex;
    }
}
