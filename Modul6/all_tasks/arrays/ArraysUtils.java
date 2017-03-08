package all_tasks.arrays;

/**
 * Created by Aleksandr on 05.03.2017.
 */
public class ArraysUtils {

    public static int sum(int array[]) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Integer array is empty");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += i;
        }
        return sum;
    }

    public static int min(int array[]) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Integer array is empty");
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int array[]) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Integer array is empty");
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int maxPositive(int array[]) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Integer array is empty");
        }
        int maxPositive = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] > maxPositive) {
                maxPositive = array[i];
            }
        }
        return maxPositive;
    }

    public static int multiplication(int array[]) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Integer array is empty");
        }
        int multiplication = 1;
        for (int i = 0; i < array.length; i++) {
            multiplication *= array[i];
        }
        return multiplication;
    }

    public static int modulus(int array[]) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Integer array is empty");
        }
        if (array[array.length - 1] == 0) {
            throw new IllegalArgumentException("Invalid value of last element");
        }
        return array[0] % array[array.length - 1];
    }

    public static int secondLargest(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Integer array is empty");
        }
        int secondLargest = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondLargest = max;
                max = array[i];
            } else if (array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public static int[] reverse(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Integer array is empty");
        }
        for (int i = 0; array.length / 2 > i; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }

        return array;
    }

    public static int[] findEvenElements(int array[]) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Integer array is empty");
        }
        int[] temp = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                temp[count] = array[i];
                count++;
            }
        }
        int[] even = new int[count];
        System.arraycopy(temp, 0, even, 0, count);
        return even;
    }
}