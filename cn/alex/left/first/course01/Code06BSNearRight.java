package alex.left.first.course01;

import alex.left.first.util.CommonUtils;

import java.util.Arrays;

/**
 * 在一个有序数组中，找<=某个数最右侧的位置
 *
 * @author alex
 * @version 1.0
 * @date 2021/4/2 5:28 下午
 */
public class Code06BSNearRight {
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
            if (nearRight(array1, number) != compare(array2, number)) {
                System.out.println("array: " + Arrays.toString(array));
                result = false;
            }
        }
        System.out.println(result ? "success" : "fail");
    }

    public static int compare(int[] array, int number) {
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] <= number) return i;
        }
        return -1;
    }

    /**
     * 在一个有序数组中，找<=某个数最右侧的位置
     *
     * @param array  array
     * @param number number
     * @return near right index
     */
    public static int nearRight(int[] array, int number) {
        if (array == null) return -1;
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int index = -1;
        while (leftIndex <= rightIndex) {
            int midIndex = leftIndex + ((rightIndex - leftIndex) >> 1);
            int midValue = array[midIndex];
            if (midValue <= number) {
                index = midIndex;
                leftIndex = midIndex + 1;
            } else {
                rightIndex = midIndex - 1;
            }
        }
        return index;
    }
}
