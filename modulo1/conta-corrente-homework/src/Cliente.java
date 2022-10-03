public class Cliente {
    public String nome;
    public String cpf;
    public Contato[] contatos = new Contato[2];
    public Endereco[] enderecos = new Endereco[2];


    public void imprimirContatos() {
        if (contatos != null) {
            for (Contato i: contatos) {
                if (i != null) {
                    i.imprimirContato();
                }
            }
        }
    }

    public void imprimirEnderecos(){
        if (enderecos != null) {
            for (Endereco i: enderecos) {
                if (i != null) {
                    i.imprimirEndereco();
                }
            }
        }
    }

    public void imprimirCliente(){
        System.out.println("Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}');
    }



}
