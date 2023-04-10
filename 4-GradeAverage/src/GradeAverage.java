import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) throws Exception {
        double grade1;
        double grade2;
        double grade3;
        double grade4;
        double sum;
        double average;
        String formattedAverage;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Programa de cálculo da média das avaliações bimestrais");

        System.out.println("Digite sua primeira nota: ");
        grade1 = keyboard.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        grade2 = keyboard.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        grade3 = keyboard.nextDouble();

        System.out.println("Digite sua quarta nota: ");
        grade4 = keyboard.nextDouble();

        sum = grade1 + grade2 + grade3 + grade4;
        average = sum / 4;

        formattedAverage = String.format("%.02f", average);

        System.out.println("A média aritmética das suas notas nas avaliações é de: " + formattedAverage);

        keyboard.close();
    }
}
