/**
 * Created by alumno on 02/09/16.
 */
public class Rectangulo implements Figura{
    public int base;
    public int altura;

    public Rectangulo(int i, int i1) {
        this.base=i;
        this.altura=i1;
    }

    public double area() {
        double areadeRectangulo= base*altura;
        return areadeRectangulo;
    }

    public double perimetro() {
        double perimetrodeRectangulo= (base * 2) +(altura *2);
        return perimetrodeRectangulo;
    }
}
