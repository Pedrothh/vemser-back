public class ContaPoupanca extends Conta implements Impressao{
    static final double JUROS_MENSAL = 1.01;

    public ContaPoupanca() {
    }

    public ContaPoupanca(Cliente cliente, String numeroConta, String agencia, double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }

    public void creditarTaxa(){
        setSaldo(getSaldo() * JUROS_MENSAL);
    }

    @Override
    public void imprimir() {
        System.out.println( "Conta {cliente=" + getCliente().getNome() + 
                            ", numeroConta=" + getNumeroConta() + ", agencia=" + getAgencia() + ", saldo=" + getSaldo() + 
                            "}");
    }
}
