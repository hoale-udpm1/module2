import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        System.out.println("Nhập sô :");
        Scanner scanner = new Scanner(System.in);
        Short number = scanner.nextShort();
        boolean isGreaterThanorEqualZero = (number >= 0);
        boolean isLessThan10 = (number < 10);
        boolean isGreaterThanorEqual10 = (number >= 10);
        boolean isLessThan20 = (number < 20);
        boolean isGreaterThanOrEqual20 = (number >= 20);
        boolean isLessThan100 = (number < 100);
        boolean isGreaterThanorEqual100 = (number >= 100);
        boolean isLessThan1000 = (number < 1000);

        if (isGreaterThanorEqualZero && isLessThan10){
            switch (number){
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }

        }else if (isGreaterThanorEqual10 && isLessThan20){
            int numberMinus10 = number -10;
            switch (numberMinus10){
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fiveteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        }else if (isGreaterThanOrEqual20 && isLessThan100){
            int tens = number / 10;
            int ones = number % 10;
            switch (tens){
                case 2:
                    System.out.println("twenty");
                    break;
                case 3:
                    System.out.println("thirty");
                    break;
                case 4:
                    System.out.println("fourty");
                    break;
                case 5:
                    System.out.println("fivety");
                    break;
                case 6:
                    System.out.println("sixty");
                    break;
                case 7:
                    System.out.println("seventy");
                    break;
                case 8:
                    System.out.println("eighty");
                    break;
                case 9:
                    System.out.println("ninety");
                    break;
            }
            switch (ones){
                case 0:
                    System.out.print(" ");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        }else if(isGreaterThanorEqual100 && isLessThan1000){
            int hundreds = number / 100;
            int tens = number % 100 / 10;
            int ones = number % 100 % 10;
            switch (hundreds){
                case 1:
                    System.out.print("one hundred");
                    break;
                case 2:
                    System.out.print("two hundred");
                    break;
                case 3:
                    System.out.print("three hundred");
                    break;
                case 4:
                    System.out.print("four hundred");
                    break;
                case 5:
                    System.out.print("five hundred");
                    break;
                case 6:
                    System.out.print("six hundred");
                    break;
                case 7:
                    System.out.print("seven hundred");
                    break;
                case 8:
                    System.out.print("eight hundred");
                    break;
                case 9:
                    System.out.print("nine hundred");
                    break;
            }
            switch (tens){
                case 0:
                    System.out.print(" ");
                    break;
                case 1:
                    switch (ones){
                        case 0:
                            System.out.println(" ten");
                            break;
                        case 1:
                            System.out.println(" eleven");
                            break;
                        case 2:
                            System.out.println(" twelve");
                            break;
                        case 3:
                            System.out.println(" thirteen");
                            break;
                        case 4:
                            System.out.println(" fourteen");
                            break;
                        case 5:
                            System.out.println(" fiveteen");
                            break;
                        case 6:
                            System.out.println(" sixteen");
                            break;
                        case 7:
                            System.out.println(" seventeen");
                            break;
                        case 8:
                            System.out.println(" eightteen");
                            break;
                        case 9:
                            System.out.println(" nighteen");
                            break;
                    }
                    break;
                case 2:
                    System.out.print(" twenty");
                    break;
                case 3:
                    System.out.print(" thirty");
                    break;
                case 4:
                    System.out.print(" fourty");
                    break;
                case 5:
                    System.out.print(" fivety");
                    break;
                case 6:
                    System.out.print(" sixty");
                    break;
                case 7:
                    System.out.print(" seventy");
                    break;
                case 8:
                    System.out.print(" eighty");
                    break;
                case 9:
                    System.out.print(" ninety");
                    break;
            }
            if(tens != 1)
                switch (ones){
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print(" one");
                        break;
                    case 2:
                        System.out.print(" two");
                        break;
                    case 3:
                        System.out.print(" three");
                        break;
                    case 4:
                        System.out.print(" four");
                        break;
                    case 5:
                        System.out.print(" five");
                        break;
                    case 6:
                        System.out.print(" six");
                        break;
                    case 7:
                        System.out.print(" seven");
                        break;
                    case 8:
                        System.out.print(" eight");
                        break;
                    case 9:
                        System.out.print(" nine");
                        break;
                }
        }
    }
}
