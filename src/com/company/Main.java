package com.company;
import java.util.ArrayList;
public class Main
{
   int i; //left
   int j; //middle
   int k; //also left to track number placement
    int right;
    public static void StringMerge(int[] arr, int left, int mid,int right, int[] temp){
        int i = left;
        int j = mid + 1;
        int k = left;
        while( i <= mid && j <= right){
            if(arr[i].compareTo(arr[j]) < 0){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= right){
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(k = left; k <= right; k++){
            arr[k] = temp[k];
        }
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