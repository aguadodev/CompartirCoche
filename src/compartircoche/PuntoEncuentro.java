package compartircoche;

public class PuntoEncuentro {

    private final String nombre;
    private final double altitud;
    private final double latitud;



    public PuntoEncuentro(String nombre, double altitud, double latitud) {
        this.nombre = nombre;
        this.altitud = altitud;
        this.latitud = latitud;
    }

    public String getNombre() {
        return nombre;
    }

    public double getAltitud() {
        return altitud;
    }

    public double getLatitud() {
        return latitud;
    }
}
