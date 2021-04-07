package alex.left.first.course01;

import alex.left.first.util.CommonUtils;

import java.util.Arrays;

/**
 * BS: binary search 二分查找
 *
 * @author alex
 * @version 1.0
 * @date 2021/4/2 4:07 下午
 */
public class Code04BSExist {

    public static void main(String[] args) {
        // 使用对数器的方式进行校验
        int testCycle = 10000;
        int maxSize = 10;
        int maxValue = 100;
        boolean result = true;
        for (int i = 0; i < testCycle; i++) {
            int[] array = CommonUtils.generateRandomArray(maxSize, maxValue);
            Arrays.sort(array);
            int[] array1 = CommonUtils.copyArray(array);
            int[] array2 = CommonUtils.copyArray(array);
            // 随机生成待查找的 number
            int number = (int) (Math.random() * (maxValue + 1));
            if (bSExist(array1, number) != compareMethod(array2, number)) {
                System.out.println("array: " + Arrays.toString(array) + " number: " + number);
                result = false;
                break;
            }
        }
        System.out.println(result ? "success" : "error");
    }

    /**
     * 比较方法
     * 遍历数组查看是否含有具体值
     *
     * @param array  array
     * @param number number
     * @return true or false
     */
    public static boolean compareMethod(int[] array, int number) {
        for (int i : array) {
            if (i == number) return true;
        }
        return false;
    }

    /**
     * 在一个有序数组中，找一个数是否存在,找不到返回 -1
     *
     * @param array  array
     * @param number 待查找的数字
     * @return true or false
     */
    public static boolean bSExist(int[] array, int number) {
        if (array == null) return false;
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex < rightIndex) {
            int middleIndex = leftIndex + ((rightIndex - leftIndex) >> 1);
            int midValue = array[middleIndex];
            if (midValue == number) return true;
            else if (midValue < number) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }
        return array[leftIndex] == number;
    }
}
