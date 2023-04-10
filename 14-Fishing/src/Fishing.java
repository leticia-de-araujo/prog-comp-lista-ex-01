import java.util.Scanner;

public class Fishing {
    public static void main(String[] args) throws Exception {
        double fishWeight;
        double excess;
        double fine;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Digite o peso dos peixes em kg: ");
        fishWeight = keyboard.nextDouble();

        if (fishWeight > 50) {
            excess = fishWeight - 50;
            fine = excess * 4;

            fine = Math.round(fine * 100.0) / 100.0;
            excess = Math.round(excess * 100.0) / 100.0;

            System.out.println("O peso dos peixes é de " + fishWeight + " kg.");
            System.out.println("O peso excedente é de " + excess + " kg.");
            System.out.println("O valor da multa é de R$ " + fine + ".");
        } else {
            System.out.println("O peso dos peixes é de " + fishWeight + " kg.");
            System.out.println("O peso excedente é de 0 kg.");
            System.out.println("O valor da multa é de R$ 0,00.");
        }

        keyboard.close();
    }
}
