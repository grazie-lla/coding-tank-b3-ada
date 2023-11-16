import java.util.Scanner;

public class ExercicioUm {

    //Crie um programa que pergunte qual a altura em metros e peso em Kg desta pessoa e retorne o IMC e a classificação deste IMC. IMC = peso / altura x altura;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua altura em metros: ");
        double height = scanner.nextDouble();

        System.out.print("Informe seu peso em kg: ");
        double weight = scanner.nextDouble();

        scanner.close();

        double imc = weight / (height * height);

        String imcClassification;
        if (imc < 17){
            imcClassification = "Muito abaixo do peso";
        }else if (imc < 18.49) {
            imcClassification = "Abaixo do peso";
        } else if (imc < 24.99) {
            imcClassification = "Peso normal";
        } else if (imc < 29.99) {
            imcClassification = "Acima do peso";
        } else if (imc < 34.99) {
            imcClassification = "Obesidade I";
        } else if (imc < 39.99) {
            imcClassification = "Obesidade II (severa)";
        } else {
            imcClassification = "Obesidade III (mórbida)";
        }


        System.out.println("O valor do seu IMC é " + imc + " (considerado " + imcClassification + ")");

    }
}
