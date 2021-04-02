package alex.left.first.course01;

import alex.left.first.util.CommonUtils;

/**
 * 冒泡排序
 *
 * @author alex
 * @version 1.0
 * @date 2021/4/2 11:03 上午
 */
public class BubbleSort {
    /**
     * 冒泡排序
     * 依次遍历，当前数如果大于它后面的数，则交换
     *
     * @param array array
     */
    public static void bubbleSort(int[] array) {
        if (array == null || array.length < 2) return;
        // 外层循环：控制当前排序的进度
        // 第一遍：0--n-1中冒泡出最大的
        // 第二遍：0--n-2中冒泡出最大的
        // ...
        for (int i = 0; i < array.length - 1; i++) {
            // 内层循环：遍历待排序的数据，处理交换
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) CommonUtils.swap(array, j, j + 1);
            }
        }
    }
}
