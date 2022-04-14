public class Main {
    public static void main(String[] args) {
        Cliente alemcar = new Cliente();
        alemcar.setNome("Alemcar");

        Conta cc = new ContaCorrente(alemcar);
        Conta poupanca = new ContaPoupanca(alemcar);

        cc.depositar(10000);
        cc.transferir(5000, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
