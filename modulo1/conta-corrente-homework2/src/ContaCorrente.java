public class ContaCorrente extends Conta implements Impressao {
    private double chequeEspecial;
    
    public ContaCorrente() {
    }

    public ContaCorrente(Cliente cliente, String numeroConta, String agencia, double saldo, double chequeEspecial) {
        super(cliente, numeroConta, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public double retornarSaldoComChequeEspecial() {
        return this.getSaldo() + this.chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Não pode sacar valores negativos!");
            return false;
        }
        if(valor > this.getSaldo()){
            System.out.println("Não pode sacar valores maiores que o SALDO e o CHEQUE ESPECIAL!");
            return false;
        }
        setSaldo(getSaldo() - valor);
        return true;
    }

    public void imprimir() {
        System.out.println( "Conta {cliente=" + getCliente().getNome() + 
                            ", numeroConta=" + getNumeroConta() + ", agencia=" + getAgencia() + ", saldo=" + getSaldo() + 
                            ", chequeEspecial = " + (this.chequeEspecial) +
                            "}");
    }
}
