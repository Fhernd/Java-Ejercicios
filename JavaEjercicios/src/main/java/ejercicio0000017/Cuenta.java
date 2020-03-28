package ejercicio0000017;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class Cuenta {
    private String nombre;
    private String email;
    private double saldo;
    private int retirosPermitidosPorDia;

    public Cuenta(String nombre, String email, double saldo, int retirosPermitidosPorDia) {
        this.nombre = nombre;
        this.email = email;
        this.saldo = saldo;
        this.retirosPermitidosPorDia = retirosPermitidosPorDia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getRetirosPermitidosPorDia() {
        return retirosPermitidosPorDia;
    }

    public void setRetirosPermitidosPorDia(int retirosPermitidosPorDia) {
        this.retirosPermitidosPorDia = retirosPermitidosPorDia;
    }
    
    
}
