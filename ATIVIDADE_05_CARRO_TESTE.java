public class CarroTeste {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022);

        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.desligar();
    }
}
