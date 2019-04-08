/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import java.util.Scanner;
/**
 *
 * @author Jhose
 */
public class AbstractFactory {

    public static int nroAutos=3;
    public static int nroScooters=2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        FabricaVehiculo fabrica;
        Automovil[] autos = new Automovil[nroAutos];
        Scooter[] scooters = new Scooter[nroScooters];
        
        System.out.print("Desea utilizar vehiculos electricos (1) o gasolineros(2): ");
        String eleccion = reader.next();
        
        //Desidimos si van a crearse vehiculos electricos o gasolineros
        if(eleccion.equals("1")){
            fabrica = new FabricaVehiculoElectricidad();
        }
        else{
            fabrica = new FabricaVehiculoGasolina();
        }
        //Creamos los vehiculos
        //Automoviles
        for(int index = 0; index < nroAutos; index++){
            autos[index] = fabrica.crearAutomovil("estandar", "amarillo", 6+index, 3.2);
        }
        //Sccoters
        for(int index = 0; index < nroScooters; index++){
            scooters[index] = fabrica.crerScooter("clasico", "rojo", 2+index);
        }
        
        //Mostramos Resultados
        //Automoviles
        for(Automovil auto : autos){
            auto.mostrarCaracteristicas();
        }
        //Scooter
        for(Scooter scooter : scooters){
            scooter.mostrarCaracteristicas();
        }
    }
    
}
