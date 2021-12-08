import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        try (Scanner Input = new Scanner(System.in)) {
            System.out.println("Informe o valor da base maior:");
            Double b1 = Input.nextDouble();

            System.out.println("Informe o valor da base menor:");
            Double b2 = Input.nextDouble();

            System.out.println("Informe o valor da altura:");
            Double h = Input.nextDouble();

            Double area = ((b1 + b2) * h) / 2;

            System.out.println("O valor da base maior é: " + b1 + "\nO valor da base menor é: " + b2
                    + "\nO valor da altura é: " + h + "\nO resultado da área é: " + area);
        }
    }
}