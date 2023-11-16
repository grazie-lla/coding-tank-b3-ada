public class ExercicioQuatro {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Número inválido de argumentos. É esperado que seja informado exatamente um argumento.");
        } else {
            int number = Integer.parseInt(args[0]);
            checkEvenOdd(number);
        }
    }

    private static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " é um número par.");
        } else {
            System.out.println(number + " é um número ímpar.");
        }
    }
}
