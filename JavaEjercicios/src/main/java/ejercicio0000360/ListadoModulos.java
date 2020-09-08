package ejercicio0000360;

/**
 * Ejercicio 360: Listar los módulos disponibles en el JDK.
 *
 * @author John Ortiz Ordoñez
 */
public class ListadoModulos {

    public static void main(String[] args) {
        
        ModuleLayer.boot().modules()
                .stream()
                .map(Module::getName)
                .forEach(System.out::println);
    }
}
