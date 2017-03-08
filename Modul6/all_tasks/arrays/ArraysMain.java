package all_tasks.arrays;

import java.util.Arrays;

/**
 * Created by Aleksandr on 06.03.2017.
 */
public class ArraysMain {
    public static void main(String[] args) {

        int[] arraysOfIntegers = {-1, 2, -3, 4, 5, 6, 7, 8, 5, -12};

        System.out.println("Sum of integer array: " + ArraysUtils.sum(arraysOfIntegers));

        System.out.println("Min of integer array: " + ArraysUtils.min(arraysOfIntegers));

        System.out.println("Max of integer array: " + ArraysUtils.max(arraysOfIntegers));

        System.out.println("maxPositive of integer array: " + ArraysUtils.maxPositive(arraysOfIntegers));

        System.out.println("multiplication of integer array: " + ArraysUtils.multiplication(arraysOfIntegers));

        System.out.println("Modulus of integer array: " + ArraysUtils.modulus(arraysOfIntegers));

        System.out.println("secondLargest of integer array: " + ArraysUtils.secondLargest(arraysOfIntegers));

        System.out.println("reverse of integer array: " + Arrays.toString(ArraysUtils.reverse(arraysOfIntegers)));

        System.out.println("findEvenElements of integer array: " + Arrays.toString(ArraysUtils.findEvenElements(arraysOfIntegers)));
    }
}