import java.util.Scanner;

public class IdealWeightTwo {
    public static void main(String[] args) throws Exception {
        double height;
        double idealWeightForWomen;
        double idealWeightForMen;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        height = keyboard.nextDouble();

        idealWeightForMen = (72.7 * height) - 58;

        idealWeightForWomen = (62.1 * height) - 44.7;

        idealWeightForMen = Math.round(idealWeightForMen * 100.0) / 100.0;
        idealWeightForWomen = Math.round(idealWeightForWomen * 100.0) / 100.0;

        System.out.println("Peso ideal para homens: " + idealWeightForMen + " kg.") ;
        System.out.println("Peso ideal para mulheres: " + idealWeightForWomen + " kg.");

        keyboard.close();
    }
}
