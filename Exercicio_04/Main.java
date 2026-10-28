package Exercicio_04;

public class Main {

    public static void main(String[] args) {

        int resultado = calcularQuadrado(5);
        System.out.println("Resultado: " + resultado);

        // Desafio adicional
        int triplo = calcularTriplo(5);
        System.out.println("Triplo: " + triplo);

    }

    public static int calcularQuadrado(int numero) {
        return numero * numero;
    }

    public static int calcularTriplo(int numero) {
        return numero * 3;
    }

    /*
     * Diferença entre void e int:
     * - void: o método só executa uma ação (ex.: imprimir) e NÃO devolve valor.
     * - int: o método devolve um número inteiro com return, e quem chamou
     *   pode guardar esse valor numa variável ou usar em outras contas.
     */
}
