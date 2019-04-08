/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;
import java.util.Scanner;

/**
 *
 * @author Jhose
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ConstructorDocumentacionVehiculo constructor;
        
        System.out.print("Desea generar documento HTML (1) o PDF(2): ");
        String eleccion = reader.next();
        
        if(eleccion.equals("1")){
            constructor = new ConstructorDocumentacionVehiculoHtml();
        }
        else{
            constructor = new ConstructorDocumentacionVehiculoPdf();
        }
        
        Vendedor v = new Vendedor(constructor);
        Documentacion documentacion = v.construye("Jhosep");
        documentacion.imprime();
        
    }
    
}
