import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {

        System.out.println("Kayque dos Santos Almeida / RA: 4231923060.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número A: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o número B: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o número C: ");
        double c = scanner.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente");
        } else if (a == 0) {
            double raiz = -c / b;
            System.out.println("Essa é uma equação de primeiro grau");
            System.out.printf("\nRaiz = %.1f", raiz);
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Não possui raizes reais!");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("Esta equação possui duas raizes iguais");
                System.out.println("Raiz 1 = " + raiz);
                System.out.println("Raiz 2 = " + raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("\n x1 = %.2f", raiz1);
                System.out.printf("\n x2 = %.2f", raiz2);
            }
        }
        scanner.close();
    }

}
