package ejercicio0000096;

/**
 * Ejercicio 96: Declarar y Usar Arreglos.
 * 
 * @author John Ortiz Ordoñez
 */
public class DeclaracionUsoArreglos {
    public static void main(String[] args) {
        
        String[] meses = {"Enero", "Febrero", "Marzo",
                        "Abril", "Mayo", "Junio",
                        "Julio", "Agosto", "Septiembre",
                        "Octubre", "Noviembre", "Diciembre"};
        
        String[] mesesAño = new String[12];
        mesesAño[0] = "Enero";
        mesesAño[1] = "Febrero";
        mesesAño[2] = "Marzo";
        mesesAño[3] = "Abril";
        mesesAño[4] = "Mayo";
        mesesAño[5] = "Junio";
        mesesAño[6] = "Julio";
        mesesAño[7] = "Agosto";
        mesesAño[8] = "Septiembre";
        mesesAño[9] = "Octubre";
        mesesAño[10] = "Noviembre";
        mesesAño[11] = "Diciembre";
        
        System.out.println(meses[4]);
        for (int i = 0; i < mesesAño.length; i++) {
            String mes = mesesAño[i];
            
            System.out.println("El mes no. " + (i + 1) + " es " + mes);
        }
        
        // Creando un arreglo con objetos personalizados:
        Celular[] celulares = new Celular[3];
        
        celulares[0] = new Celular("Huawei", 6);
        celulares[1] = new Celular("LG", 4);
        celulares[2] = new Celular("Motorola", 2);
        
        System.out.println("\nCelulares y capacidad de memoria RAM:");
        for (Celular celular : celulares) {
            System.out.println("Marca: " + celular.getMarca() + " - RAM: " + celular.getRam());
        }
    }
}

class Celular {
    private String marca;
    private int ram;

    public Celular(String marca, int ram) {
        this.marca = marca;
        this.ram = ram;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    
}
