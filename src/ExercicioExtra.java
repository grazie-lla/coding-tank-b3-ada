import java.util.Scanner;

public class ExercicioExtra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro:");
        int number = scanner.nextInt();

        drawTriangle(number);

        scanner.close();
    }

    private static void drawTriangle(int number) {
        for (int row = number; row >= 1; row--) {
            for (int asterisks = 1; asterisks <= row; asterisks++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
