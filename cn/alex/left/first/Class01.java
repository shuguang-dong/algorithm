package alex.left.first;

import alex.left.first.util.CommonUtils;

import java.util.Arrays;

/**
 * 认识复杂度、对数器、二分法
 * 选择排序、插入排序、冒泡排序、对数器
 *
 * @author alex
 * @version 1.0
 * @date 2021/3/29 9:18 下午
 */
public class Class01 {

    public static void main(String[] args) {
//        int[] tmp = {-15, 21, 21, -48, 40, 22, 22, 47};
//        bubbleSort(tmp);
//        System.out.println(Arrays.toString(tmp));
        // 对数器的方式校验算法正确性
        logarithm();
    }

    private static void logarithm() {
        int cycleCount = 1000;
        int maxSize = 10;
        int maxValue = 100;
        boolean successFlag = true;
        for (int i = 0; i < cycleCount; i++) {
            int[] array = CommonUtils.generateRandomArray(maxSize, maxValue);
            int[] array1 = CommonUtils.copyArray(array);
//            selectSort(array1);
//            insertSort(array1);
            bubbleSort(array1);
            int[] array2 = CommonUtils.copyArray(array);
            CommonUtils.comparator(array2);
            if (!CommonUtils.isEqual(array1, array2)) {
                System.out.println("array1: " + Arrays.toString(array1));
                System.out.println("array2: " + Arrays.toString(array2));
                successFlag = false;
                break;
            }
        }
        System.out.println(successFlag ? "success" : "fail");
    }

    /**
     * 选择排序：
     * 每次从待排序内容中选择一个最小的，已排序的末端
     *
     * @param arrray arrray
     */
    public static void selectSort(int[] arrray) {
        if (arrray == null || arrray.length < 2) return;
        for (int i = 0; i < arrray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrray.length; j++) {
                if (arrray[j] < arrray[minIndex]) minIndex = j;
            }
            // 交换
            swap(arrray, i, minIndex);
        }
    }

    /**
     * 插入排序
     * 遍历待排序的内容，选出一个记录插入到已排序的部分，依旧维持有序
     *
     * @param array arrray
     */
    public static void insertSort(int[] array) {
        if (array == null || array.length < 2) return;
        // 0位置元素只有它自己，可以认为已经有序
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0 && array[j] > array[j + 1]; j--) {
                swap(array, j + 1, j);
            }
        }
    }

    /**
     * 冒泡排序
     * 如果当前数据大于后面一个数，则交换
     * 1: 0--N-1
     * 2: 0--N-2
     * ...
     * 外层：0到N-1
     * 内层：0到N-1-外层
     *
     * @param array array
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) swap(array, j, j + 1);
            }
        }
    }

    /**
     * 交换数组 i 和 j 位置的元素
     *
     * @param arrray array
     * @param i      i
     * @param j      j
     */
    private static void swap(int[] arrray, int i, int j) {
        int tmp = arrray[i];
        arrray[i] = arrray[j];
        arrray[j] = tmp;
    }
}
