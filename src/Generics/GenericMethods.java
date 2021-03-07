package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericMethods<E extends Number & Comparable<E>> {

    private GenericMethods() {
    }

    public static <E> boolean exchangeElements(int e1, int e2, E[] myArray) {
        System.out.println("Array before:" + Arrays.deepToString(myArray));
        try {
            E tempElement;
            tempElement = myArray[e1];
            myArray[e1] = myArray[e2];
            myArray[e2] = tempElement;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bond");
            e.printStackTrace();
            return false;

        }

        System.out.println("Array after:" + Arrays.deepToString(myArray));
        return true;
    }

    //Write a generic method to remove the element in specified index from the specified array.
    public static <E> ArrayList<E> removeElement(int index, E[] myArray) {
        ArrayList<E> arrList = new ArrayList<E>(Arrays.asList(myArray));
        try {
            arrList.remove(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bond");
            e.printStackTrace();
            return arrList;
        }


        return arrList;
    }

    //Write a generic method to find the max element from the array.
    public static <E extends Number & Comparable<E>> E maxElement(E[] myArray) {
        E maxElement = myArray[0];
        for (int i = 1; i < myArray.length; i++) {

            if (maxElement.compareTo(myArray[i]) < 0) {
                maxElement = myArray[i];
            }

        }
        return maxElement;

    }

    //Write a generic method to find the min element from the array.
    public static <E extends Number & Comparable<E>> E minElement(E[] myArray) {
        E minElement = myArray[0];
        for (int i = 1; i < myArray.length; i++) {

            if (minElement.compareTo(myArray[i]) > 0) {
                minElement = myArray[i];
            }

        }
        return minElement;

    }

    //Write a generic method to find the average of array elements.
    public static <E extends Number> double averageOfArray(E[] myArray) {
        double sum = 0.0;
        for (E e : myArray) {
            sum += e.doubleValue();
        }
        return sum / myArray.length;

    }

}
