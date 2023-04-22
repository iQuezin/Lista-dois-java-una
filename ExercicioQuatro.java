import java.util.Scanner;

public class ExercicioQuatro {

    public static void main(String[] args) {

        System.out.println("Kayque dos Santos Almeida / RA: 4231923060.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("1: calcular o perímetro do círculo.");
        System.out.println("2: calcular a área do círculo.");
        System.out.println("3: calcular o volume da esfera.");
        System.out.print("Qual operação deseja fazer?");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.print("Digite o raio do circulo / esfera: ");
                double raiop = scanner.nextDouble();
                double perimetro = 2 * 3.14 * raiop;
                System.out.printf("\n Perimetro = %.2f", perimetro);
                break;

            case 2:
                System.out.print("Digite o raio do circulo / esfera: ");
                double raioa = scanner.nextDouble();
                double area = 3.14 * Math.pow(raioa, 2);
                System.out.printf("\n Área = %.2f", area);
                break;

            case 3:
                System.out.print("Digite o raio do circulo / esfera: ");
                double raiov = scanner.nextDouble();
                double volume = 4 / 3 * 3.14 * Math.pow(raiov, 3);
                System.out.printf("\n Volume = %.2f", volume);
                break;

            default:
                System.out.println("O código da operação é inválido!");
        }
        scanner.close();
    }

}
