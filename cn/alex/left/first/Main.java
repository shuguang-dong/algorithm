package alex.left.first;

import alex.left.first.course01.Code03InsertSort;
import alex.left.first.util.CommonUtils;

import java.util.Arrays;

/**
 * 测试主方法
 *
 * @author alex
 * @version 1.0
 * @date 2021/4/2 10:56 上午
 */
public class Main {
    public static void main(String[] args) {
        logarithm();
//        singleTest();
    }

    public static void singleTest() {
        int[] array = {-83, -25, -23, -20, 4, 43, 87};
        System.out.println(Arrays.toString(array));
        Code03InsertSort.insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 对数器的方式测试算法的正确性
     */
    private static void logarithm() {
        int cycleCount = 100000;
        int maxSize = 10;
        int maxValue = 100;
        boolean successFlag = true;
        for (int i = 0; i < cycleCount; i++) {
            int[] array = CommonUtils.generateRandomArray(maxSize, maxValue);
            int[] array1 = CommonUtils.copyArray(array);
//            SelectSort.selectSort(array1);
//            BubbleSort.bubbleSort(array1);
            Code03InsertSort.insertSort(array1);
            int[] array2 = CommonUtils.copyArray(array);
            CommonUtils.comparator(array2);
            if (!CommonUtils.isEqual(array1, array2)) {
                System.out.println("array: " + Arrays.toString(array));
                System.out.println("array1: " + Arrays.toString(array1));
                System.out.println("array2: " + Arrays.toString(array2));
                successFlag = false;
                break;
            }
        }
        System.out.println(successFlag ? "success" : "fail");
    }
}
