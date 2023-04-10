import java.util.Scanner;

public class ShowNumber {
    public static void main(String[] args) throws Exception {
        double number;
        String message;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite um número: ");

        number = keyboard.nextDouble();

        message = "O número informado foi " + number;

        System.out.println(message);
        
        keyboard.close();
    }
}
