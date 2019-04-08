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
public interface FabricaVehiculo {
    Automovil crearAutomovil(String modelo, String color, int potencia, double espacio);
    Scooter crerScooter(String modelo, String color, int potencia);
}
