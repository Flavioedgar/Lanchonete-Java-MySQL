package SistemaDeLanchonete.Persistencia.Dominio;

public class Produto {
        private int id;
        private String nome;
        private double valor;
        private int quantidade;

        // Construtor
        public Produto(int id, String nome, double valor, int quantidade) {
            this.id = id;
            this.nome = nome;
            this.valor = valor;
            this.quantidade = quantidade;
        }

        // Lógica de Venda (Diminuir estoque na memória antes de mandar pro banco)
        public boolean vender(int quantidadeDesejada) {
            if (quantidadeDesejada <= 0) return false;
            if (quantidadeDesejada > this.quantidade) {
                System.out.println("Estoque insuficiente!");
                return false;
            }

            this.quantidade -= quantidadeDesejada;
            return true;
        }

        // Getters e Setters
        public int getId() { return id; }
        public String getNome() { return nome; }
        public double getValor() { return valor; }
        public int getQuantidade() { return quantidade; }

        public void setId(int id) { this.id = id; }
        public void setNome(String nome) { this.nome = nome; }
        public void setValor(double valor) { this.valor = valor; }
        public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

        @Override
        public String toString() {
            return "ID: " + id +
                    " | Nome: " + nome +
                    " | Preço: R$ " + String.format("%.2f", valor) +
                    " | Estoque: " + quantidade;
        }
    }
