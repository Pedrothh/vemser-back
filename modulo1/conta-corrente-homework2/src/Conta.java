public abstract class Conta implements Movimentacao{
    private Cliente cliente;
    private String numeroConta;
    private String agencia;
    private double saldo;
   
    
    public Conta() {
    }

    public Conta(Cliente cliente, String numeroConta, String agencia, double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Não pode sacar valores negativos!");
            return false;
        }
        if(valor > getSaldo()){
            System.out.println("Não pode sacar valores maiores que o SALDO e o CHEQUE ESPECIAL!");
            return false;
        }
        setSaldo(getSaldo() - valor);
        return true;
    }

    public boolean depositar(double valor){
        if (valor<=0) {
            System.out.println("Não pode depositar valores negativos!");
            return false;
        }
        setSaldo(getSaldo() + valor);;
        return true;
    }

    public boolean transferir(Conta conta, double valor){
        if (this.sacar(valor)){
            conta.depositar(valor);
            return true;
        }
        System.out.println("Não pode transferir valores negativos.");
        return false;
    }   
}
