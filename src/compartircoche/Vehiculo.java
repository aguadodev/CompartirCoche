package UD5.poo.compartircoche;

public class Vehiculo {
    protected enum Combustible {DIESEL, GASOLINA, ELECTRICO, HIBRIDO}
    protected enum DistintivoAmbiental{ETIQUETA0, ETIQUETAECO, ETIQUETAC, ETIQUETAB}
    Combustible combustible;
    DistintivoAmbiental distintivoAmbiental;
    protected String marca;
    protected String color;
    protected int plazas;
    protected String matricula;

    public String toString() {
        return "Datos vehículo:" +
                "\n" + marca + " " + color + ", " + plazas + " plazas, " + "matrícula " + matricula +
                "\nCombustible: " + combustible +
                "\nDistintivo ambiental: " + distintivoAmbiental;
    }
}
