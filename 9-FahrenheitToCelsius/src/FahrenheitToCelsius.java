import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) throws Exception {
        double temperatureInFahrenheit;
        double temperatureInCelsius;
        String formattedTemperatureInCelsius;
        String formattedTemperatureInFahrenheit;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Programa de Conversão de Temperatura em Fahrenheit para Celsius");

        System.out.println("Digite a temperatura em Fahrenheit: ");

        temperatureInFahrenheit = keyboard.nextDouble();
        
        temperatureInCelsius = 5 * ((temperatureInFahrenheit - 32) / 9);
        
        formattedTemperatureInCelsius = String.format("%.02f", temperatureInCelsius);
        formattedTemperatureInFahrenheit = String.format("%.02f", temperatureInFahrenheit);

        System.out.println("A temperatura " + formattedTemperatureInFahrenheit + " Fahrenheit equivale a: "
                + formattedTemperatureInCelsius + " Celsius.");
        
       keyboard.close();
    }
}
