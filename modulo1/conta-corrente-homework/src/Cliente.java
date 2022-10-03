public class Cliente {
    public String nome;
    public String cpf;
    public Contato[] contatos = new Contato[2];
    public Endereco[] enderecos = new Endereco[2];


    public void imprimirContatos() {
        contatos[0].imprimirContato();
        contatos[1].imprimirContato();
    }

    public void imprimirEnderecos(){
        enderecos[0].imprimirEndereco();
        enderecos[1].imprimirEndereco();
    }

    public void imprimirCliente(){
        System.out.println("Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}');
    }



}
