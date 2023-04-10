import java.util.Scanner;

public class CircleRadius {
    public static void main(String[] args) throws Exception {
        double radius;
        double result;
        String message;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Digite o valor do raio do círculo: ");

        radius = keyboard.nextDouble();

        result = Math.PI * Math.pow(radius, 2);

        result = Math.round(result * 100) / 100.0;

        message = "A área do círculo é: " + result;

        System.out.println(message);

        keyboard.close();
    }
}
