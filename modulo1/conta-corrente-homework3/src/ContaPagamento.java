public class ContaPagamento extends Conta implements Impressao{
    static final double TAXA_SAQUE = 4.25;

    public ContaPagamento() {
    }

    public ContaPagamento(Cliente cliente, String numeroConta, String agencia, double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor + TAXA_SAQUE > getSaldo()) {
            System.out.println("Atenção, saldo mínimo de R$ 4,25 para realizar saques com Conta de Pagamento!");
            return false;
        }
        if (valor < 0) {
            System.out.println("Não pode sacar valores negativos.");
            return false;
        }
        setSaldo(getSaldo() - (valor + TAXA_SAQUE));
        System.out.println("Saque de Conta Pagamento! Sacado R$" +  valor + " da conta de " + getCliente().getNome());
        return true;
    }

    @Override
    public boolean transferir(Conta conta, double valor){
        System.out.println("Tentativa de Transferência de valores...");
        if (super.sacar(valor)){
            conta.depositar(valor);
            System.out.println("Transferencia OK - Transferido R$ " + valor + " de " + this.getCliente().getNome() + " para " + conta.getCliente().getNome());
            return true;
        } else {
            System.out.println("Não pode transferir valores negativos.");
            return false;
        }
    }
    @Override
    public void imprimir() {
        System.out.println( "Conta {cliente=" + getCliente().getNome() + 
                            ", numeroContaPagamento=" + getNumeroConta() + ", agencia=" + getAgencia() + ", saldo=" + getSaldo() +
                            "}");
    }
}
