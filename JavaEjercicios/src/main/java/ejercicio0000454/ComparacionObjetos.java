package ejercicio0000454;

/**
 * Ejercicio 454: Comparar referencias de objetos con el operador de igualdad.
 *
 * @author John Ortiz Ordoñez
 */
public class ComparacionObjetos {

    public static void main(String[] args) {

        // ==
        Ciudad bogota = new Ciudad(1, "Bogotá D.C.");
        Ciudad pitalito = new Ciudad(317, "Pitalito");

        if (bogota == pitalito) {
            System.out.println("Los dos objetos apuntan a la misma dirección.");
        } else {
            System.out.println("Los dos objetos tienen direcciones de memoria diferente.");
        }

        System.out.println();

        Ciudad ciudad = bogota;

        if (bogota == ciudad) {
            System.out.println("Los dos objetos apuntan a la misma dirección.");
        } else {
            System.out.println("Los dos objetos tienen direcciones de memoria diferente.");
        }

        System.out.println();

        try {
            Ciudad nombreAlternativo = (Ciudad) bogota.clone();

            if (bogota == nombreAlternativo) {
                System.out.println("Los dos objetos apuntan a la misma dirección.");
            } else {
                System.out.println("Los dos objetos tienen direcciones de memoria diferente.");
            }
            
            System.out.println();
            
            System.out.println(bogota);
            System.out.println(nombreAlternativo);
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
    }
}

class Ciudad implements Cloneable {

    private int id;
    private String nombre;

    public Ciudad() {
    }

    public Ciudad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
