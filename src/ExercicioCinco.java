import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {
        if (args.length == 0) {
            requestNumbersViaConsole();
        } else if (args.length == 1) {
            double number1 = Double.parseDouble(args[0]);
            System.out.println("Somente um número foi fornecido. Digite o segundo número:");
            double number2 = requestSecondNumberViaConsole();
            double result = sumNumbers(number1, number2);
            System.out.println("A Soma de " + number1 + " e " + number2 + " é: " + result);
        } else if (args.length == 2) {
            double number1 = Double.parseDouble(args[0]);
            double number2 = Double.parseDouble(args[1]);
            double result = sumNumbers(number1, number2);
            System.out.println("A Soma de " + number1 + " e " + number2 + " é: " + result);
        } else {
            System.out.println("Quantidade inválida de parâmetros. O programa aceita 0, 1 ou 2 parâmetros.");
        }
    }

    private static void requestNumbersViaConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double number1 = scanner.nextDouble();

        double number2 = requestSecondNumberViaConsole();

        double result = sumNumbers(number1, number2);

        System.out.println("A Soma de " + number1 + " e " + number2 + " é: " + result);

        scanner.close();
    }

    private static double requestSecondNumberViaConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o segundo número:");
        double number2 = scanner.nextDouble();
        scanner.close();
        return number2;
    }

    private static double sumNumbers(double number1, double number2) {
        return number1 + number2;
    }
}
