package BinarySearch;

import static BinarySearch.BinarySearch.binarySearch;
import static BinarySearch.BinarySearch.list;

public class Main {
    public static void main(String[] args) {
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,11));
        System.out.println(binarySearch(list,79));
        System.out.println(binarySearch(list,1));
        System.out.println(binarySearch(list,5));
        System.out.println(binarySearch(list,80));
    }
}
