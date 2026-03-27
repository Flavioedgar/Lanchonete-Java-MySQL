package SistemaDeLanchonete.Persistencia.Dominio;

import SistemaDeLanchonete.Persistencia.persistencia.ProdutoDAO;

import java.util.Scanner;
import java.util.List;

public class Servico {

    private Scanner scanner;
    private ProdutoDAO dao = new ProdutoDAO(); // O serviço agora usa o DAO

    public Servico(Scanner scanner) {
        this.scanner = scanner;
    }

    public void adicionarProduto() {
        System.out.println("\n--- Cadastro ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: R$ ");
        double valor = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        // Crei o objeto (o ID o banco gera sozinho, passamos 0 aqui)
        Produto p = new Produto(0, nome, valor, quantidade);
        dao.salvar(p);
        System.out.println("Produto cadastrado!");
    }

    public void listarProdutos() {
        List<Produto> produtos = dao.listarTodos();
        if (produtos.isEmpty()) {
            System.out.println("\nNão tem produto cadastrado!");
            return;
        }
        System.out.println("\n--- Produtos ---");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    public void deletarProduto() {
        listarProdutos();
        System.out.print("ID para deletar: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        dao.deletar(id);
        System.out.println("Produto excluido.");
    }

    public void venderProduto() {
        List<Produto> produtos = dao.listarTodos();
        listarProdutos();
        System.out.print("ID para venda: ");
        int id = scanner.nextInt();

        Produto selecionado = null;
        for (Produto p : produtos) {
            if (p.getId() == id) { selecionado = p; break; }
        }

        if (selecionado != null) {
            System.out.print("Quantidade: ");
            int qtd = scanner.nextInt();
            scanner.nextLine();
            if (selecionado.vender(qtd)) {
                // Se vendeu na memória, atualizamos o banco!
                dao.atualizarEstoque(id, selecionado.getQuantidade());
                System.out.println("Venda concluída com sucesso!");
            }
        }
    }
}
