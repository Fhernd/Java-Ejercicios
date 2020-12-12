package ejercicio0000451;

/**
 * Ejercicio 451: Implementar el patrón Builder en la instanciación de objetos
 * de una clase.
 *
 * @author John Ortiz Ordoñez
 */
public class PatronBuilder {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria.Builder("123-456-7890")
                .conCliente("Oliva")
                .conSaldo(1000000)
                .conInteres(3)
                .build();
        
        System.out.println(cuenta.getNumero());
        System.out.println(cuenta.getCliente());
        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getInteres());
        
        System.out.println();
        
        CuentaBancaria cuenta2 = new CuentaBancaria.Builder("991-456-7890")
                .conCliente("Oliva")
                .build();
        
        System.out.println(cuenta2.getNumero());
        System.out.println(cuenta2.getCliente());
    }
}

class CuentaBancaria {

    private String cliente;
    private String numero;
    private double saldo;
    private double interes;

    public static class Builder {

        private String cliente;
        private String numero;
        private double saldo;
        private double interes;
        
        public Builder(String numero) {
            this.numero = numero;
        }
        
        public Builder conCliente(String cliente) {
            this.cliente = cliente;
            
            return this;
        }
        
        public Builder conSaldo(double saldo) {
            this.saldo = saldo;
            
            return this;
        }
        
        public Builder conInteres(double interes) {
            this.interes = interes;
            
            return this;
        }
        
        public CuentaBancaria build() {
            CuentaBancaria cuenta = new CuentaBancaria();
            cuenta.numero = this.numero;
            cuenta.cliente = this.cliente;
            cuenta.saldo = this.saldo;
            cuenta.interes = this.interes;
            
            return cuenta;
        }
    }

    private CuentaBancaria() {

    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
}
