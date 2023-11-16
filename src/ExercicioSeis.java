import java.util.Scanner;

public class ExercicioSeis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual operação deseja fazer? (opções: + - / *)");
        char operation = scanner.next().charAt(0);

        System.out.println("Informe o primeiro número:");
        int number1 = scanner.nextInt();

        System.out.println("Informe o segundo número:");
        int number2 = scanner.nextInt();

        performOperation(operation, number1, number2);

        scanner.close();
    }

    private static void performOperation(char operation, int number1, int number2) {
        int result = 0;

        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Não é possível dividir por zero. Programa encerrado.");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Operação desconhecida. Programa encerrado.");
                System.exit(0);
        }

        System.out.println("Resultado da operação: " + result);
    }
}
