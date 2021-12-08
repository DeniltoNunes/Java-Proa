import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor da Primeira Diagonal:");
        Double d1 = input.nextDouble();

        System.out.println("Informe o valor da Segunda Diagonal:");
        Double d2 = input.nextDouble();

        Double al = (d1 * d2) / 2;

        System.out.println("O valor da primeira diagonal é: " + d1 + "\nO valor da segunda diagonal é: " + d2
                + "\nA área do Losango é: " + al);
    }
}