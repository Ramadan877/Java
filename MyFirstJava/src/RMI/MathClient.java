package RMI;

import java.rmi.Naming;

public class MathClient {
    public static void main(String[] args) {
        try {
            // Verbindung zum entfernten Dienst herstellen
            MathService mathService = (MathService) Naming.lookup("rmi://localhost:1099/MathService");

            // Remote-Methoden aufrufen
            System.out.println("Addition (5 + 3): " + mathService.add(5, 3));
            System.out.println("Subtraktion (5 - 3): " + mathService.subtract(5, 3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


// Erklärung:
//
//Der Client verbindet sich mit dem Remote-Server, um die Dienste von MathService zu nutzen.
//Die Methode Naming.lookup("rmi://localhost:1099/MathService") wird verwendet, um das Remote-Objekt mit dem Namen "MathService" von der Registry abzurufen.
//Der String rmi://localhost:1099/MathService gibt den Host (localhost), den Port (1099) und den Objektnamen (MathService) an.
//Sobald die Verbindung hergestellt ist, können die Remote-Methoden add und subtract aufgerufen werden, genau wie bei einem lokalen Objekt.
//Die Ergebnisse der Methodenaufrufe (mathService.add(5, 3) und mathService.subtract(5, 3)) werden in der Konsole ausgegeben.