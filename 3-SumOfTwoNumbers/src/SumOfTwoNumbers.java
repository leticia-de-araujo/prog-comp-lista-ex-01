import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) throws Exception {
        double number1;
        double number2;

        String message;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite um número: ");

        number1 = keyboard.nextDouble();

        System.out.println("Digite o segundo número: ");

        number2 = keyboard.nextDouble();

        double sum = number1 + number2;

        message = "A soma dos números é: " + sum;

        System.out.println(message);

        keyboard.close();
    }
}
