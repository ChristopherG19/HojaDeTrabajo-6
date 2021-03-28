/**
 * Universidad del Valle de Guatemala
 * Algoritmos y estructura de datos - Sección 10
 * Hoja de trabajo#6
 * @author Christopher García 20541
 * @author Maria Fernanda Argueta 20458
 */
import java.io.File;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        
      boolean Verificador = true;
      Scanner scanner = new Scanner(System.in);
      int conMon = 0;
      int contra = 0;
      int conhec = 0;
      MapFactory<String, Cartas> TipoM = new MapFactory<String, Cartas>();
      Mapas<String, Cartas> CajaCartas;
      Mapas<String, Cartas> CajaCartasUsuario;
      ArrayList<String> CartasArchivo = leerArchivo("cards_desc.txt");

      System.out.println("\n---> Bienvenido(a) nuevo(a) usuario(a) <---");
      System.out.println("Antes de comenzar deberas escoger la implementacion de Map\n");

      System.out.println("---> Implementaciones disponibles <---");
      System.out.println("1.) HashMap");
      System.out.println("2.) TreeMap");
      System.out.println("3.) LinkedHashMap\n");
      System.out.print("Eleccion: ");
      int eleccion = 0;

      try {
        eleccion = scanner.nextInt();
        if (eleccion <= 0){
          System.out.println("\nFuera de rango\n");
        } else if (eleccion > 3){
          System.out.println("\nFuera de rango\n");
        } 

      } catch (Exception e) {
        System.out.println("Error, ingreso de opcion incorrecta");
      }

      System.out.println();
      CajaCartas = TipoM.GetTypeofMap(eleccion);
      CajaCartasUsuario = TipoM.GetTypeofMap(eleccion);

      for(String carta: CartasArchivo){
        String NombreC = carta.split("\\|")[0];
        String TipoC = carta.split("\\|")[1];
        Cartas cartaNueva = new Cartas(NombreC, TipoC);
        CajaCartas.Put(NombreC, cartaNueva);
      }
      System.out.println();

      while(Verificador){

        System.out.println("---> Opciones disponibles <---");
        System.out.println();
        System.out.println("1.) Agregar una carta a tu coleccion");
        System.out.println("2.) Buscar una carta especifica");
        System.out.println("3.) Información de cada carta en tu coleccion");
        System.out.println("4.) Información de cada carta en tu coleccion ordenadas por tipo");
        System.out.println("5.) Información de cada carta existente");
        System.out.println("6.) Información de cada carta existente ordenadas por tipo");
        System.out.println("7.) Salir del programa");
        
        int eleccion2 = 0;
        try {
          eleccion2 = scanner.nextInt();
          if (eleccion2 < 1){
            System.out.println("\nFuera de rango\n");
          } else if (eleccion2 > 7){
            System.out.println("\nFuera de rango\n");
          } else {
            Verificador = false;
          }
        } catch (Exception e) {
          System.out.println("Error, ingreso de opcion incorrecta");
        }
       
        String NombreCartaUsuario;

        if(eleccion2 == 1){

          System.out.print("\nNombre de la carta que deseas agregar: ");
          NombreCartaUsuario = scanner.nextLine();
          if(CajaCartas.ContainsKey(NombreCartaUsuario)){

            if(!CajaCartasUsuario.ContainsKey(NombreCartaUsuario)){
              CajaCartasUsuario.Put(NombreCartaUsuario, CajaCartas.GetB(NombreCartaUsuario));
            } else {
              CajaCartasUsuario.GetB(NombreCartaUsuario).setNumCarta(1);
            }
            System.out.println("\nListo, has aumentado tu coleccion con esta nueva carta");
            System.out.println("Carta: " + CajaCartasUsuario.GetB(NombreCartaUsuario).toString());

          }
          System.out.println("\nError! La carta no se encuentra dentro de las cartas disponibles");

        } else if (eleccion2 == 2){

          System.out.print("\nNombre de la carta que deseas buscar: ");
          NombreCartaUsuario = scanner.nextLine();
          if(CajaCartasUsuario.ContainsKey(NombreCartaUsuario)){
            System.out.println("\nHemos encontrado lo siguiente: ");
            System.out.println("Tipo: "+ CajaCartas.GetB(NombreCartaUsuario).getTipo());
          } else {
            System.out.println("\nLo sentimos, ninguna carta coincide en tu coleccion"); 
          }

        } else if (eleccion2 == 3){

          for(String CartaMagica: CajaCartasUsuario.Keyset()){
            System.out.println("\nNombre de la carta: " + CartaMagica);
            System.out.println("Tipo de la carta: " + CajaCartasUsuario.GetB(CartaMagica).getTipo());
            System.out.println("Cantidad de la carta: " + CajaCartasUsuario.GetB(CartaMagica).getNumCarta());
          }

        } else if (eleccion2 == 4){

          if(!CajaCartasUsuario.IsEmpty()){
            ArrayList<Cartas> CartasMagicas = new ArrayList<Cartas>(CajaCartasUsuario.Valores());
            CartasMagicas.sort(new Verificador());
            for(Cartas cartaunica : CartasMagicas){
              System.out.println(cartaunica.toString());
            }
          } else {
            System.out.println("Tu coleccion se encuentra vacia");
          }

        } else if (eleccion2 == 5){

          for(Cartas cartamagica : CajaCartas.Valores()){
            System.out.println(cartamagica);
          }

        } else if (eleccion2 == 6){

          ArrayList<Cartas> CartasMagicas = new ArrayList<Cartas>(CajaCartasUsuario.Valores());
          CartasMagicas.sort(new Verificador());
          for(Cartas cartaunica : CartasMagicas){
            System.out.println(cartaunica.toString());
          }

        } else if (eleccion2 == 7){
          Verificador = false;
        } else {
          Verificador = true;
        }


      }

      for(String linea : CartasArchivo){
        String[] linea2 = linea.split("\\|");
        List<String> Datos = Arrays.asList(linea2);

        if(Datos.get(1).equals("Monstruo")){
          conMon++;
        }else if(Datos.get(1).equals("Trampa")){
          contra++;
        } else if(Datos.get(1).equals("Hechizo")){
          conhec++;
        }     
      }

      System.out.println();
      System.out.println();
      System.out.println("-----> Cartas totales <-----");
      System.out.println();
      System.out.println("Carta Tipo monstruo: " +conMon+" en total");
      System.out.println("Carta Tipo trampa: " +contra+" en total");
      System.out.println("Carta Tipo hechizo: "+conhec+" en total");

      scanner.close();
    }

    public static ArrayList<String> leerArchivo(String nombreArchivo){

        ArrayList<String> Info = new ArrayList<String>();
    
        try {
    
          File Archivo = new File(nombreArchivo);
          Scanner Lector = new Scanner(Archivo);
    
          while(Lector.hasNextLine()){
            String Line = Lector.nextLine();
            Info.add(Line);
          }
          Lector.close();
    
        } catch (Exception e){
          System.out.println("Error! Archivo no encontrado");
          e.printStackTrace();
        }
    
        return Info;
      }
  
}