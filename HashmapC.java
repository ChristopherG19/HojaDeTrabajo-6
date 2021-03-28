/**
 * Universidad del Valle de Guatemala
 * Algoritmos y estructura de datos - Sección 10
 * Hoja de trabajo#6
 * @author Christopher García 20541
 * @author Maria Fernanda Argueta 20458
 */
/**
 * Imports de librerias de java
 */
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;

/**
 * Clase HashMapC que extiende de HashMap e implementa la interfaz mapas que contiene 
 * todos los métodos a utilizar
 */
public class HashmapC<A,B> extends HashMap<A,B> implements Mapas<A,B>{

    /**
     * VersionUID única de este HashMap
     */
    private static final long serialVersionUID = 1L;

    /**
     * Inicio de métodos Overrideados
     */

     /**
      * Se establece un dato en el Map utilizado
      */
    @Override
    public Set<A> Keyset() {
        return keySet();
    }

    /**
     * Se elimina un dato del Map utilizado
     */
    @Override
    public void Remove(A Dato) {
        remove(Dato);
    }

    /**
     * Se agrega un dato e información en el Map utilizado
     */
    @Override
    public void Put(A Dato, B info) {
        put(Dato, info);
        
    }

    /**
     * Se comprueba la existencia de un dato en el Map utilizado
     */
    @Override
    public boolean ContainsKey(A Dato) {
        return containsKey(Dato);
    }

    /**
     * Se comprueba la existencia de información de un dato en el Map utilizado
     */
    @Override
    public boolean ContainsValue(B info) {
        return containsValue(info);
    }

    /**
     * Getter para obtener un dato del Map utilizado
     */
    @Override
    public B GetB(A Dato) {
        return get(Dato);
    }

    /**
     * Se comprueba si el Map utilizado está vacío o no
     */
    @Override
    public boolean IsEmpty() {
        return isEmpty();
    }

    /**
     * Se comprueba el tamaño del Map utilizado
     */
    @Override
    public int Tamaño() {
        return size();
    }

    /**
     * Se reemplaza un dato e información del Map utilizado
     */
    @Override
    public void Reemplazo(A Dato, B info) {
        replace(Dato, info);
    }

    /**
     * Se obtienen todos los valores de la colección
     */
    @Override
    public Collection<B> Valores() {
        return values();
    }
    
}
