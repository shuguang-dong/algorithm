package alex.left.first.course01;

import alex.left.first.util.CommonUtils;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author alex
 * @version 1.0
 * @date 2021/4/2 10:28 上午
 */
public class SelectSort {

    /**
     * 选择排序
     * 遍历数组，找出当前最小值，放到已排序的末尾
     *
     * @param array array
     */
    public static void selectSort(int[] array) {
        if (array == null || array.length < 2) return;
        // 外层遍历：控制当前排序的进度
        // 第一遍：0--n-1找最小值
        // 第二遍：1--n-1找最小值
        // ...
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            // 内层循环：找出待排序数组中的最小值的索引
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) minIndex = j;
            }
            // 交换
            if (i != minIndex) CommonUtils.swap(array, i, minIndex);
        }
    }
}
