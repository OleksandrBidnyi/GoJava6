package task4;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Aleksandr on 18.03.2017.
 */
public class Generate {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>();
        LinkedList<Integer> intLinked = new LinkedList<>();

        System.out.println("Working with ArrayList with 1000 elements" + "\n");

        long startAddToArray = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            intArray.add(i + 1);
        }
        long finishAddToArray = System.currentTimeMillis();
        long timeConsumedMillisAdd = finishAddToArray - startAddToArray;
        System.out.println("1000 elements in ArrayList  add: " + " time: " + timeConsumedMillisAdd + " size of array: " + intArray.size());

        long startSetToArray = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            intArray.set(i, 2222);
        }
        long finishSetToArray = System.currentTimeMillis();
        long timeConsumedMillisSet = finishSetToArray - startSetToArray;
        System.out.println("1000 elements in ArrayList  set: " + " time: " + timeConsumedMillisSet + " size of array: " + intArray.size());

        long startGetFromArray = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
        }
        intArray.get(0);
        long finishGetFromArray = System.currentTimeMillis();
        long timeConsumedMillisGet = finishGetFromArray - startGetFromArray;
        System.out.println("1000 elements in ArrayList get: " + " time: " + timeConsumedMillisGet + " size of array: " + intArray.size());

        long startRemoveFromArray = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
        }
        intArray.remove(55);
        long finishRemoveFromArray = System.currentTimeMillis();
        long timeConsumedMillisRemove = finishRemoveFromArray - startRemoveFromArray;
        System.out.println("1000 elements in ArrayList remove: " + " time: " + timeConsumedMillisRemove + " size of array: " + intArray.size());

        long startClearFromArray = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
        }
        intArray.clear();
        long finishClearFromArray = System.currentTimeMillis();
        long timeConsumedMillisClear = finishClearFromArray - startClearFromArray;
        System.out.println("1000 elements in ArrayList clear: " + " time: " + timeConsumedMillisClear + " size of array: " + intArray.size());

        System.out.println("\n" + "Working with ArrayList with 10000 elements" + "\n");

        long startAddToArray2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            intArray.add(i + 1);
        }
        long finishAddToArray2 = System.currentTimeMillis();
        long timeConsumedMillisAdd2 = finishAddToArray2 - startAddToArray2;
        System.out.println("10000 elements in ArrayList  add: " + " time: " + timeConsumedMillisAdd2 + " size of array: " + intArray.size());

        long startSetToArray2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            intArray.set(5555, 2222);
        }
        long finishSetToArray2 = System.currentTimeMillis();
        long timeConsumedMillisSet2 = finishSetToArray2 - startSetToArray2;
        System.out.println("10000 elements in ArrayList  set: " + " time: " + timeConsumedMillisSet2 + " size of array: " + intArray.size());

        long startGetFromArray2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
        }
        intArray.get(9997);
        long finishGetFromArray2 = System.currentTimeMillis();
        long timeConsumedMillisGet2 = finishGetFromArray2 - startGetFromArray2;
        System.out.println("10000 elements in ArrayList get: " + " time: " + timeConsumedMillisGet2 + " size of array: " + intArray.size());

        long startRemoveFromArray2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
        }
        intArray.remove(9998);
        long finishRemoveFromArray2 = System.currentTimeMillis();
        long timeConsumedMillisRemove2 = finishRemoveFromArray2 - startRemoveFromArray2;
        System.out.println("10000 elements in ArrayList remove: " + " time: " + timeConsumedMillisRemove2 + " size of array: " + intArray.size());

        long startClearFromArray2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
        }
        intArray.clear();
        long finishClearFromArray2 = System.currentTimeMillis();
        long timeConsumedMillisClear2 = finishClearFromArray2 - startClearFromArray2;
        System.out.println("10000 elements in ArrayList clear: " + " time: " + timeConsumedMillisClear2 + " size of array: " + intArray.size());

        System.out.println("\n" + "Working with LinkedList with 1000 elements" + "\n");

        long startAddToLinked = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            intLinked.add(i + 1);
        }
        long finishAddToLinked = System.currentTimeMillis();
        long timeConsumedMillisLinkedAdd = finishAddToLinked - startAddToLinked;
        System.out.println("1000 elements in LinkedList  add: " + " time: " + timeConsumedMillisLinkedAdd + " size of LinkedList: " + intLinked.size());

        long startSetToLinked = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            intLinked.set(i, 2222);
        }
        long finishSetToLinked = System.currentTimeMillis();
        long timeConsumedMillisLinkedSet = finishSetToLinked - startSetToLinked;
        System.out.println("1000 elements in LinkedList  set: " + " time: " + timeConsumedMillisLinkedSet + " size of LinkedList: " + intLinked.size());

        long startGetFromLinked = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
        }
        intLinked.get(0);
        long finishGetFromLinked = System.currentTimeMillis();
        long timeConsumedMillisLinkedGet = finishGetFromLinked - startGetFromLinked;
        System.out.println("1000 elements in LinkedList get: " + " time: " + timeConsumedMillisLinkedGet + " size of LinkedList: " + intLinked.size());

        long startRemoveFromLinked = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
        }
        intLinked.remove(55);
        long finishRemoveFromLinked = System.currentTimeMillis();
        long timeConsumedMillisLinkedRemove = finishRemoveFromLinked - startRemoveFromLinked;
        System.out.println("1000 elements in LinkedList remove: " + " time: " + timeConsumedMillisLinkedRemove + " size of LinkedList: " + intLinked.size());

        long startClearFromLinked = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
        }
        intLinked.clear();
        long finishClearFromLinked = System.currentTimeMillis();
        long timeConsumedMillisLinkedClear = finishClearFromLinked - startClearFromLinked;
        System.out.println("1000 elements in LinkedList clear: " + " time: " + timeConsumedMillisLinkedClear + " size of LinkedList: " + intLinked.size());

        System.out.println("\n" + "Working with LinkedList with 10000 elements" + "\n");

        long startAddToLinked2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            intLinked.add(i + 1);
        }
        long finishAddToLinked2 = System.currentTimeMillis();
        long timeConsumedMillisLinkedAdd2 = finishAddToLinked2 - startAddToLinked2;
        System.out.println("10000 elements in LinkedList  add: " + " time: " + timeConsumedMillisLinkedAdd2 + " size of LinkedList: " + intLinked.size());

        long startSetToLinked2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            intLinked.set(5555, 2222);
        }
        long finishSetToLinked2 = System.currentTimeMillis();
        long timeConsumedMillisLinkedSet2 = finishSetToLinked2 - startSetToLinked2;
        System.out.println("10000 elements in LinkedList  set: " + " time: " + timeConsumedMillisLinkedSet2 + " size of LinkedList: " + intLinked.size());

        long startGetFromLinked2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
        }
        intLinked.get(9997);
        long finishGetFromLinked2 = System.currentTimeMillis();
        long timeConsumedMillisLinkedGet2 = finishGetFromLinked2 - startGetFromLinked2;
        System.out.println("10000 elements in LinkedList get: " + " time: " + timeConsumedMillisLinkedGet2 + " size of LinkedList: " + intLinked.size());

        long startRemoveFromLinked2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
        }
        intLinked.remove(9998);
        long finishRemoveFromLinked2 = System.currentTimeMillis();
        long timeConsumedMillisLinkedRemove2 = finishRemoveFromLinked2 - startRemoveFromLinked2;
        System.out.println("10000 elements in LinkedList remove: " + " time: " + timeConsumedMillisLinkedRemove2 + " size of LinkedList: " + intLinked.size());

        long startClearFromLinked2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
        }
        intLinked.clear();
        long finishClearFromLinked2 = System.currentTimeMillis();
        long timeConsumedMillisLinkedClear2 = finishClearFromLinked2 - startClearFromLinked2;
        System.out.println("10000 elements in LinkedList clear: " + " time: " + timeConsumedMillisLinkedClear2 + " size of LinkedList: " + intLinked.size());
    }
}
