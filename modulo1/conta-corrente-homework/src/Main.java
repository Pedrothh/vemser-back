public class Main {
    public static void main(String[] args) {

        // instanciando os contatos da classe Contato (contatoCliente1)
        Contato contato1Cliente1 = new Contato();
        contato1Cliente1.descricao = "Número Pessoal";
        contato1Cliente1.telefone = "(83)99999-8888";
        contato1Cliente1.tipo = 1;
        Contato contato2Cliente1 = new Contato();
        contato2Cliente1.descricao = "Número de Trabalho";
        contato2Cliente1.telefone = "(83)8888-99999";
        contato2Cliente1.tipo = 2;

        // instanciando o endereço da classe Endereco (enderecoCliente1)
        Endereco endereco1Cliente1 = new Endereco();
        endereco1Cliente1.tipo = 1;
        endereco1Cliente1.logradouro = "Av. Onde Uber Não Chega";
        endereco1Cliente1.numero = 1111;
        endereco1Cliente1.complemento = "Casa";
        endereco1Cliente1.cep = "58000-000";
        endereco1Cliente1.cidade = "João Pessoa";
        endereco1Cliente1.estado = "Paraíba";
        endereco1Cliente1.pais = "Brasil";

        // instanciando o primeiro objeto da classe Cliente (cliente1)
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Fulano 1";
        cliente1.cpf = "111.222.333-44";
        cliente1.contatos[0] = contato1Cliente1;
        cliente1.contatos[1] = contato2Cliente1;
        cliente1.enderecos[0] = endereco1Cliente1;
        cliente1.enderecos[1] = endereco1Cliente1;

        // instanciando a primeira conta corrente com o cliente1
        ContaCorrente contaCliente1 = new ContaCorrente();
        contaCliente1.cliente = cliente1;
        contaCliente1.numeroConta = "00001";
        contaCliente1.saldo = 1000;
        contaCliente1.agencia = 001;
        contaCliente1.chequeEspecial = 200;


        // instanciando novos contatos da classe Contato (contatoCliente2)
        Contato contato1Cliente2 = new Contato();
        contato1Cliente2.descricao = "Número Pessoal";
        contato1Cliente2.telefone = "(11)2222-3333";
        contato1Cliente2.tipo = 1;
        Contato contato2Cliente2 = new Contato();
        contato2Cliente2.descricao = "Número de Trabalho";
        contato2Cliente2.telefone = "(11)4444-5555";
        contato2Cliente2.tipo = 2;


        // instanciando um novo endereço da classe Endereco (enderecoCliente2)
        Endereco endereco1Cliente2 = new Endereco();
        endereco1Cliente2.tipo = 1;
        endereco1Cliente2.logradouro = "Av. Tão tão distante";
        endereco1Cliente2.numero = 1111;
        endereco1Cliente2.complemento = "Apartamento";
        endereco1Cliente2.cep = "58100-000";
        endereco1Cliente2.cidade = "São Paulo";
        endereco1Cliente2.estado = "São Paulo";
        endereco1Cliente2.pais = "Brasil";


        // instanciando um novo objeto da classe Cliente (cliente2)
        Cliente cliente2 = new Cliente();
        cliente2.nome = "Fulano 2";
        cliente2.cpf = "555.666.777-88";
        cliente2.contatos[0] = contato1Cliente2;
        cliente2.contatos[1] = contato1Cliente2;
        cliente2.enderecos[0] = endereco1Cliente2;
        cliente2.enderecos[1] = endereco1Cliente2;

        // instanciando uma nova conta corrente da classe ContaCOrrente (contaCliente2)
        ContaCorrente contaCliente2 = new ContaCorrente();
        contaCliente2.cliente = cliente2;
        contaCliente2.numeroConta = "00002";
        contaCliente2.saldo = 1000;
        contaCliente2.agencia = 002;
        contaCliente2.chequeEspecial = 200;

        // testando os saldos e fazendo transferencia de 500 DBC-coins da contaCliente1 para contaCliente2
        contaCliente1.retornarSaldoComChequeEspecial();
        contaCliente2.retornarSaldoComChequeEspecial();
        contaCliente1.transferir(contaCliente2, 500);
        contaCliente1.retornarSaldoComChequeEspecial();
        contaCliente2.retornarSaldoComChequeEspecial();
        System.out.println();

        // imprimindo as duas contas
        contaCliente1.imprimirContaCorrente();
        contaCliente2.imprimirContaCorrente();

    }
}
