import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner Input = new Scanner(System.in)) {
            System.out.println("Informe o valor de A (Número com x²):");
            Double a = Input.nextDouble();

            System.out.println("Informe o valor de B (Numero com x):");
            Double b = Input.nextDouble();

            System.out.println("Informe o valor de C (número):");
            Double c = Input.nextDouble();

            Double delta = Math.pow(b, 2) - 4 * a * c;

            Double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            Double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("O valor de A (Número com x²) é: " + a + "\nO valor de B (Numero com x) é: " + b
                    + "\nO valor de C (número) é: " + c + "\nO resultado de Delta é: " + delta
                    + "\nO valor de X1 (Raiz de Delta Negativo) é: " + x1
                    + "\nO valor de X1 (Raiz de Delta Positivo) é: " + x2);
        }
    }
}
