
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camilobossa
 */
public class Piso {
    private int parqueaderos;
    private ArrayList<Vehiculo> vehiculos;

    public Piso(int parqueaderos) {
        this.parqueaderos = parqueaderos;
        vehiculos=new ArrayList<>();
    }

    public Piso(int parqueaderos, ArrayList<Vehiculo> vehiculos) {
        this.parqueaderos = parqueaderos;
        this.vehiculos = vehiculos;
    }

    public int getParqueaderos() {
        return parqueaderos;
    }

    public void setParqueaderos(int parqueaderos) {
        this.parqueaderos = parqueaderos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        String reporte="";
        for(int i=0; i<vehiculos.size();i++)
        {
            reporte+=vehiculos.get(i).getPlaca();
        }
        return reporte;
    }
    
    
    
    private int parqueaderosDisponibles;
    
    
}
