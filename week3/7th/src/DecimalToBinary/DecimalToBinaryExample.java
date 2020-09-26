package DecimalToBinary;

import java.util.Stack;

public class DecimalToBinaryExample {
    public void convertBinary(int num){
        Stack<Integer> stack = new Stack<Integer>();
        while (num != 0){
            int d = num%2;
            stack.push(d);
            num/=2;
        }
        while ((!(stack.isEmpty()))){
            System.out.println(stack.pop());
        }
    }
}
