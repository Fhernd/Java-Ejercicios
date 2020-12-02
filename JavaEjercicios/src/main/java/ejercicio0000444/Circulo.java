package ejercicio0000444;

/**
 * Círculo.
 *
 * @author John Ortiz Ordoñez
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }    
}
