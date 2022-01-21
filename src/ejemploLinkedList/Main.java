package ejemploLinkedList;

import model.persona;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        persona p1 = new persona(50, "Jorge", 3450.50); //Declaramos las personas DANDO SOLO LOS VALORES
        persona p2 = new persona(51, "Juan", 3450.50);
        persona p3 = new persona(52, "Jesus", 3450.50);
        persona p4 = new persona(53, "Mariana", 3450.50); //Declaramos las personas DANDO SOLO LOS VALORES
        persona p5 = new persona(54, "Samantha", 3450.50);
        persona p6 = new persona(55, "Carolina", 3450.50);

        List<persona> personaList = new LinkedList<>(); //LINKED LIST

        personaList.add(p1);
        personaList.add(p2);
        personaList.add(0, p3); //En las linked list, podemos agregar valores a cierta posicion
        personaList.add(p4);
        personaList.add(p5);
        personaList.add(1, p6);

        for(persona persona : personaList) //For each persona in personaList
        {
            System.out.println(persona.getNombre());
        }

    }
}
