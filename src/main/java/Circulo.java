/**
 * Created by alumno on 02/09/16.
 */
public class Circulo {
    public int radio;

    public Circulo(int i) {
        this.radio=i;
    }

    public double area() {
        double areaDeCirculo= Math.PI * (this.radio * this.radio);
        return areaDeCirculo;
    }

    public double perimetro() {
        double perimetroDeCirculo= Math.PI * this.radio ;
        return perimetroDeCirculo;
    }
}
