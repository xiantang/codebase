package algorithm.offer2;

public class No14 {
    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
     * 使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
     */
    public static void main(String[] args) {
        int[] array = {3, 7, 4, 8, 23, 56, 77, 89, 46, 11, 66, 77};
        mysort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void mysort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (array[left] % 2 != 0&&left<right) {
                left += 1;
            }
            while (array[right] % 2 == 0&&left<right) {
                right -= 1;
            }
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left += 1;
            right -= 1;
        }
    }

}
