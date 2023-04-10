import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) throws Exception {
        int num1;
        int num2;
        double num3;
        double result1;
        double result2;
        double result3;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Programa de Cálculos");

        System.out.println("Digite o primeiro número inteiro: ");
        num1 = keyboard.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        num2 = keyboard.nextInt();

        System.out.println("Digite o terceiro número real: ");
        num3 = keyboard.nextDouble();

        result1 = (num1 * 2) * (num2 / 2);
        result2 = (num1 * 3) + num3;
        result3 = Math.pow(num3, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + String.format("%.2f", result1));
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + String.format("%.2f", result2));
        System.out.println("O terceiro elevado ao cubo é: " + String.format("%.2f", result3));

        keyboard.close();
    }
}
