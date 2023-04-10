import java.util.Scanner;

public class MetersToCentimeters {
    public static void main(String[] args) throws Exception {
        double meters;
        double result;
        String message;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Digite um valor em metros para ser convertido em centímetros: ");

        meters = keyboard.nextDouble();

        result = meters * 100;

        message = "O valor " + meters + "m em centímetros é: " + result + "cm";

        System.out.println(message);

        keyboard.close();
    }
}
