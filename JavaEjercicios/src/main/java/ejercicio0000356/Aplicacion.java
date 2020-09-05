package ejercicio0000356;

/**
 * 
 *
 * @author John Ortiz Ordoñez
 */
public class Aplicacion {

    public static void main(String[] args) {
        RadioAnalogo radioAnalogo = new RadioAnalogo();
        RadioDigital radioDigital = new RadioDigital();
        
        System.out.println(radioAnalogo.conectar());
        System.out.println(radioAnalogo.estaEncendido());
        radioAnalogo.encender();
        System.out.println(radioAnalogo.estaEncendido());
        radioAnalogo.apagar();
        System.out.println(radioAnalogo.estaEncendido());
        System.out.println(radioAnalogo.desconectar());
        
        System.out.println();
        
        System.out.println(radioDigital.conectar());
        System.out.println(radioDigital.estaEncendido());
        radioDigital.encender();
        System.out.println(radioDigital.estaEncendido());
        radioDigital.conectarInternet();
        radioDigital.apagar();
        System.out.println(radioDigital.estaEncendido());
        System.out.println(radioDigital.desconectar());
    }
}
