import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {

        System.out.println("Kayque dos Santos Almeida / RA: 4231923060.");

        Scanner scanner = new Scanner(System.in);

        double n1, n2;
        char operador;

        System.out.print("Digite o primeiro número: ");
        n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número(em caso de ^ sera o expoente): ");
        n2 = scanner.nextDouble();

        System.out.print("Escolha uma das operações: + , - , * , / , ^: ");
        operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                double soma = n1 + n2;
                System.out.printf("\n Resultado = %.2f", soma);
                break;

            case '-':
                double sub = n1 - n2;
                System.out.printf("\n Resultado = %.2f", sub);
                break;

            case '*':
                double mult = n1 * n2;
                System.out.printf("\n Resultado = %.2f", mult);
                break;

            case '/':
                double div = n1 / n2;
                System.out.printf("\n Resultado = %.2f", div);
                break;

            case '^':
                double pot = Math.pow(n1, n2);
                System.out.printf("\n Resultado = %.2f", pot);
                break;

            default:
                System.out.println("Operador Inválido!");
        }
        scanner.close();
    }

}
