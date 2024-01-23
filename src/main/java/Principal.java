
/**
 *
 * @author Merlyn
 */
public class Principal {

    
    public static void main(String[] args) {
        int tamanoMatriz = 5;

        System.out.println("Triángulo Superior:");
        TrianguloSuperior trianguloSuperior = new TrianguloSuperior(tamanoMatriz);
        trianguloSuperior.imprimirTriangulo();
        trianguloSuperior.imprimirMatriz();

        System.out.println("\nTriángulo Inferior:");
        TrianguloInferior trianguloInferior = new TrianguloInferior(tamanoMatriz);
        trianguloInferior.imprimirTriangulo();
        trianguloInferior.imprimirMatriz();
    
    }
    
}
