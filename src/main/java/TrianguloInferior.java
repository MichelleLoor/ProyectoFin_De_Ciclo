
import java.util.Arrays;

public class TrianguloInferior {
    private int tamano;
    private char[][] matriz;

    public TrianguloInferior(int tamano) {
        this.tamano = tamano;
        this.matriz = new char[tamano][tamano];
        for (char[] fila : matriz) {
            Arrays.fill(fila, ' ');
        }
    }

    public void imprimirTriangulo() {
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j] = 'Y';
            }
        }
    }

    public void imprimirMatriz() {
        for (char[] fila : matriz) {
            System.out.println(new String(fila));
        }
    }
}
