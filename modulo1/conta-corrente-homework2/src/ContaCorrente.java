public class ContaCorrente extends Conta implements Impressao {
    private double chequeEspecial;
    
    public ContaCorrente() {
    }

    public ContaCorrente(Cliente cliente, String numeroConta, String agencia, double saldo, double chequeEspecial) {
        super(cliente, numeroConta, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public double retornarSaldoComChequeEspecial() {
        return getSaldo() + this.chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0 || valor > retornarSaldoComChequeEspecial()) {
            System.out.println("Não pode sacar valores negativos!");
            return false;
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de Conta Corrente! Sacado R$" +  valor + " da conta de " + getCliente().getNome());
            return true;
        }
    }

    @Override
    public void imprimir() {
        System.out.println( "Conta {cliente=" + getCliente().getNome() + 
                            ", numeroConta=" + getNumeroConta() + ", agencia=" + getAgencia() + ", saldo=" + getSaldo() + 
                            ", chequeEspecial = " + (this.chequeEspecial) +
                            "}");
    }
}
