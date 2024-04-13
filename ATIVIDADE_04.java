import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entre0e100 = 0;
        int entre101e200 = 0;
        int maiores200 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + " numero: ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                entre0e100++;
            } else if (numero >= 101 && numero <= 200) {
                entre101e200++;
            } else {
                maiores200++;
            }
        }

        System.out.println("Quantidade de numeros entre 0 e 100: " + entre0e100);
        System.out.println("Quantidade de numeros entre 101 e 200: " + entre101e200);
        System.out.println("Quantidade de numeros maiores que 200: " + maiores200);

        scanner.close();
    }
}
