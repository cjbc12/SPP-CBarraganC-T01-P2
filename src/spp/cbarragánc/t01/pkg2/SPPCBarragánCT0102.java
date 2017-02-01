
package spp.cbarragánc.t01.pkg2;
import java.util.Scanner;
/**
 *
 * @author Carlos Javier Barragán Carrión
 * Matrícula: A01410357
 * Carrera: IMT
 */
public class SPPCBarragánCT0102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double base,altu, sup, per;
        Scanner kb = new Scanner(System.in);
        
        
        System.out.println("Bienvenido a calculador de Superficie y Perímetros de Barra");
        System.out.println("\nIntroducir base");
        base = kb.nextDouble();
        System.out.println("Introducir altura");
        altu =kb.nextDouble();
        
        sup  = base*altu;
        per = 2*base + 2*altu;
        
        System.out.println("\nEl rectángulo tiene las siguiente características:");
        System.out.println("Superficie: " + sup);
        System.out.println("Perímetro: "+per);
        
        
    }
    
}
