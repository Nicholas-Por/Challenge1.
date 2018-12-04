package com.company;
import java.util.ArrayList;
public class Main
{

    static double findMedian(int[] values) {
        double median;
        // get count of scores
        int totalElements = values.length;
        // check if total number of scores is even
        if (totalElements % 2 == 0) {
            int sumOfMiddleElements = values[totalElements / 2] + values[totalElements / 2 - 1];
            // calculate average of middle elements
            median = ((double) sumOfMiddleElements) / 2;
        } else {
            // get the middle element
            median = (double) values[values.length / 2];
        }
        return median;
    }
    public static int[] fillArray(int length){
        int chosenN = (int)(Math.random() * length + 1);
        int[] array = new int[chosenN];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * length + 1);
        }

        return array;
    }
    public static int[] mergeSort(int[] arr) {
        int number = arr.length;
        if (number == 1) return arr;
        int secondNumber = (int) (number / 2.0 + 0.5);

        int[] arrayHalfOne = new int[secondNumber];
        int[] arrayHalfTwo = new int[number - secondNumber];

        for (int i = 0; i < secondNumber; i++) {
            arrayHalfOne[i] = arr[i];
        }

        for (int i = secondNumber; i < number; i++) {
            arrayHalfTwo[i - secondNumber] = arr[i];
        }

        arrayHalfOne = mergeSort(arrayHalfOne);
        arrayHalfTwo = mergeSort(arrayHalfTwo);

        return merge(arrayHalfOne, arrayHalfTwo);
    }
    public static int[] merge(int[] arrayHalfOne, int[] arrayHalfTwo) {
        int[] c = new int[arrayHalfOne.length + arrayHalfTwo.length];
        int i0 = 0;
        int i1 = 0;
        int i2 = 0;

        while (i1 < arrayHalfOne.length && i2 < arrayHalfTwo.length) {
            if (arrayHalfOne[i1] > arrayHalfTwo[i2]) {
                c[i0] = arrayHalfTwo[i2];
                i2++;
            } else {
                c[i0] = arrayHalfOne[i1];
                i1++;
            }
            i0++;
        }

        while (i1 < arrayHalfOne.length) {
            c[i0] = arrayHalfOne[i1];
            i0++;
            i1++;
        }

        while (i2 < arrayHalfTwo.length) {
            c[i0] = arrayHalfTwo[i2];
            i0++;
            i2++;
        }
        return c;
    }


//public void merge(int[] arr, int left, int mid, int right, int[] temp)
////declare three index variables
//// i set to left, j set to middle + 1 and  k set to left again to track where we are placing numbers
////loop while i  is less than or equal to middle, and j is less than or equal to right
//	//if array element i is less than array element j place the element i in position k in temp, increment i
//	//else place array element j in position k in temp, increment j
//	//increment k
////loop while i is less than or equal to middle
//	//place element i in position k in temp, increment i and k
////loop while j is less than or equal to right
//	//place element j in position k in temp, increment j and k
////copy all elements from left to right in temp into arr
}