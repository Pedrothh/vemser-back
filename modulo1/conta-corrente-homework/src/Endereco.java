public class Endereco {
    public int tipo;
    public String logradouro;
    public int numero;
    public String complemento;
    public String cep;
    public String cidade;
    public String estado;
    public String pais;


    public void imprimirEndereco(){
        String tipo;
        if (this.tipo == 1){
            tipo = "residencial";
        }else {
            tipo = "comercial";
        }
        System.out.println("Endereco{" +
                "tipo=" + tipo +
                ", logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", pais='" + pais + '\'' +
                '}');
    }
}
