import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) throws Exception {
        double hourValue;
        double workHours;
        double totalSalary;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite quanto você ganha por hora trabalhada: ");

        hourValue = keyboard.nextDouble();

        System.out.println("Agora digite quantas horas você trabalha por mês: ");

        workHours = keyboard.nextDouble();

        totalSalary = hourValue * workHours;

        System.out.println("O seu salário total nesse mês é: R$ " + totalSalary);

        keyboard.close();
    }
}
