package OptionalBinarySearch;

import BinarySearch.BinarySearch;

import java.util.Scanner;

public class Optional {
    int binarySearch(int array [], int x, int low, int hight){

        if (hight >= low){
            int mid = low + (hight - low) / 2;
        if (array[mid] == x)
            return mid;
        if (array[mid] > x)
            return binarySearch(array, x, low, mid - 1);
        if (array[mid] < x)
            return binarySearch(array, x, mid + 1, hight);

        }
        return -1;
    }
    public static void main(String[] args) {
    Optional ob = new Optional()  ;
    int array[] = {3,4,5,6,7,8,9};
    int n = array.length;
    int x = 4;
    int result = ob.binarySearch(array, x, 0, n - 1);
    if (result == -1)
        System.out.println("Not found");
    else
        System.out.println("Element found at index " + result);
    }
}
