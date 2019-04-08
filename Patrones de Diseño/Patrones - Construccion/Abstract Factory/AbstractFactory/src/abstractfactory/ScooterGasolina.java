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
public class ScooterGasolina extends Scooter{

    public ScooterGasolina(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        JOptionPane.showMessageDialog(null, "Scooter Gasolinero de modelo: " + _modelo + " de color: " + _color + " de potencia: " + _potencia);
    }
    
}
