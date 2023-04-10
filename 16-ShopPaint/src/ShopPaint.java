import java.util.Scanner;

public class ShopPaint {
    public static void main(String[] args) throws Exception {
        double areaSize;
        double paintLiters;
        int paintCans;
        double totalPrice;
        String formattedTotalPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite o tamanho da área a ser pintada, em metros quadrados: ");
        areaSize = keyboard.nextDouble();

        paintLiters = areaSize / 3;

        paintCans = (int) Math.ceil(paintLiters / 18);

        totalPrice = paintCans * 80;

        formattedTotalPrice = String.format("%.02f", totalPrice);

        System.out.println("Quantidade de latas de tinta a serem compradas: " + paintCans);
        System.out.println("Preço total: R$ " + formattedTotalPrice);

        keyboard.close();
    }
}
