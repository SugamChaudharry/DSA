//4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
//        (Use if conditions)
/* import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
        // (Use if conditions)
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num1 = input.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        String operator = input.next();

        System.out.print("Enter number: ");
        int num2 = input.nextInt();

        if (operator.equals("+")) {
            System.out.print(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.print(num1 - num2);
        } else if (operator.equals("*")) {
            System.out.print(num1 * num2);
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                System.out.print(num1 / num2);
            } else {
                System.out.print("Cannot divide by zero!");
            }
        } else {
            System.out.print("Invalid operator!");
        }
    }
}*/
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
        // (Use switch statement)
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num1 = input.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        String operator = input.next();

        System.out.print("Enter number: ");
        int num2 = input.nextInt();

       /*  int result;

       switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.print("Cannot divide by zero!");
                    return;
                }
                break;
            default:
                System.out.print("Invalid operator!");
                return;
        }
*/          int result = switch (operator) {
            case "+":
                yield num1 + num2;
            case "-":
                yield num1 - num2;
            case "*":
                yield num1 * num2;
            case "/":
                if (num2 != 0) {
                    yield num1 / num2;
                } else {
                    System.out.print("Cannot divide by zero!");
                    yield 0; // or any default value if you prefer
                }
            default:
                System.out.print("Invalid operator!");
                yield 0; // or any default value if you prefer
        };
        System.out.print(result);
    }
}

