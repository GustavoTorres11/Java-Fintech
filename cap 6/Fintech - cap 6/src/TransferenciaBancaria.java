import java.time.LocalDateTime;

public class TransferenciaBancaria {
    private String numeroConta;
    private String tipoTransacao;
    private LocalDateTime dataHora;
    private double valorTransacao;

    // Construtor
    public TransferenciaBancaria(String numeroConta, String tipoTransacao, LocalDateTime dataHora, double valorTransacao) {
        this.numeroConta = numeroConta;
        this.tipoTransacao = tipoTransacao;
        this.dataHora = dataHora;
        this.valorTransacao = valorTransacao;
    }

    // Método para exibir informações da transferência
    public void exibirDetalhesTransacao() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Tipo de Transação: " + tipoTransacao);
        System.out.println("Data e Hora: " + dataHora);
        System.out.println("Valor da Transação: R$ " + valorTransacao);
    }
}
