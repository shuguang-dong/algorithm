package alex.left.first.course02;

/**
 * 提取数字二进制形式下最右侧的1
 *
 * @author alex
 * @version 1.0
 * @date 2021/4/7 10:04 下午
 */
public class Code03ExtractMostRightOne {
    public static int extractMostRightOne(int number) {
        return number & -number;
    }
}
