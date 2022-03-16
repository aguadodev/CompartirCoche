package compartircoche;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 *
 * @author Roberto Santos Cordeiro
 */
public class Viaje {
    protected Conductor conductor;
    protected LocalDateTime fechaYHoraSalida;
    protected PuntoEncuentro puntoSalida;
    protected PuntoEncuentro puntoLlegada;
    protected byte plazas;
    protected Pasajero[] pasajeros;
    
    // CONSTRUCTOR
    public Viaje(Conductor conductor, LocalDateTime fechaYHoraSalida, 
            PuntoEncuentro PuntoSalida, PuntoEncuentro PuntoLlegada, int plazas) {
        this.conductor = conductor;
        this.fechaYHoraSalida = fechaYHoraSalida;
        this.puntoSalida = PuntoSalida;
        this.puntoLlegada = PuntoLlegada;
        this.plazas = (byte)plazas;
        pasajeros = new Pasajero[0];
    }
    
    // MÉTODOS
    void addPasajero(Pasajero pasajero){
        
        if(pasajeros.length < plazas){
            pasajeros = Arrays.copyOf(pasajeros, pasajeros.length + 1);
            pasajeros[pasajeros.length - 1] = pasajero;
        }
    }
    
    public int plazasLibres(){
        return plazas - pasajeros.length;
    }
    
    public int plazasOcupadas(){
        return pasajeros.length;
    }

    @Override
    public String toString() {
        String nomPasajeros = "";
        
        for(Pasajero pasajero : pasajeros){
            nomPasajeros += pasajero.nombre + "\n\t";
        }
        
        return "Viaje{" + "\n\tConductor: " + conductor.nombre + "\n\tFecha y hora de salida: " 
                + fechaYHoraSalida + "\n\tPunto de salida: " + puntoSalida.nombre 
                + "\n\tPunto de llegada: " + puntoLlegada.nombre + "\n\tPlazas: " + plazas 
                + "\n\n\tPasajeros:\n\t" + nomPasajeros + "\n}";
    }

    
}
