import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o numero inicial de patinhos: ");
        int numPatinhos = scanner.nextInt();

        
        for (int i = numPatinhos; i > 0; i--) {
            if (i == 1) {
                System.out.println("1 patinho foi passear");
            } else {
                System.out.println(i + " patinhos foram passear");
            }
            System.out.println("Alem das montanhas");
            System.out.println("Para brincar");
            System.out.println("A mamae gritou: Qua, qua, qua, qua");
            if (i > 1) {
                System.out.println("Mas so " + (i - 1) + " patinhos voltaram de la\n");
            } else {
                System.out.println("E os patinhos voltaram de la\n");
            }
        }

        
        System.out.println("A mamae patinha foi procurar");
        System.out.println("Alem das montanhas");
        System.out.println("Na beira do mar");
        System.out.println("A mamae gritou: Qua, qua, qua, qua");
        System.out.println("E todos os patinhos voltaram de la.");

        scanner.close();
    }
}
