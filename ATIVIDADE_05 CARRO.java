public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("O carro esta ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("O carro esta desligado.");
    }

    public void acelerar() {
        if (ligado) {
            System.out.println("O carro esta acelerando.");
        } else {
            System.out.println("Nao e possivel acelerar. O carro esta desligado.");
        }
    }

    public void frear() {
        if (ligado) {
            System.out.println("O carro esta freando.");
        } else {
            System.out.println("Nao e possivel frear. O carro esta desligado.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
 
