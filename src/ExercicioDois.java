import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] grades = new double[4];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = getGrade(scanner, i + 1);
            if (!isGradeValid(grades[i])) {
                System.out.println("Valor inválido. Encerrando o programa.");
                return;
            }
        }

        double average = calculateAverage(grades);

        System.out.println("A média do aluno foi " + average);

        scanner.close();
    }

    private static double getGrade(Scanner scanner, int examNumber) {
        System.out.print("Informe a nota prova " + examNumber + ": ");
        return scanner.nextDouble();
    }

    private static boolean isGradeValid(double grade) {
        return grade >= 0 && grade <= 10;
    }

    private static double calculateAverage(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

}
