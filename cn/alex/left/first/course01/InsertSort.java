package alex.left.first.course01;

import alex.left.first.util.CommonUtils;

/**
 * 插入排序
 *
 * @author alex
 * @version 1.0
 * @date 2021/4/2 11:11 上午
 */
public class InsertSort {

    /**
     * 插入排序
     * 从待排序的数组中取出一个值，把它插入到已排序的部分，依旧维持排序
     *
     * @param array array
     */
    public static void insertSort(int[] array) {
        if (array == null || array.length < 2) return;
        // 外层循环：控制排序的进度，0位置默认是有序位置，所以index从1开始
        for (int i = 1; i < array.length; i++) {
            // 内层循环：处理待排序数字的插入位置
            for (int j = i - 1; j >= 0 && array[j] > array[j + 1]; j--) {
                CommonUtils.swap(array, j + 1, j);
            }
        }
    }
}
