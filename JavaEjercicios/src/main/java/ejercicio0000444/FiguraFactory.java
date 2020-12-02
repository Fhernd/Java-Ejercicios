package ejercicio0000444;

/**
 * FiguraFactory.
 *
 * @author John Ortiz Ordoñez
 */
public class FiguraFactory {

    public static Figura crearFigura(TipoFigura tipoFigura) {
        return switch (tipoFigura) {
            case TRIANGULO -> new Triangulo();
            case RECTANGULO -> new Rectangulo();
            default -> new Circulo();
        };
    }
}
