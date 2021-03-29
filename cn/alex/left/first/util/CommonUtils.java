package alex.left.first.util;

import java.util.Arrays;

/**
 * 工具类
 *
 * @author alex
 * @version 1.0
 * @date 2021/3/29 9:39 下午
 */
public class CommonUtils {
    public static void main(String[] args) {
        int maxSize = 10;
        int maxValue = 100;
        for (int i = 0; i < 20; i++) {
            System.out.println(Arrays.toString(generateRandomArray(maxSize, maxValue)));
        }
    }

    /**
     * 随机生成最元素 maxSize 个，最大值 maxValue 的数组
     *
     * @param maxSize  maxSize
     * @param maxValue maxValue
     * @return array
     */
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] array = new int[(int) (Math.random() * maxSize + 1)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (maxValue + 1)) - (int) (Math.random() * maxValue);
        }
        return array;
    }

    /**
     * copy 数组
     *
     * @param array array
     * @return new array
     */
    public static int[] copyArray(int[] array) {
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        return tmp;
    }

    /**
     * 用于校验的防范
     *
     * @param array array
     */
    public static void comparator(int[] array) {
        Arrays.sort(array);
    }

    public static boolean isEqual(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }
}
