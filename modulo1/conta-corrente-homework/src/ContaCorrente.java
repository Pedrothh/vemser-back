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
        if (valor <= 0) {
            System.out.println("Não pode sacar valores negativos!");
            return false;
        }
        if (!(valor <= retornarSaldoComChequeEspecial())){
            System.out.println("Não pode sacar valores maiores que o SALDO e o CHEQUE ESPECIAL!");
            return false;
        }
        saldo -= valor;
        System.out.println("Saque da conta " + numeroConta + " realizado no valor de R$" + valor);
        return true;
    }

    public boolean depositar(double valor){
        if (valor<=0) {
            System.out.println("Não pode depositar valores negativos!");
            return false;
        }
        saldo += valor;
        System.out.println("Depositado o valor R$" + valor + " na conta " + numeroConta);
        return true;
    }

    public double retornarSaldoComChequeEspecial() {
        return saldo + chequeEspecial;
    }

    public boolean transferir(ContaCorrente numeroContaDestino, double valor){
        if (sacar(valor)){
            numeroContaDestino.depositar(valor);
            System.out.println("Conta " + numeroConta + " transferiu R$" + valor + " para conta " + numeroContaDestino.numeroConta);
            return true;
        }
        System.out.println("Não pode transferir valores negativos.");
        return false;
    }
}
