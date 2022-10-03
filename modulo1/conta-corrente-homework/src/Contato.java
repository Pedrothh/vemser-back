public class Contato {
    public String descricao;
    public String telefone;
    public int tipo;

    public void imprimirContato(){
        String tipo;
        if (this.tipo == 1){
            tipo = "residencial";
        }else {
            tipo = "comercial";
        }
        System.out.println("Contato{" +
                "descricao='" + descricao + '\'' +
                ", telefone='" + telefone + '\'' +
                ", tipo=" + tipo +
                '}');
    }

}
