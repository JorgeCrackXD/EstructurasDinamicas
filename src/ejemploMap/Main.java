package ejemploMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> mapa = new HashMap<>(); //Declaramos un mapa nuevo

        mapa.put(1, "JorgitoCantu"); //Insertamos valores a nuestro mapa, primero el indice y luego el string
        mapa.put(2, "MarianaTorres");
        mapa.put(3, "SamanthaGarza");
        mapa.put(4, "PaolaTamez");
        mapa.put(5, "GustavoSanchez");

        for (Map.Entry<Integer, String> mapas: mapa.entrySet()) //Por cada entrada (lugar) del mapa, recorre
        {
            Integer key = mapas.getKey(); //Con esto declaramos una variable que tomará el key de cada elemento del mapa
            String valor = mapas.getValue(); //Lo mismo pero guardará el dato de cada index

            System.out.println(key + " ----> " + valor); //Imprimimos el mapa y el valor
        }
    }
}
