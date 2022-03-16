
package viajes;

/**
 *
 * @author Gabriel Lueiro Rivas
 */
public class PuntoEncuentro {

    private String nombre;
    private double coordenadaX;
    private double coordenadaY;

    public PuntoEncuentro(String direccion, double coordenadaX, double coordenadaY) {
        this.nombre = direccion;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }


    @Override
    public String toString() {
        return nombre; //To change body of generated methods, choose Tools | Templates.
    }
}
