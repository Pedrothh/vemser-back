public class Cliente {
    private String nome;
    private String cpf;
    private Contato[] contatos = new Contato[2];
    private Endereco[] enderecos = new Endereco[2];

    public Cliente(){
    }

    public Cliente(String nome, String cpf, Contato contatos, Endereco enderecos) {
        this.nome = nome;
        this.cpf = cpf;
        this.contatos[0] = contatos;
        this.enderecos[0] = enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato contatos) {
        this.contatos[0] = contatos;
    }

    public Endereco[] getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco enderecos) {
        this.enderecos[0] = enderecos;
    }

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
