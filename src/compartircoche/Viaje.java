package compartircoche;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Viaje {

    protected final Conductor conductor;
    protected final PuntoEncuentro puntoSalida;
    protected final PuntoEncuentro puntoLlegada;
    protected final LocalDateTime fechaHoraSalida;

    protected Pasajero[] pasajeros;

    public Viaje(Conductor conductor, LocalDateTime fechaHoraSalida, PuntoEncuentro puntoSalida,
                 PuntoEncuentro puntoLlegada, int plazasOfertadas) {
        this.conductor = conductor;
        this.fechaHoraSalida = fechaHoraSalida;
        this.puntoLlegada = puntoLlegada;
        this.puntoSalida = puntoSalida;
        pasajeros = new Pasajero[plazasOfertadas];
    }

    public void addPasajero(Pasajero pasajero) {
        for (int i = 0; i < pasajeros.length; i++) {
            if (pasajeros[i] == null) {
                pasajeros[i] = pasajero;
                return;
            }
        }
        System.out.println("No se ha podido agregar al pasajero " + pasajero.getNombre() + ", el coche está lleno.");
    }

    public int plazasLibres() {
        int c = 0;
        for (Pasajero pasajero : pasajeros) if (pasajero == null) c++;
        return c;
    }

    public String toString() {
        return "Viaje compartido:\n" +
                "==================\n" +
                "Fecha y hora: " + fechaHoraSalida.toString() + "\n" +
                "Lugar de salida: " + puntoSalida.getNombre() + " (" + puntoSalida.getAltitud() + ", " + puntoSalida.getLatitud() + ")\n" +
                "Lugar de llegada: " + puntoLlegada.getNombre() + " (" + puntoLlegada.getAltitud() + ", " + puntoLlegada.getLatitud() + ")\n" +
                "Plazas ofertadas: " + pasajeros.length + "\n" +
                "Conductor: " + conductor.getNombre() + "\n" +
                "Coche: " + conductor.getCoche().getMarca() + " " + conductor.getCoche().getColor() + ", " + conductor.getCoche().getPlazas() +
                    " plazas, matrícula " + conductor.getCoche().getMatricula();
    }
}
