public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        Conta cc = new ContaCorrente(new Cliente());
        Conta poupanca = new ContaPoupanca(new Cliente());
        banco.adiciona(cc);
        banco.adiciona(poupanca);
        banco.listaClientes();
        cc.depositar(1000);
        cc.transferir(150, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}