import java.util.Arrays;
import java.util.List;

/**
 * A classe Main demonstra a utilização da biblioteca NumberUtils.
 */

public class Main {
    /**
     * O metodo main e o ponto de entrada do programa.
     * Cria uma lista de números e utiliza a biblioteca NumberUtils para efetuar vários cálculos.
     * Os resultados são depois impressos na consola.
     *
     * @param args argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Criar uma lista de números
        List<Double> numbers = Arrays.asList(10.1, 1.2, -2.3, 3.4, -4.5, 5.6, 45.7, 7.8, 8.9, 9.0, 10.1);

        // Calcular a média
        double mean = NumberUtils.calcularMedia(numbers);
        System.out.println("Média: " + mean);

        // Calcular a mediana
        double median = NumberUtils.calcularMediana(numbers);
        System.out.println("Mediana: " + median);
    }
}
