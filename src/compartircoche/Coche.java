package UD5.poo.compartircoche;

public class Coche extends Vehiculo {
    public Coche(String marca, String color, int plazas, String matricula, Combustible combustible, DistintivoAmbiental distintivoAmbiental) {
        this.marca = marca;
        this.color = color;
        this.plazas = plazas;
        this.combustible = combustible;
        this.distintivoAmbiental = distintivoAmbiental;

        if (esMatriculaValida(matricula)) {
            this.matricula = matricula;
        } else {
            this.matricula = "XXXX";
        }
    }

    public Coche(String marca, String color, int plazas, String matricula) {
        this(marca, color, plazas,matricula, null, null);
    }

    public String toString() {
        return marca + " " + color + ", " + plazas + " plazas, " + "matrícula " + matricula;
    }

    //Métodos necesarios para validar matrícula
    boolean esMatriculaValida(String matricula) {
        boolean matCorrecta = true;

        if (matricula.length() != 7) {
            matCorrecta = false;

        } else {
            //Comprobar si son números
            for (int i = 0; i < matricula.length() - 3; i++) {
                if (!Character.isDigit(matricula.charAt(i))) {
                    matCorrecta = false;
                }
            }

            //Comprobar si son letras
            for (int i = 4; i < matricula.length(); i++) {
                if (!esLetraValida(matricula.charAt(i))) {
                    matCorrecta = false;
                    break;
                }
            }
        }
        return matCorrecta;
    }

    boolean esLetraValida(char ch) {
        final String VOCALES = "aeiouáéíóúñAEIOUÁÉÍÓÚÜÑ";

        return VOCALES.indexOf(ch) == -1;
    }
}
