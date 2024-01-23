
import java.util.Arrays;
/**
 *
 * @author Merlyn
 */
public class TrianguloSuperior {
    private int tamano;
    private char[][] matriz;

    public TrianguloSuperior(int tamano) {
        this.tamano = tamano;
        this.matriz = new char[tamano][tamano];
        for (char[] fila : matriz) {
            Arrays.fill(fila, ' ');
        }
    }

    public void imprimirTriangulo() {
        for (int i = 0; i < tamano; i++) {
            for (int j = i; j < tamano; j++) {
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
