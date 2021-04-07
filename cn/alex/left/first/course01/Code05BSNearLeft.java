package alex.left.first.course01;

import alex.left.first.util.CommonUtils;

import java.util.Arrays;

/**
 * 在一个有序数组中，找>=某个数最左侧的位置
 *
 * @author alex
 * @version 1.0
 * @date 2021/4/2 4:38 下午
 */
public class Code05BSNearLeft {
    public static void main(String[] args) {
        int testCycle = 1000;
        int maxSize = 20;
        int maxValue = 200;
        boolean result = true;
        for (int i = 0; i < testCycle; i++) {
            int[] array = CommonUtils.generateRandomArray(maxSize, maxValue);
            Arrays.sort(array);
            int[] array1 = CommonUtils.copyArray(array);
            int[] array2 = CommonUtils.copyArray(array);
            int number = CommonUtils.generateRandomNumber(maxValue);
            if (nearLeft(array1, number) != compare(array2, number)) {
                System.out.println("array: " + Arrays.toString(array));
                result = false;
            }
        }
        System.out.println(result ? "success" : "fail");
    }

    public static int compare(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= number) return i;
        }
        return -1;
    }

    /**
     * 在一个有序数组中，找>=某个数最左侧的位置
     *
     * @param array  array
     * @param number number
     * @return near left number
     */
    public static int nearLeft(int[] array, int number) {
        if (array == null) return -1;
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int index = -1;
        while (leftIndex <= rightIndex) {
            int midIndex = leftIndex + ((rightIndex - leftIndex) >> 1);
            int midValue = array[midIndex];
            if (midValue < number) {
                leftIndex = midIndex + 1;
            } else {
                index = midIndex;
                rightIndex = midIndex - 1;
            }
        }
        return index;
    }
}
