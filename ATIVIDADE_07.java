import java.util.Scanner;

public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int quantidadeEmEstoque;

    
    public Produto(int codigo, String descricao, double preco, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o codigo do produto:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite a descricao do produto:");
        String descricao = scanner.nextLine();

        System.out.print("Digite o preco do produto:");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque do produto:");
        int quantidadeEmEstoque = scanner.nextInt();

        
        Produto produto = new Produto(codigo, descricao, preco, quantidadeEmEstoque);

        
        System.out.println("Codigo: " + produto.getCodigo());
        System.out.println("Descricao: " + produto.getDescricao());
        System.out.println("Preco: R$" + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());

        
        System.out.print("Digite a quantidade a adicionar ao estoque:");
        int quantidadeAdicionar = scanner.nextInt();
        produto.adicionarEstoque(quantidadeAdicionar);

        
        System.out.print("Digite a quantidade a remover do estoque:");
        int quantidadeRemover = scanner.nextInt();
        boolean remocaoBemSucedida = produto.removerEstoque(quantidadeRemover);
        if (remocaoBemSucedida) {
            System.out.println("Remocao do estoque realizada com sucesso.");
        } else {
            System.out.println("Erro: Estoque insuficiente para remover essa quantidade.");
        }

        
        System.out.print("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());

        scanner.close();
    }

    
    public void adicionarEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
    }

    public boolean removerEstoque(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            return true; 
        } else {
            return false; 
        }
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
