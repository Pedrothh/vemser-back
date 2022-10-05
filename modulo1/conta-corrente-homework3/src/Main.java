import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // instanciando os contatos da classe Contato (contatoCliente1)
        ArrayList<Contato> contatoCliente1 = new ArrayList<>();
        contatoCliente1.add(new Contato("Número Pessoal", "(83)99999-8888",  1));
        contatoCliente1.add(new Contato("Número de Trabalho", "(83)8888-99999", 2));


        // instanciando o endereço da classe Endereco (enderecoCliente1)
        ArrayList<Endereco> enderecoCliente1 = new ArrayList<>();
        enderecoCliente1.add(new Endereco(1, "Av. Onde Uber Não Chega", 1111, "Casa", "58000-000", "João Pessoa", "Paraíba", "Brasil"));
        enderecoCliente1.add(new Endereco(1, "Av. Sem wifi", 2222, "Casa na Arvore", "58058-580", "Gramado", "Rio Grande do Sul", "Brasil"));
        enderecoCliente1.add(new Endereco(2, "Rua dos Milionários", 3345, "Mansão Gamer",  null, "Rio de Janeiro", "Rio de Janeiro", "Brasil"));

        // instanciando o primeiro objeto da classe Cliente (cliente1)
        Cliente cliente1 = new Cliente("Fulano 1", "111.222.333-44", contatoCliente1, enderecoCliente1);

        // instanciando a primeira conta corrente com o cliente1
        ContaCorrente contaCorrenteCliente1 = new ContaCorrente(cliente1, "00001", "001", 1000, 200);


        // instanciando novos contatos da classe Contato (contatoCliente2)
        ArrayList<Contato> contatoCliente2 = new ArrayList<>();
        contatoCliente2.add(new Contato("Número Pessoal", "(11)2222-3333", 1));
        contatoCliente2.add(new Contato("Número de Trabalho", "(11)4444-5555", 2));
        contatoCliente2.add(new Contato("Número do Serviço Secreto", "(11)9876-1234", 1));

        // instanciando um novo endereço da classe Endereco (enderecoCliente2)
        ArrayList<Endereco> enderecoCliente2 = new ArrayList<>();
        enderecoCliente2.add(new Endereco(1, "Av. Tão tão distante", 1111, "Apartamento", "58100-000", "São Paulo", "São Paulo", "Brasil"));

        // instanciando um novo objeto da classe Cliente (cliente2)
        Cliente cliente2 = new Cliente("Fulano 2", "555.666.777-88", contatoCliente2, enderecoCliente2);

        // instanciando uma nova ContaCorrente filha da classe Conta (contaCliente2)
        ContaCorrente contaCorrenteCliente2 = new ContaCorrente(cliente2, "00002", "002", 1000, 200);

        Cliente cliente3 = new Cliente("Fulano 3", "787.266.424-88", null, null);
        ContaPoupanca contaPoupancaCliente3 = new ContaPoupanca(cliente3, "0001-1", "001", 5000);

        // Cliente cliente4 = new Cliente("Fulano 4", "999.089.123-33", null, null);
        ContaPagamento contaPagamentoCliente1 = new ContaPagamento(cliente1, "1001-2", "003", 0);



        // testando os saldos e fazendo transferencia de 500 DBC-coins da contaCliente1 para contaCliente2
        contaCorrenteCliente1.imprimir(); // Teste deve Passar e imprimir a contaCorrenteCliente1
        contaCorrenteCliente2.imprimir(); // Teste deve Passar e imprimir a contaCorrenteCliente2
        contaCorrenteCliente1.transferir(contaCorrenteCliente2, 500); // Teste deve Passar e Transferir R$ 500.0 de Fulano 1 para Fulano 2

        // imprimindo as duas contas
        contaCorrenteCliente1.imprimir();// Teste deve Passar e imprimir a contaCorrenteCliente1
        contaCorrenteCliente2.imprimir(); // Teste deve Passar e imprimir a contaCorrenteCliente2
        System.out.println("FIM DO HOMEWORK 1");
        System.out.println();
        System.out.println();


        // testes com método transferir()
        System.out.println("INICIO DOS TESTES - método transferir()");
        contaCorrenteCliente1.transferir(contaCorrenteCliente2, 0); // Teste deve falhar e mostrar erro de valores negativos de saque e transferência
        contaCorrenteCliente1.transferir(contaCorrenteCliente2, -1); // Teste deve falhar e mostrar erro de valores negativos de saque e transferência
        contaCorrenteCliente1.transferir(contaCorrenteCliente2, 500); // Teste deve passar e a transferencia realizada
        contaCorrenteCliente1.transferir(contaCorrenteCliente2, 1); // Teste deve passar e a transferencia realizada
        contaCorrenteCliente1.transferir(contaCorrenteCliente2, 200); // Teste deve falhar e mostrar erro de valores negativos de saque e transferência
        contaCorrenteCliente1.imprimir(); // Teste deve passar e imprimir ContaCorrenteCliente1
        contaCorrenteCliente2.imprimir(); // Teste deve passar e imprimir ContaCorrenteCliente1
        System.out.println();

        // testes com método sacar()
        System.out.println("INICIO DOS TESTES - método sacar()");
        contaCorrenteCliente1.sacar(0); // Teste deve falhar e mostrar erro de valores negativos de saque
        contaCorrenteCliente1.sacar(-1); // Teste deve falhar e mostrar erro de valores negativos de saque
        contaCorrenteCliente1.sacar(1); // Teste deve passar e realizar o saque
        contaCorrenteCliente1.sacar(198); // Teste deve passar e realizar o saque
        contaCorrenteCliente1.sacar(1); // Teste deve falhar e mostrar erro de valores negativos de saque
        contaCorrenteCliente1.imprimir(); // Teste deve passar e imprimir contaCorrenteCliente1
        System.out.println();

        // testando creditarTaxa() na contaPoupanca (contaPoupancaCliente1)
        System.out.println("INICIO DOS TESTES - creditarTaxa()");
        contaPoupancaCliente3.imprimir(); // Teste deve passar e retornar contaPoupancaCliente1 com saldo 5000
        contaPoupancaCliente3.creditarTaxa(); // Teste deve passar e creditar taxa da poupança no saldo da conta (+1%)
        contaPoupancaCliente3.imprimir(); // Teste deve passar e retornar retornar contaPoupancaCliente1 com saldo 5050
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
        contaPoupancaCliente3.imprimir();
        contaCorrenteCliente1.imprimir();
        contaPoupancaCliente3.transferir(contaCorrenteCliente1, 3);
        contaPoupancaCliente3.imprimir();
        contaCorrenteCliente1.imprimir();
        contaCorrenteCliente1.transferir(contaPoupancaCliente3, 3);
        contaCorrenteCliente1.transferir(contaPoupancaCliente3, 1);
        contaCorrenteCliente1.imprimir();
        System.out.println("FIM DO HOMEWORK 2");
        System.out.println();

        // testando polimorfismo dos métodos transferir(), sacar() e depositar() entre ContaPoupanca, ContaCorrente e ContaPagamento
        System.out.println("INICIO DOS TESTES - testando polimorfismo dos métodos transferir(), sacar() e depositar() entre ContaPoupanca, ContaCorrente e ContaPagamento");
        System.out.println("INICIO DOS TESTES - método transferir() com os 3 tipos de contas transferindo entre elas");
        contaCorrenteCliente1.setSaldo(0);
        contaPoupancaCliente3.setSaldo(0);
        contaPagamentoCliente1.setSaldo(0);

        contaCorrenteCliente1.imprimir();
        contaPoupancaCliente3.imprimir();
        contaPagamentoCliente1.imprimir();

        contaCorrenteCliente1.transferir(contaPoupancaCliente3, 1); // Teste deve passar por causa do cheque especial
        contaCorrenteCliente1.setSaldo(-200);
        contaCorrenteCliente1.transferir(contaPagamentoCliente1, 1); // Teste deve falhar, saldo negativo igual ao chequeEspecial, logo não pode mais tirar nada

        contaCorrenteCliente1.setSaldo(0);
        contaPoupancaCliente3.setSaldo(0);
        contaPagamentoCliente1.setSaldo(0);

        contaPoupancaCliente3.transferir(contaCorrenteCliente1, 1); // Teste deve falhar, saldo da ContaPoupança inferior ao valor sacado
        contaPoupancaCliente3.transferir(contaPagamentoCliente1, 1); // Teste deve falhar, saldo da ContaPoupança inferior ao valor sacado

        contaCorrenteCliente1.setSaldo(0);
        contaPoupancaCliente3.setSaldo(0);
        contaPagamentoCliente1.setSaldo(0);

        contaPagamentoCliente1.transferir(contaCorrenteCliente1, 1); // Teste deve falhar, saldo da contaPagamento inferior ao valor sacado
        contaPagamentoCliente1.transferir(contaPoupancaCliente3, 1); // Teste deve falhar, saldo da contaPagamento inferior ao valor sacado
        System.out.println();

        System.out.println("INICIO DOS TESTES - método depositar() e sacar() com os 3 tipos de contas");
        contaCorrenteCliente1.setSaldo(0);
        contaPoupancaCliente3.setSaldo(0);
        contaPagamentoCliente1.setSaldo(0);
        contaCorrenteCliente1.depositar(1); // Teste deve passar, não cobra taxa.
        contaPoupancaCliente3.depositar(1); // Teste deve passar, não cobra taxa.
        contaPagamentoCliente1.depositar(1); // Teste deve passar, não cobra taxa.

        contaCorrenteCliente1.sacar(1); // Teste deve passar, não cobra taxa.
        contaPoupancaCliente3.sacar(1); // Teste deve passar, não cobra taxa.
        contaPagamentoCliente1.sacar(1); // Teste deve falhar, não tem saldo suficiente pra pagar a taxa + valor do saque.
        contaPagamentoCliente1.depositar(4); // Teste deve passar
        contaPagamentoCliente1.sacar(0.76); // Teste deve falhar, não tem saldo suficiente pra pagar a taxa + valor do saque.
        contaPagamentoCliente1.sacar(0.75); //  Teste deve passar, agora sim, saldo da contaPagamento maior ou igual que o valor do saque + taxa.

        contaCorrenteCliente1.imprimir();
        contaPoupancaCliente3.imprimir();
        contaPagamentoCliente1.imprimir();
        System.out.println("FIM DO HOMEWORK 3");
    }
}
