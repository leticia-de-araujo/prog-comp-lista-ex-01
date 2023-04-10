import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) throws Exception {
        double temperatureInFahrenheit;
        double temperatureInCelsius;
        String formattedTemperatureInCelsius;
        String formattedTemperatureInFahrenheit;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Programa de Conversão de Temperatura em Celsius para Fahrenheit");

        System.out.println("Digite a temperatura em Celsius: ");

        temperatureInCelsius = keyboard.nextDouble();

        temperatureInFahrenheit = temperatureInCelsius * 1.8 + 32;
        
        formattedTemperatureInCelsius = String.format("%.02f", temperatureInCelsius);
        formattedTemperatureInFahrenheit = String.format("%.02f", temperatureInFahrenheit);

        System.out.println("A temperatura " + formattedTemperatureInCelsius + " Celsius equivale a: "
                + formattedTemperatureInFahrenheit + " Fahrenheit.");
        
       keyboard.close();
    }
}
