package DescriptionInsertionSort;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DescriptionInsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lí size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length;i++){
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nInsertion sort processing...");insertSort(list);
    }

    public static void insertSort(int [] list){
        for (int i = 1; i < list.length; i++){
            int  temp = list[i];
            int  j = i - 1 ;
            for  (j = j -1; j >= 0 && list[j] > temp; j--) {
                list [j + 1] = list [j];
                System.out.println();
            }
            list [j + 1] = temp;
        }
        System.out.println(Arrays.toString(list) + "insertSort");
    }

}
