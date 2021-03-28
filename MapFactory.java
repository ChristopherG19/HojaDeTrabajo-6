/**
 * Universidad del Valle de Guatemala
 * Algoritmos y estructura de datos - Sección 10
 * Hoja de trabajo#6
 * @author Christopher García 20541
 * @author Maria Fernanda Argueta 20458
 */

/**
 * Patrón de diseño Factory utilizado para decidir que implementación de Map utilizar
 */
public class MapFactory<A, B> {

    /**
     * Método GetTypeofMap: Escoge que implementación de Map utilizar
     * @param entry: Decisión del usuario
     * @return: Implementación de Map
     */
    public Mapas<A, B> GetTypeofMap(int entry) {
        // seleccion del tipo de mapa a utilizar:
        if (entry == 1){
            return new HashmapC<A, B>(); 
        }
        else if(entry == 2){
            return new TreeMapC<A, B>();
        }
        else if(entry == 3){
            return new LinkedHashMapC<A, B>();
        }
        else{
            return new HashmapC<A, B>();
        }
    }
      
}
