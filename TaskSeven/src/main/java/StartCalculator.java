import java.util.Scanner;

public class StartCalculator {
    public static void main(String[] args) {
        Scanner get_int = new Scanner(System.in);
        Scanner get_String = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println ("Введите первое число");
        int firstNum = get_int.nextInt();
        System.out.println ("Введите второе число");
        int secondNum = get_int.nextInt();
        System.out.println ("Выберите операцию:\n+  -  *  /");
        String operation = get_String.nextLine();

        int check = 0;
        while (check == 0) {
            if (!operation.equals("*") && !operation.equals("/") && !operation.equals("+") && !operation.equals("-")) {
                System.out.println("Операции не существует");
                System.out.println ("Выберите операцию:\n+  -  *  /");
                operation = get_String.nextLine();
            }
            else check = 1;
        }

        switch(operation) {
            case "+":
                calculator.addition(firstNum, secondNum);
                break;
            case "-":
                calculator.subtraction(firstNum, secondNum);
                break;
            case "*":
                calculator.multiplication(firstNum, secondNum);
                break;
            case "/":
                calculator.division(firstNum, secondNum);
                break;
        }
    }
}
