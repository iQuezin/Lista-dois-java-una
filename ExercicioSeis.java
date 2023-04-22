import java.util.Scanner;
import java.util.Random;

public class ExercicioSeis {

    public static void main(String[] args) {

        System.out.println("Kayque dos Santos Almeida / RA: 4231923060.");

        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        int maior, menor;

        if (n1 > n2) {
            maior = n1;
            menor = n2;
        } else {
            maior = n2;
            menor = n1;
        }

        int sorte = gerador.nextInt(menor, maior);
        System.out.println("Número sorteado: " + sorte);

        if (sorte % 2 == 0) {
            System.out.println("O número é PAR");
        } else {
            System.out.println("O número é IMPAR");
        }
        scanner.close();
    }

}
