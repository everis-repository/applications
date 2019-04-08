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
public class ScooterElectricidad extends Scooter {

    public ScooterElectricidad(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        JOptionPane.showMessageDialog(null, "Scooter Electrico de modelo: " + _modelo + " de color: " + _color + " de potencia: " + _potencia);
    }
    
}
