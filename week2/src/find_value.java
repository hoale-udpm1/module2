import java.util.Scanner;

public class find_value {
    public static void main(String[] args) {
       //khai báo mảng
       String[] students =  {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
       //khai báo biến lưu tên tìm kiesm và gán giá trị nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's sudent:");
        String input_name = scanner.nextLine();
        //duyệt mảng đã khai báo
        boolean isExist = false;
        for (int i =0; i< students.length;i++){
         if (students[i].equals(input_name)){
             System.out.println("Position of the students in the list "+ input_name + "is: " + (i+1));
             isExist = true;
             break;
         }
        }

        if (!isExist)
        System.out.println("Not found" + input_name + "in the list");
    }
}
