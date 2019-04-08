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
public abstract class Scooter {
    protected String _modelo;
    protected String _color;
    protected int _potencia;
    
    public Scooter(String modelo, String color, int potencia){
        this._modelo = modelo;
        this._color = color;
        this._potencia = potencia;
    }
    
    public abstract void mostrarCaracteristicas();
}
