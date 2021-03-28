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
import java.util.Collection;
import java.util.Set;

 /**
  * Interface Mapas 
  * @param A: Tipo de dato (Genéricos)
  * @param B: Tipo de dato (Genéricos)
  */
public interface Mapas<A,B>{

    /**
     * Métodos que utilizaran todas las implementaciones de Map
     */
    public Set<A> Keyset();
    public void Remove(A Dato);
    public void Put(A Dato, B info);
    public boolean ContainsKey(A Dato);
    public boolean ContainsValue(B info);
    public B GetB(A Dato);
    public boolean IsEmpty();
    public int Tamaño();
    public void Reemplazo(A Dato, B info);
    public Collection<B> Valores();
}
