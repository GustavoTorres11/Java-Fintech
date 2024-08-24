public class Extrato {
    private String tipo;  // Pode ser "Entrada" ou "Saída"
    private double valor;
    private String informacao;

    // Construtor padrão
    public Extrato() {}

    // Método para registrar uma entrada
    public void entrada(double valor, String informacao) {
        this.tipo = "Entrada";
        this.valor = valor;
        this.informacao = informacao;
    }

    // Método para registrar uma saída
    public void saida(double valor, String informacao) {
        this.tipo = "Saída";
        this.valor = valor;
        this.informacao = informacao;
    }

    // Método para exibir informações do extrato
    public void exibirExtrato() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: " + valor);
        System.out.println("Informação: " + informacao);
    }
}
