import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Perfil
        Perfil perfil = new Perfil();
        perfil.setNome("João");
        perfil.setTelefone("40028922");
        perfil.setCpf("337.000.111-83");
        perfil.setDataDeNascimento("00/01/1000");

        // Exibindo as informações do perfil
        System.out.println("Nome: " + perfil.getNome());
        System.out.println("Telefone: " + perfil.getTelefone());
        System.out.println("CPF: " + perfil.getCpf());
        System.out.println("Data de nascimento: " + perfil.getDataDeNascimento());

        // Criando e exibindo o extrato
        Extrato extrato = new Extrato();
        extrato.entrada(1000.00, "Depósito recebido");
        System.out.println("\nExtrato de Entrada:");
        extrato.exibirExtrato();

        extrato.saida(200.00, "Pagamento de conta");
        System.out.println("\nExtrato de Saída:");
        extrato.exibirExtrato();

        // Criando um objeto Login com credenciais
        Login login = new Login("usuario", "senha123");

        // Validando o login
        boolean isValid = login.validarLogin("usuario", "senha123");

        if (isValid) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Falha no login. Verifique o nome de usuário e a senha.");
        }

        // Criando uma transação bancária
        LocalDateTime agora = LocalDateTime.now();
        TransferenciaBancaria transacao = new TransferenciaBancaria("12345-6", "Transferência", agora, 2500.00);
        System.out.println("\nDetalhes da Transação:");
        transacao.exibirDetalhesTransacao();

        // Criando um relatório financeiro
        RelatorioFinanceiro relatorio = new RelatorioFinanceiro("98765-4", 1500.00, 5000.00, "Pagar a fatura do cartão até o dia 10.");
        System.out.println("\nRelatório Financeiro:");
        relatorio.exibirRelatorioFinanceiro();
    }
}
