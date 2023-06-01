import java.util.Scanner;

public class ShopPaint2 {
    public static void main(String[] args) throws Exception {
        final double coveragePerLiter = 6.0;
        final double litersPerCan = 18.0;
        final double litersPerGallon = 3.6;
        final double pricePerCan = 80.0;
        final double pricePerGallon = 25.0;
        final double slack = 0.1;
        double areaSize;
        double cans;
        double gallons;
        double priceCans;
        double priceGallons;
        double remainingArea;
        double mixedPrice;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite o tamanho em metros quadrados da área a ser pintada:");
        areaSize = keyboard.nextDouble();

        areaSize += areaSize * slack;

        cans = Math.ceil(areaSize / (coveragePerLiter * litersPerCan));
        gallons = Math.ceil(areaSize / (coveragePerLiter * litersPerGallon));

        priceCans = cans * pricePerCan;
        priceGallons = gallons * pricePerGallon;

        System.out.println("Apenas latas: " + (int)cans + " latas. Preço: R$" + priceCans);
        System.out.println("Apenas galões: " + (int)gallons + " galões. Preço: R$" + priceGallons);

        cans = Math.floor(areaSize / (coveragePerLiter * litersPerCan));
        remainingArea = areaSize - (cans * litersPerCan * coveragePerLiter);
        gallons = Math.ceil(remainingArea / (coveragePerLiter * litersPerGallon));

        mixedPrice = (cans * pricePerCan) + (gallons * pricePerGallon);
        System.out.println("Misto: " + (int) cans + " latas e " + (int) gallons + " galões. Preço: R$" + mixedPrice);
        
        keyboard.close();
    }
}
