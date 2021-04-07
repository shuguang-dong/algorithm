package alex.left.first.course02;

/**
 * 数组K M问题
 *
 * @author alex
 * @version 1.0
 * @date 2021/4/7 10:12 下午
 */
public class Code04OddTimesEvenTimes {

    /**
     * 数组中两种数出现了奇数次，其余的数字出现了偶数次，找到并打印这两种数
     *
     * @param array array
     */
    public static void findOddEvenNumber(int[] array) {
        if (array == null || array.length == 0) return;
        int xor = 0;
        // 遍历数组，一次异或数组中每一个元素，最后得到的结果为两个奇数次数字的异或结果
        // 因为偶数次的数在遍历过程中都会变成0
        for (int i : array) {
            xor ^= i;
        }

        // 提取 xor 中最右侧的1，然后把数组中的数据分为两类
        // 一类是对应位置为1的，一类是对应位置不为1的
        // 因为异或相当于无进位相加，所以两个奇数次的数在xor最右侧1的位置上肯定是一个为1，一个为0
        int xorMostRightOne = xor & -xor;
        int oneOddNumber = 0;
        // 遍历数组，只异或最右侧1上为0的数字，可以得到一个奇数次的值
        for (int i : array) {
            if ((i & xorMostRightOne) == 0) oneOddNumber ^= i;
        }
        int anotherOddNumber = xor ^ oneOddNumber;
        System.out.println("出现奇数次的数字是: " + oneOddNumber + " 和 " + anotherOddNumber);
    }
}
