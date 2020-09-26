package Palindrom;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        System.out.print("Nhập vào chỗi cần kiểm tra: ");
        Scanner in = new Scanner(System.in);
        String inputStrinng = in.nextLine();
        Queue queue = new LinkedList();
        for (int i = inputStrinng.length()-1;i >= 0;i--){
            queue.add(inputStrinng.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()){
            reverseString = reverseString + queue.remove();
        }
        if (inputStrinng.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng.");
        else
            System.out.println("Đây không phải là chuỗi đối xứng");
    }
}
