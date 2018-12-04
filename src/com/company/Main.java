package com.company;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        int[] temp1 = {};
        Arr(10000);
        int[] array = new int[Arry.length];
        IntMerge(array, 0, 0, 0, temp1);
    }
    public static int[] Arr(int num)
    {
        int Arry[] = {};
        for(int i = 0; i <= num;i++)
        {
            Arry[i] = (int)(Math.random()*10);
        }
        return Arry;
    }
   int i; //left
   int j; //middle
   int k; //also left to track number placement
    int right;
    public static void IntMerge(int[] Arr, int left, int mid,int right, int[] temp){
        int i = left;
        int j = mid + 1;
        int k = left;

        while( i <= mid && j <= right){
            if(Arr[i] <=(Arr[j]))
            {
                temp[k] = Arr[i];
                i++;
            }else{
                temp[k] = Arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k] = Arr[i];
            i++;
            k++;
        }
        while(j <= right){
            temp[k] = Arr[j];
            j++;
            k++;
        }
        for(k = left; k <= right; k++){
            Arr[k] = temp[k];
        }

    }
    public static void IntMergeSortHelper(int[] elements, int from, int to, int[] temp){
        if(from < to){
            int middle = (from + to) / 2;
            IntMergeSortHelper(elements, from, middle, temp);
            IntMergeSortHelper(elements,middle+1,to,temp);
            IntMerge(elements, from, middle, to, temp);
        }
    }

    public static void IntMergeSort(int[] elements){
        int n = elements.length;
        int[] temp = new int[n];
        IntMergeSortHelper(elements,0,n-1,temp);
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