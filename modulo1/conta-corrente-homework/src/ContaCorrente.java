public class ContaCorrente {
    public Cliente cliente;
    public String numeroConta;
    public int agencia;
    public double saldo;
    public double chequeEspecial;

    public void imprimirContaCorrente() {
        System.out.println("Conta Corrente{" +
                "cliente='" + cliente.nome + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", agencia=" + agencia + '\'' +
                ", saldo=" + saldo +
                ", chequeEspecial='" + chequeEspecial + '\'' +
                '}');
    }

    public boolean sacar(double valor) {
        if (saldo+chequeEspecial >= valor){
            if (saldo >= valor){
                 saldo -= valor;
                System.out.println("Você fez o saque usando apenas o seu saldo!");
            } else {
                saldo = 0;
                chequeEspecial -= (saldo-valor);
                System.out.println("Você fez o saque usando seu saldo e seu cheque especial!");
            }
           return true;
        } else {
            System.out.println("Seu saldo + chequeEspecial são insuficientes.");
            return false;
        }
    }

    public boolean depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Você depositou R$" + valor + ", agora seu saldo é R$" + saldo);
            return true;
        } else {
            System.out.println("Você não pode depositar valores negativos.");
            return false;
        }
    }

    public double retornarSaldoComChequeEspecial() {
        System.out.println("SaldoComChequeEspecial{" +
                "saldo='" + saldo + '\'' +
                ", chequeEspecial='" + chequeEspecial + '\'' +
                '}');
        return this.saldo + this.chequeEspecial;
    }

    public boolean transferir(ContaCorrente numeroContaDestino, double valor){
        if (valor > 0){
            this.saldo -= valor;
            numeroContaDestino.saldo += valor;
            System.out.println("Você transferiu R$" + valor + " para o cliente " + numeroContaDestino.cliente.nome + ", conta " + numeroContaDestino.numeroConta);
            return true;
        }
        System.out.println("Não pode transferir valores negativos.");
        return false;
    }
}
