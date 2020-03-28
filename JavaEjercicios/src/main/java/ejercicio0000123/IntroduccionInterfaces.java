package ejercicio0000123;

/**
 * Ejercicio 123: Introduccion al uso de interfaces.
 * 
 * @author John Ortiz Ordoñez
 */
public class IntroduccionInterfaces {

    public static void main(String[] args) {
        
        Radio radio = new RadioAnalogo();
    }
}

interface Radio{
    public void subirVolumen(int nivel);
    public void encender();
    public void apagar();
    public void cambiarBanda();
}

class RadioAnalogo implements Radio{

    @Override
    public void subirVolumen(int nivel) {
        
    }

    @Override
    public void encender() {
        
    }

    @Override
    public void apagar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cambiarBanda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
