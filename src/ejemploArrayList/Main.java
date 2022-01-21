package ejemploArrayList;

import model.persona; //Importamos la clase persona

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        persona p1 = new persona(50, "Jorge", 3450.50); //Declaramos las personas DANDO SOLO LOS VALORES
        persona p2 = new persona(51, "Juan", 3450.50);
        persona p3 = new persona(52, "Jesus", 3450.50);

        List<persona> personaList = new ArrayList<>(); //Se crea una nuevea lista

        personaList.add(p1); //Agregamos cada persona a la lista
        personaList.add(p2);
        personaList.add(p3);

        for(persona persona : personaList)  //Creamos un for por cada persona
        {
            System.out.println(persona.getNombre()); //Imprimimos el nombre con persona.get.Nombre()
        }

        persona pe = personaList.get(2); //la variable pe tendrá será una persona con los datos de la persona 2 de la lista

        System.out.println("\n" + pe.getNombre() + " " + pe.getNumPersona() + " " + pe.getSueldo()); //Imprimimos todos los daos de pe
        System.out.println(pe); //Aqui igual con el override

        personaList.remove(1);

        for(persona persona : personaList)  //Creamos un for por cada persona
        {
            System.out.println(persona.getNombre()); //Verificaremos que se haya eliminado la persona 1
        }

    }
}
