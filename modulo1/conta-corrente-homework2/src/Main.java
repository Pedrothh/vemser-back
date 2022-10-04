public class Main {
    public static void main(String[] args) {

        // instanciando os contatos da classe Contato (contatoCliente1)
        Contato contato1Cliente1 = new Contato("Número Pessoal", "(83)99999-8888", 1);
        Contato contato2Cliente1 = new Contato("Número de Trabalho", "(83)8888-99999", 2);
       
        // instanciando o endereço da classe Endereco (enderecoCliente1)
        Endereco endereco1Cliente1 = new Endereco(1, "Av. Onde Uber Não Chega", 1111, "Casa", "58000-000", "João Pessoa", "Paraíba", "Brasil");

        // instanciando o primeiro objeto da classe Cliente (cliente1)
        Cliente cliente1 = new Cliente("Fulano 1", "111.222.333-44", contato1Cliente1, endereco1Cliente1);

        // instanciando a primeira conta corrente com o cliente1
        ContaCorrente contaCliente1 = new ContaCorrente(cliente1, "00001", "001", 1000, 200);


        // instanciando novos contatos da classe Contato (contatoCliente2)
        Contato contato1Cliente2 = new Contato("Número Pessoal", "(11)2222-3333", 1);
        Contato contato2Cliente2 = new Contato("Número de Trabalho", "(11)4444-5555", 2);

        // instanciando um novo endereço da classe Endereco (enderecoCliente2)
        Endereco endereco1Cliente2 = new Endereco(1, "Av. Tão tão distante", 1111, "Apartamento", "58100-000", "São Paulo", "São Paulo", "Brasil");

        // instanciando um novo objeto da classe Cliente (cliente2)
        Cliente cliente2 = new Cliente("Fulano 2", "555.666.777-88", contato1Cliente2, endereco1Cliente2);

        // instanciando uma nova ContaCorrente filha da classe Conta (contaCliente2)
        ContaCorrente contaCliente2 = new ContaCorrente(cliente2, "00002", "002", 1000, 200);

        Cliente cliente3 = new Cliente("Fulano 3", "787.266.424-88", null, null);
        ContaPoupanca contaPoupancaCliente1 = new ContaPoupanca(cliente3, "0001-1", "001", 5000);

        // testando os saldos e fazendo transferencia de 500 DBC-coins da contaCliente1 para contaCliente2
        contaCliente1.imprimir();
        contaCliente2.imprimir();
        contaCliente1.transferir(contaCliente2, 500);

        // imprimindo as duas contas
        contaCliente1.imprimir();
        contaCliente2.imprimir();
        System.out.println("FIM DO HOMEWORK 1");
        System.out.println();
        System.out.println();


        // testes com método transferir()
        System.out.println("INICIO DOS TESTES - método transferir()");
        contaCliente1.transferir(contaCliente2, 0);
        contaCliente1.transferir(contaCliente2, -1);
        contaCliente1.transferir(contaCliente2, 500);
        contaCliente1.transferir(contaCliente2, 1);
        contaCliente1.transferir(contaCliente2, 200);
        contaCliente1.imprimir();
        contaCliente2.imprimir();
        System.out.println();

        // testes com método sacar()
        System.out.println("INICIO DOS TESTES - método sacar()");
        contaCliente1.sacar(0);
        contaCliente1.sacar(-1);
        contaCliente1.sacar(1);
        contaCliente1.sacar(198);
        contaCliente1.sacar(1);
        contaCliente1.imprimir();
        System.out.println();


       
        // testando valores null no cliente imprimirEnderecos() e imprimirContatos()
        System.out.println("INICIO DOS TESTES - imprimirEnderecos() e imprimirContatos()");
        cliente1.imprimirCliente();
        cliente1.imprimirEnderecos();
        cliente1.imprimirContatos();
        System.out.println();

        // testando creditarTaxa() na contaPoupanca (contaPoupancaCliente1)
        System.out.println("INICIO DOS TESTES - creditarTaxa()");
        contaPoupancaCliente1.imprimir();
        contaPoupancaCliente1.creditarTaxa();
        contaPoupancaCliente1.imprimir();
        // cliente1.creditarTaxa(); -> só está acessível para contas do tipo ContaPoupanca!
        System.out.println("FIM DOS TESTES");
    }
}
