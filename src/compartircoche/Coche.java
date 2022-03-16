package compartircoche;

public class Coche {


    protected final String marca;
    protected final String color;
    protected final int plazas;
    protected final String matricula;

    public Coche(String marca, String color, int plazas, String matricula) {
        this.marca = marca;
        this.color = color;
        this.plazas = plazas;
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getPlazas() {
        return plazas;
    }

    public String getMatricula() {
        return matricula;
    }
}
