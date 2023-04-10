import java.util.Scanner;

public class IdealWeight {
    public static void main(String[] args) throws Exception {
        double height;
        double idealWeight;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        height = keyboard.nextDouble();

        idealWeight = (72.7 * height) - 58;

        idealWeight = Math.round(idealWeight * 100.0) / 100.0;

        System.out.println("Seu peso ideal é: " + idealWeight);

        keyboard.close();
    }
}
