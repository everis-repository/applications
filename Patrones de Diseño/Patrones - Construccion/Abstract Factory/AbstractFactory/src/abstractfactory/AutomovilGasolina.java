/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;
import javax.swing.JOptionPane;
/**
 *
 * @author Jhose
 */
public class AutomovilGasolina extends Automovil{

    public AutomovilGasolina(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        JOptionPane.showMessageDialog(null, "Automovil Gasolinero de modelo: " + _modelo + " de color: " + _color + " de potencia: " + _potencia + " de espacio: " + _espacio);
    }
    
}
