package Exercicio_06;

import java.util.Scanner;

public class SistemaLoja {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 1;

        mostrarCabecalho();

        // Dica 6: repete as vendas até o usuário decidir sair
        while (opcao == 1) {
            realizarVenda(sc);

            System.out.print("\nOutra venda? (1 - Sim / 2 - Sair): ");
            opcao = sc.nextInt();
            sc.nextLine();
        }

        sc.close();

    }

    // Dica 1
    public static void mostrarCabecalho() {
        System.out.println("=== LOJA JAVA ===");
    }

    // Dica 6
    public static void realizarVenda(Scanner sc) {
        System.out.print("Nome do cliente: ");
        String cliente = sc.nextLine();
        System.out.print("Nome do produto: ");
        String produto = sc.nextLine();
        System.out.print("Preço unitário: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        double subtotal = calcularSubtotal(preco, quantidade);
        double desconto = calcularDesconto(subtotal);
        double total = calcularTotal(subtotal, desconto);

        mostrarRecibo(cliente, produto, quantidade, subtotal, desconto, total);
    }

    // Dica 2
    public static double calcularSubtotal(double preco, int quantidade) {
        return preco * quantidade;
    }

    // Dica 3: 10% de desconto a partir de R$ 200
    public static double calcularDesconto(double subtotal) {
        double desconto = 0;

        if (subtotal >= 200) {
            desconto = subtotal * 0.10;
        }

        return desconto;
    }

    // Dica 4
    public static double calcularTotal(double subtotal, double desconto) {
        return subtotal - desconto;
    }

    // Dica 5
    public static void mostrarRecibo(String cliente, String produto, int quantidade,
                                     double subtotal, double desconto, double total) {
        System.out.println();
        System.out.println("=== RECIBO ===");
        System.out.println("Cliente: " + cliente);
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Subtotal: R$ " + subtotal);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total: R$ " + total);
    }

}
