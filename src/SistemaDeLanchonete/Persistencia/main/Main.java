package SistemaDeLanchonete.Persistencia.main;

import SistemaDeLanchonete.Persistencia.Dominio.Servico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Servico servico = new Servico(scanner);
        boolean parar = false;

        do {
            int opcao = menu(scanner);
            switch (opcao) {
                case 1 -> servico.venderProduto();
                case 2 -> servico.adicionarProduto();
                case 3 -> servico.listarProdutos();
                case 4 -> servico.deletarProduto();
                case 5 -> {
                    parar = true;
                    System.out.println("Encerrando...");
                }
            }
        } while (!parar);
    }

    public static int menu(Scanner scanner) {
        System.out.println("\n---- MENU LANCHONETE (MySQL) ----");
        System.out.println("1 - Vender");
        System.out.println("2 - Adicionar");
        System.out.println("3 - Listar");
        System.out.println("4 - Deletar");
        System.out.println("5 - Sair");
        System.out.print("Escolha: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }
}
