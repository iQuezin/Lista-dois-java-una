import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {

        System.out.println("Kayque dos Santos Almeida / RA: 4231923060.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numeroUm = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numeroDois = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numeroTres = scanner.nextDouble();

        double maior = numeroUm;
        double menor = numeroUm;
        double media = (numeroUm + numeroDois + numeroTres) / 3;

        if (numeroDois > maior) {
            maior = numeroDois;
        }
        if (numeroTres > maior) {
            maior = numeroTres;
        }

        if (numeroDois < menor) {
            menor = numeroDois;
        }
        if (numeroTres < menor) {
            menor = numeroTres;
        }

        System.out.printf("\nMaior Número: %.0f", maior);
        System.out.printf("\nMenor Número: %.0f ", menor);
        System.out.printf("\nMédia: %.0f", media);

        scanner.close();
    }

}
