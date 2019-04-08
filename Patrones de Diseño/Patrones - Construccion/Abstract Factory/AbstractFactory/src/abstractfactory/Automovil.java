/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Jhose
 */
public abstract class Automovil {
    protected String _modelo;
    protected String _color;
    protected int _potencia;
    protected double _espacio;
    
    public Automovil(String modelo, String color, int potencia, double espacio){
        this._modelo = modelo;
        this._color = color;
        this._potencia = potencia;
        this._espacio = espacio;
    }
    
    public abstract void mostrarCaracteristicas();
}
