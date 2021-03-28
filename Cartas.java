/**
 * Universidad del Valle de Guatemala
 * Algoritmos y estructura de datos - Sección 10
 * Hoja de trabajo#6
 * @author Christopher García 20541
 * @author Maria Fernanda Argueta 20458
 */

/**
 * Clase Cartas que implementa la interfaz Comparable
 * Analiza y maneja la información de las cartas
 */
public class Cartas implements Comparable<Cartas>{
    
    /**
     * Atributos de una carta
     */
    private String NombreC;
    private String TipoC;
    private int NumCarta = 0;

    /**
     * Constructor
     * @param Nombre: Nombre de la carta
     * @param Tipo: Tipo de la carta
     */
    public Cartas(String Nombre, String Tipo){
        NombreC = Nombre;
        TipoC = Tipo;
    }

    /**
     * Getters de los atributos: Nombre, tipo y número de carta
     * @return
     */
    public String getNombre(){
        return NombreC;
    }

    public String getTipo(){
        return TipoC;
    }

    public int getNumCarta() {
        return NumCarta;
    }

    /**
     * Setter para modificar el número de la carta
     * @param numCarta: Nuevo número de la carta
     */
    public void setNumCarta(int numCarta) {
        this.NumCarta += numCarta;
    }

    /**
     * Override del método compareTo que compara
     * dos cartas para saber si son iguales
     */
    @Override
    public int compareTo(Cartas o) {
        String NombreCom = o.getNombre();
        return NombreC.compareTo(NombreCom);
    }

    /**
     * Método toString
     */
    public String toString(){
        return "\nNombre de la carta: " + NombreC + "\nTipo: " + TipoC + "\nNo. "+ NumCarta;
    }
}
