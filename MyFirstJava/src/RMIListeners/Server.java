package RMIListeners;


//  um eine Client-Server-Architektur zu erstellen, bei der der Server Änderungen an alle verbundenen Clients meldet. erstellen wir verschiedenen Komponenten:
// "CalculatorListener" Interface
// "CalculatorListenerImpl" Implementierungsklasse
//"Calculator" Interface
// "CalculatorImpl" Implementierungsklasse
//  "Server"-Klasse:
// "Client"-Klasse

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

// RMI-Server, der das Calculator-Objekt registriert und den Clienten zur Verfügung stellt
public class Server {
    public static void main(String[] args) {
        try {
            // Startet die RMI-Registry auf dem Standardport 1099
            LocateRegistry.createRegistry(1099);

            // dann erstellen wir das Calculator-Objekt und binden es in der RMI-Registry
            Calculator calculator = new CalculatorImpl();
            // Erstellt eine Instanz der CalculatorImpl
            Naming.rebind("rmi://localhost/CalculatorService", calculator);// Registriert den Server in der RMI-Registry unter dem Namen CalculatorService

            System.out.println("Calculator Server ist bereit.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
