
public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("EXTRATO DE CONTA CORRENTE");
        super.imprimirInfoComuns();
    }

}