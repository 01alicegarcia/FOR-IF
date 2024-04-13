import java.util.Scanner;

public class ContaBancaria {
    private double saldo;
    private String numeroConta;


    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0; 
    }

    
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
    }

    
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: Saldo insuficiente para realizar o saque.");
        }
    }

    
    public double consultarSaldo() {
        return saldo;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero da conta: ");
        String numeroConta = scanner.nextLine();

        
        ContaBancaria conta = new ContaBancaria(numeroConta);

        System.out.print("Digite o valor para depositar: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        System.out.print("Digite o valor para sacar: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

    
        double saldoAtual = conta.consultarSaldo();
        System.out.println("Saldo atual da conta: R$" + saldoAtual);

        scanner.close();
    }
}
