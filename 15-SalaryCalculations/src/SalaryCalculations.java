import java.util.Scanner;

public class SalaryCalculations {
    public static void main(String[] args) throws Exception {
        double salaryPerHour, hoursWorked, grossSalary, liquidSalary, ir, inss, syndicate;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        salaryPerHour = keyboard.nextDouble();
        

        System.out.println("Quantas horas você trabalhou no mês?");
        hoursWorked = keyboard.nextDouble();

        grossSalary = salaryPerHour * hoursWorked;
        ir = grossSalary * 0.11;
        inss = grossSalary * 0.08;
        syndicate = grossSalary * 0.05;
        liquidSalary = grossSalary - ir - inss - syndicate;

        grossSalary = Math.round(grossSalary * 100.0) / 100.0;
        ir = Math.round(ir * 100.0) / 100.0;
        inss = Math.round(inss * 100.0) / 100.0;
        syndicate = Math.round(syndicate * 100.0) / 100.0;
        liquidSalary = Math.round(liquidSalary * 100.0) / 100.0;
        
        System.out.println("Salário Bruto: R$ " + grossSalary);
        System.out.println("IR: R$ " + ir);
        System.out.println("INSS: R$ " + inss);
        System.out.println("Sindicato: R$ " + syndicate);
        System.out.println("Salário Líquido: R$ " + liquidSalary);

        keyboard.close();
    }
}
