import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Digite a temperatura em Celsius ou 'exit' para sair: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Programa encerrado. Até logo!");
                break;
            } try {
                double temperatureCelsius = Double.parseDouble(input);
                double temperatureFahrenheit = convertToCelsius(temperatureCelsius);
                System.out.println("Temperatura " + input + "ºC " + "são " + temperatureFahrenheit + "°F");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número ou 'exit' para sair.");
            }
        }

        scanner.close();
    }

    private static double convertToCelsius(double celsius) {
        double factor1 = 9.0 / 5.0;
        double factor2 = 32.0;

        return (celsius * factor1) + factor2;
    }
}
