public class Main {
    public static void main(String[] args) {

        // instanciando os contatos da classe Contato (contatoCliente1)
        Contato contatoCliente1[] = new Contato[2];
        contatoCliente1[0] = new Contato("Número Pessoal", "(83)99999-8888", 1);
        contatoCliente1[1] = new Contato("Número de Trabalho", "(83)8888-99999", 2);
       
        // instanciando o endereço da classe Endereco (enderecoCliente1)
        Endereco enderecoCliente1[] = new Endereco[2];
        enderecoCliente1[0] = new Endereco(1, "Av. Onde Uber Não Chega", 1111, "Casa", "58000-000", "João Pessoa", "Paraíba", "Brasil");
        enderecoCliente1[1] = new Endereco(1, "Av. Sem wifi", 2222, "Casa na Arvore", "58058-580", "Gramado", "Rio Grande do Sul", "Brasil");


        // instanciando o primeiro objeto da classe Cliente (cliente1)
        Cliente cliente1 = new Cliente("Fulano 1", "111.222.333-44", contatoCliente1, enderecoCliente1);

        // instanciando a primeira conta corrente com o cliente1
        ContaCorrente contaCliente1 = new ContaCorrente(cliente1, "00001", "001", 1000, 200);


        // instanciando novos contatos da classe Contato (contatoCliente2)
        Contato contatoCliente2[] = new Contato[2];
        contatoCliente2[0] = new Contato("Número Pessoal", "(11)2222-3333", 1);
        contatoCliente2[1] = new Contato("Número de Trabalho", "(11)4444-5555", 2);

        // instanciando um novo endereço da classe Endereco (enderecoCliente2)
        Endereco enderecoCliente2[] = new Endereco[2];
        enderecoCliente2[0] = new Endereco(1, "Av. Tão tão distante", 1111, "Apartamento", "58100-000", "São Paulo", "São Paulo", "Brasil");

        // instanciando um novo objeto da classe Cliente (cliente2)
        Cliente cliente2 = new Cliente("Fulano 2", "555.666.777-88", contatoCliente2, enderecoCliente2);

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

        // testando creditarTaxa() na contaPoupanca (contaPoupancaCliente1)
        System.out.println("INICIO DOS TESTES - creditarTaxa()");
        contaPoupancaCliente1.imprimir();
        contaPoupancaCliente1.creditarTaxa();
        contaPoupancaCliente1.imprimir();
        // cliente1.creditarTaxa(); -> só está acessível para contas do tipo ContaPoupanca!
        System.out.println();

        // testando valores null no cliente imprimirEnderecos() e imprimirContatos()
        System.out.println("INICIO DOS TESTES - imprimirCliente(), imprimirEnderecos() e imprimirContatos()");
        cliente1.imprimirCliente();
        cliente1.imprimirEnderecos();
        cliente1.imprimirContatos();
        System.out.println();
        cliente2.imprimirCliente();
        cliente2.imprimirEnderecos();
        cliente2.imprimirContatos();
        System.out.println();
        cliente3.imprimirCliente();
        cliente3.imprimirEnderecos();
        cliente3.imprimirContatos();
        System.out.println();


        // testando polimorfismo de transferência entre ContaPoupanca e ContaCorrente
        System.out.println("INICIO DOS TESTES - testando polimorfismo do método transferir() e sacar() entre ContaPoupanca e ContaCorrente");
        contaPoupancaCliente1.imprimir();
        contaCliente1.imprimir();
        contaPoupancaCliente1.transferir(contaCliente1, 3);
        contaPoupancaCliente1.imprimir();
        contaCliente1.imprimir();
        contaCliente1.transferir(contaPoupancaCliente1, 3);
        contaCliente1.transferir(contaPoupancaCliente1, 1);
        contaCliente1.imprimir();
        System.out.println("FIM DOS TESTES");
    }
}
