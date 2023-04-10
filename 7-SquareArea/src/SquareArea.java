import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) throws Exception {
        double squareSide;
        double area;
        double doubleArea;
        String message;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Digite o valor do lado do quadrado: ");

        squareSide = keyboard.nextDouble();

        area = squareSide * squareSide;

        doubleArea = area * 2;

        message = "A área do quadrado é: " + area + " e o dobro da área é: " + doubleArea;

        System.out.println(message);

        keyboard.close();
    }
}
