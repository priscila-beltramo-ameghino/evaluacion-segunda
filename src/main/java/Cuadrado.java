import java.util.List;

/**
 * Created by damian on 26/08/16.
 */
public class Cuadrado {
    public int lado;

    public Cuadrado(int i) {
        this.lado = i;
    }

    public double area() {
        double areadeCuadrado = lado *lado;
        return areadeCuadrado;
    }

    public double perimetro() {
        double perimetrodeCuadrado= lado *4;
        return perimetrodeCuadrado;
    }

    public double sumarAreasDeCuadrados(List<Cuadrado> cuadrados) {
        double sumadea=0;
        for(Cuadrado cuadradito : cuadrados) {
            sumadea = sumadea + cuadradito.area();
        }
        return sumadea;
    }

