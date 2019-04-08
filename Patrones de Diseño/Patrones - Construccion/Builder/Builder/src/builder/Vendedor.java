/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Jhose
 */
public class Vendedor {
    protected ConstructorDocumentacionVehiculo constructor;
    
    public Vendedor(ConstructorDocumentacionVehiculo c){
        this.constructor = c;
    }
    
    public Documentacion construye(String nombreCliente){
        constructor.construyeSolicitudPedido(nombreCliente);
        constructor.construyeSolicitudMatriculacion(nombreCliente);
        Documentacion documentacion = constructor.resultado();
        return documentacion;
    }
}
