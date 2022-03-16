package compartirCoche;

public class Conductor extends Persona {

    protected Coche coche;

    public Conductor(String nombre, Coche coche) {
        super(nombre);
        this.coche = coche;
    }

    public String getNombre(){
        return nombre;
    }
}
