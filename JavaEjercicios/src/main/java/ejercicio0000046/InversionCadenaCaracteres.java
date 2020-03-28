package ejercicio0000046;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class InversionCadenaCaracteres {
    public static void main(String[] args){
        String lenguaje = "Java es un lenguaje de programación";
        
        StringBuilder sb = new StringBuilder(lenguaje);
        
        System.out.println(sb.reverse());
        
        Stack<String> palabras = new Stack<>();
        
        StringTokenizer st = new StringTokenizer(lenguaje, " ");
        
        while(st.hasMoreTokens()){
            palabras.add(st.nextToken());
        }
        
        while(!palabras.empty()){
            System.out.print(palabras.pop());
            System.out.print(' ');
        }
    }
}
