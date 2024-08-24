public class RelatorioFinanceiro {
        private String numeroConta;
        private double mediaDespesas;
        private double tetoOrcamento;
        private String lembretePagamento;

        // Construtor
        public RelatorioFinanceiro(String numeroConta, double mediaDespesas, double tetoOrcamento, String lembretePagamento) {
            this.numeroConta = numeroConta;
            this.mediaDespesas = mediaDespesas;
            this.tetoOrcamento = tetoOrcamento;
            this.lembretePagamento = lembretePagamento;
        }

        // Método para exibir informações do relatório financeiro
        public void exibirRelatorioFinanceiro() {
            System.out.println("Número da Conta: " + numeroConta);
            System.out.println("Média de Despesas: R$ " + mediaDespesas);
            System.out.println("Teto de Orçamento: R$ " + tetoOrcamento);
            System.out.println("Lembrete de Pagamento: " + lembretePagamento);
        }
    }

