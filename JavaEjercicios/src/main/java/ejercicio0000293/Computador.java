package ejercicio0000293;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author John Ortiz Ordoñez
 */
@XmlRootElement
public class Computador {
    private int id;
    private String marca;
    private int agnioFabricacion;

    public Computador() {
    }

    public Computador(int id, String marca, int agnioFabricacion) {
        this.id = id;
        this.marca = marca;
        this.agnioFabricacion = agnioFabricacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAgnioFabricacion() {
        return agnioFabricacion;
    }

    public void setAgnioFabricacion(int agnioFabricacion) {
        this.agnioFabricacion = agnioFabricacion;
    }
}
