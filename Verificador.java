/**
 * Universidad del Valle de Guatemala
 * Algoritmos y estructura de datos - Sección 10
 * Hoja de trabajo#6
 * @author Christopher García 20541
 * @author Maria Fernanda Argueta 20458
 */
/**
 * Se utiliza comparator en vez de comparable porque este segundo
 * solo recibe un parametro y mediante este se realiza la comparación.
 * En cambio comparator recibe dos parámetros y para esta hoja dos cartas.
 */
import java.util.Comparator;

/**
 * Clase Verificador que implementa Comparator
 * Verifica si dos cartas son iguales
 */
public class Verificador implements Comparator<Cartas>{

    /**
     * Override del método compare
     * Permite comparar dos Strings, cartas en este caso
     * @param o1: Carta 1
     * @param o2: Carta 2
     * @return int: 0 si son iguales
     */
    @Override
    public int compare(Cartas o1, Cartas o2) {
        return o1.getTipo().compareTo(o2.getTipo());
    }
    
}
