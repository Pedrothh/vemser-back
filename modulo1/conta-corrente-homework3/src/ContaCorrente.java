public class ContaCorrente extends Conta implements Impressao {
    private double chequeEspecial;
    
    public ContaCorrente() {
    }

    public ContaCorrente(Cliente cliente, String numeroConta, String agencia, double saldo, double chequeEspecial) {
        super(cliente, numeroConta, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public double retornarSaldoComChequeEspecial() {
        return getSaldo() + chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > retornarSaldoComChequeEspecial() || valor <= 0) {
            System.out.println("Não pode sacar valores negativos!");
            return false;
        }
        setSaldo(getSaldo() - valor);
        System.out.println("Saque de Conta Corrente! Sacado R$" +  valor + " da conta de " + getCliente().getNome());
        return true;
    }

    @Override
    public void imprimir() {
        System.out.println( "Conta {cliente=" + this.getCliente().getNome() +
                            ", numeroContaCorrente=" + this.getNumeroConta() + ", agencia=" + this.getAgencia() + ", saldo=" + this.getSaldo() +
                            ", chequeEspecial = " + this.chequeEspecial +
                            "}");
    }
}
