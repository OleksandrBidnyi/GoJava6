package all_tasks.arrays;

import java.util.Arrays;

/**
 * Created by Aleksandr on 06.03.2017.
 */
public class ArraysMain {
    public static void main(String[] args) {

        int[] arraysOfIntegers = {-1, 2, -3, 4, 5, 6, 7, 8, 5, -12};
        ArraysUtils arraysUtils = new ArraysUtils();

        System.out.println("Sum of integer array: " + arraysUtils.sum(arraysOfIntegers));

        System.out.println("Min of integer array: " + arraysUtils.min(arraysOfIntegers));

        System.out.println("Max of integer array: " + arraysUtils.max(arraysOfIntegers));

        System.out.println("maxPositive of integer array: " + arraysUtils.maxPositive(arraysOfIntegers));

        System.out.println("multiplication of integer array: " + arraysUtils.multiplication(arraysOfIntegers));

        System.out.println("Modulus of integer array: " + arraysUtils.modulus(arraysOfIntegers));

        System.out.println("secondLargest of integer array: " + arraysUtils.secondLargest(arraysOfIntegers));

        System.out.println("reverse of integer array: " + Arrays.toString(arraysUtils.reverse(arraysOfIntegers)));

        System.out.println("findEvenElements of integer array: " + Arrays.toString(arraysUtils.findEvenElements(arraysOfIntegers)));
    }
}