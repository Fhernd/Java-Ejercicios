package ejercicio0000018;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class Vehiculo {
    private int numeroRuedas;
    private String marca;
    public String paisFabricacion;

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    private void calcularCapacidadTransporte(){
        //...
    }
}

class Camion extends Vehiculo {

    public Camion() {
        setMarca("Ford");
        
    }
}

