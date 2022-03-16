package compartircoche;

public class Conductor extends Persona {

    protected final Coche coche;

    public Conductor(String nombre, Coche coche) {
        super(nombre);
        this.coche = coche;
    }

    public Coche getCoche() {
        return coche;
    }
}
